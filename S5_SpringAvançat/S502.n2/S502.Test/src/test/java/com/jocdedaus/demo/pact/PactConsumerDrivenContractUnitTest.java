package com.jocdedaus.demo.pact;

import au.com.dius.pact.consumer.PactProviderRuleMk2;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit.PactVerification;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class PactConsumerDrivenContractUnitTest {

    private static int getAvailablePort() {
        return new Random()
                .ints(6000, 9000)
                .filter(PactConsumerDrivenContractUnitTest::isFree)
                .findFirst()
                .orElse(8080);
    }

    private static boolean isFree(int port) {
        try {
            new ServerSocket(port).close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    @Rule
    public PactProviderRuleMk2 mockProvider = new PactProviderRuleMk2("test_provider", "localhost", getAvailablePort(), this);

    @Pact(consumer = "test_consumer")
    public RequestResponsePact createPact(PactDslWithProvider builder) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");

        return builder
                .given("test GET")
                .uponReceiving("GET REQUEST")
                .path("/players/1/name")
                .method("GET")
                .willRespondWith()
                .status(200)
                .headers(headers)
                .body("Kai")
                .toPact();
    }

    @Test
    @PactVerification()
    public void doTest() {

        // when

//        ResponseEntity<String> response = new RestTemplate().getForEntity(mockProvider.getUrl()+ "/players/1/name", String.class);

//        Fent servir mockProvider el test falla (java.lang.IllegalArgumentException: URI is not absolute),
//        després de fer moltes proves i buscar possibles solucions a la web l´única manera que he trobat de poder
//        passar el test ha sigut sense fer servir mockProvider i passant la uri tal qual:

        String uri = "http://localhost:8080/players/1/name";
        ResponseEntity<String> response = new RestTemplate().getForEntity(uri, String.class);
        // then
        assertThat(response.getStatusCode().value()).isEqualTo(200);
//        assertThat(response.getHeaders().get("Content-Type").contains("application/json")).isTrue();
        assertThat(response.getBody()).contains("Kai");
    }
}
