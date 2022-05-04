package com.spring.S501.controller;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.json.JSONException;
import org.springframework.boot.web.server.LocalServerPort;

import com.spring.S501.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WhiteCollarShopControllerTest {

    @LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();

    HttpHeaders headers = new HttpHeaders();

    @Test  //Test integració
    public void testGetShop() throws JSONException {
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);

        ResponseEntity<String> response = restTemplate.exchange(createURLWithPort("/shops/2"), HttpMethod.GET, entity,
                String.class);

        String expected = "{\"shopId\":2,\"shopName\":\"Shop2\",\"capacity\":222,\"picturesDto\":[{\"pictureId\":2," +
                "\"pictureName\":\"Tramuntana\",\"authorName\":\"Anonymous\",\"price\":999.99,\"date\":[2022,3,22]," +
                "\"plainShopDto\":{\"shopId\":2,\"shopName\":\"Shop2\",\"capacity\":222}}]}";

        JSONAssert.assertEquals(expected, response.getBody(), false);
    }

    private String createURLWithPort(String uri) {

        return "http://localhost:" + port + uri;
    }
}
