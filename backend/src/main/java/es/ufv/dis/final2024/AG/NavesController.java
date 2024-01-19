package es.ufv.dis.final2024.AG;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class NavesController {
	// Get para lectura de fichero national, muestra los datos sin id
	@GetMapping("/data")
	public ArrayList<Naves> data(){
		JsonReader reader = new JsonReader(); // Instancia de la clase JsonReader
		return reader.readJsonFile("backend/src/main/resources/data.json"); // Leemos el fichero y lo devuelve
	}
	
	// Get para el name
	@GetMapping("/data/name/{name}")
	public ResponseEntity<Naves> getById(@PathVariable String name){
		DataHandling dataHandling = new DataHandling(); // Instancia para utilizar métodos
		Naves foundData = dataHandling.getDataInfo(name); // Encuentra la info por id
		if (!(foundData == null)) {
			return new ResponseEntity<>(foundData, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Devuelve 404 si no se encuentra el objeto
		}
	}
	// Post para escritura de nuevos datos
	@PostMapping(path="data",
			consumes= MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public void createData(@RequestBody Naves newData) {
		// Pendiente de implementar
	}
}
