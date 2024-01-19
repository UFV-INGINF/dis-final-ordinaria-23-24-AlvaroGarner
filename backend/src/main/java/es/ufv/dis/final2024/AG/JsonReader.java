package es.ufv.dis.final2024.AG;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class JsonReader {
	//método de lectura de Json
	public ArrayList<Naves> readJsonFile(String fichero){
		try {
			//lee el fichero que le pasemos y lo carga en un reader
			Reader reader = Files.newBufferedReader(Paths.get(fichero)); // asignamos un reader
			// convierte el array JSON a un arraylist, ya que son varios

			//ArrayList contiene información según clase Naves, que será leída en json
			ArrayList<Naves> data = new Gson().fromJson(reader, new TypeToken<ArrayList<Naves>>() {}.getType()); //utilizamos Gson
			reader.close();// cierra el reader
			return data;

		} catch (Exception ex) {
			ex.printStackTrace();
			return new ArrayList<>(); //si no ha leido nada, devuelve un array vacío
		}
	}

	// Función para escribir JSON
	public boolean writeJsonFile(String fichero, ArrayList<Naves> data){
		try{
			Writer writer = Files.newBufferedWriter(Paths.get(fichero));
			writer.write(new Gson().toJson(data)); // Escribimos el fichero con el arraylist correspondiente
			writer.close();
			return true;
		}catch (Exception ex){
			ex.printStackTrace();
			return false;
		}
	}

}
