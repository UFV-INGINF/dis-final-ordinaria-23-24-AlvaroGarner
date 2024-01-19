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

	// Post para escritura de nuevos datos
	@PostMapping(path="data",
			consumes= MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public void createData(@RequestBody Naves newData) {
		// Pendiente de implementar
	}
}
