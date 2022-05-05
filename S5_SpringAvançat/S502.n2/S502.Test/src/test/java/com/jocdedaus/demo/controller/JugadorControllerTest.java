package com.jocdedaus.demo.controller;

import com.jocdedaus.Application;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class JugadorControllerTest {

    @LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();

    HttpHeaders headers = new HttpHeaders();

    @Test
    public void testGetJugador() throws JSONException {
        HttpEntity<String> entity = new HttpEntity<>(null, headers);

        ResponseEntity response = restTemplate.exchange(createURLWithPort("/players/1"), HttpMethod.GET, entity, String.class);

        String expected = "{\"jugadorId\":1,\"name\":\"Kai\",\"date\":\"2022-04-16\",\"partidesDto\":[{\"partidaId\":1},{\"partidaId\":2},{\"partidaId\":3},{\"partidaId\":4},{\"partidaId\":5},{\"partidaId\":6},{\"partidaId\":7},{\"partidaId\":8}]}";

        JSONAssert.assertEquals(expected, (String) response.getBody(), false);
    }

    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
}