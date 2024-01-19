package org.vaadin.example;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API {
    private static final String urlPrefixList = "http://localhost:8090/data"; // URL con la lista completa


    // Lista entera de ficher.json
    public String getDataSW() throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder() // Builder de la request
                .uri(new URI(urlPrefixList))
                .GET()
                .build();

        HttpResponse<String> response = HttpClient // Respuesta de la URL
                .newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

}
