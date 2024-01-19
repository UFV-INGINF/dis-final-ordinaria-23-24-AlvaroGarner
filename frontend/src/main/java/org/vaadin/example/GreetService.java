package org.vaadin.example;

import com.google.gson.Gson;

import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.util.ArrayList;

@Service
public class GreetService implements Serializable {

    // Función que devuelve un arraylist con todos los datos de la API
    public ArrayList<Naves> getDataList() throws URISyntaxException, IOException, InterruptedException {
        API api = new API();
        String resultsAPI = api.getDataSW(); // LLamamos a la función para devolver todos los datos de la API
        Type listType = new TypeToken<ArrayList<Naves>>() {}.getType(); // Creamos un arraylist para utilizar Gs
        return new Gson().fromJson(resultsAPI, listType); // Transformamos el objeto JSON a un arraylist Java
    }

}
