package es.ufv.dis.final2024.AG;

import java.util.ArrayList;

public class DataHandling {
	// Función para escribir en json nueva información
	// Función para encontrar la info por nombre
	public Naves getDataInfo (String name){
		Naves foundData = null;
		JsonReader reader = new JsonReader();

		ArrayList<Naves> dataList = reader.readJsonFile("backend/src/main/resources/data.json"); // Lee el archivo JSON
		for (Naves dataNat : dataList){
			// Compara que los ID sean iguales
			if (dataNat.getName().equalsIgnoreCase(name)){
				foundData = dataNat;
			}
		}
		return foundData;
	}
}
