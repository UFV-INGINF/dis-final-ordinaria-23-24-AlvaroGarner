package es.ufv.dis.final2024.AG;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class JsonReader {
	//método de lectura de Json
	public ArrayList<NavesRaritas> readJsonFile(String fichero){
		try {
			//lee el fichero que le pasemos y lo carga en un reader
			Reader reader = Files.newBufferedReader(Paths.get(fichero)); // asignamos un reader
			// convierte el array JSON a un arraylist, ya que son varios

			//ArrayList contiene información según clase NavesRaritas, que será leída en json
			ArrayList<NavesRaritas> data = new Gson().fromJson(reader, new TypeToken<ArrayList<NavesRaritas>>() {}.getType()); //utilizamos Gson
			reader.close();// cierra el reader
			return data;

		} catch (Exception ex) {
			ex.printStackTrace();
			return new ArrayList<>(); //si no ha leido nada, devuelve un array vacío
		}
	}

	// Función para escribir JSON
	public boolean writeJsonFile(String fichero, ArrayList<NavesRaritas> data){
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
