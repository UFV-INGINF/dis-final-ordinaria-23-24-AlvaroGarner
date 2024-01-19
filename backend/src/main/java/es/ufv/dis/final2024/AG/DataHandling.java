package es.ufv.dis.final2024.AG;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class DataHandling {
	// Función para escribir en json nueva información
	boolean addData(Naves newData){
		JsonReader reader = new JsonReader();
		try{
			ArrayList<Naves> dataList = reader.readJsonFile("backend/src/main/resources/data.json"); // Leemos fichero
			dataList.add(newData); // Añadimos la información
			reader.writeJsonFile("backend/src/main/resources/data.json", dataList);
			return true;
		}catch (Exception e){
			return false;
		}
	}
}
