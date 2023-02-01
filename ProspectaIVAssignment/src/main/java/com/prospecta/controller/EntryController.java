package com.prospecta.controller;

import java.util.List;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prospecta.dto.EntryDataDTO;
import com.prospecta.exception.EntryDataException;
import com.prospecta.model.EntryData;
import com.prospecta.service.DataService;

@RestController
public class EntryController {
	
	private DataService dataService;
	
	@GetMapping("/{category}")
	public ResponseEntity<List<EntryDataDTO>>getResultInListbyCategory(@PathVariable String category)throws EntryDataException{
		List<EntryDataDTO> list = dataService.getResultsInListbyCategory(category);
		return new ResponseEntity<List<EntryDataDTO>>(list,HttpStatus.OK);
	}
	
	@PostMapping("/addEntry")
	public ResponseEntity<EntryData> addEntity(@RequestBody EntryData entryData) throws EntryDataException{
		EntryData entry = dataService.addEntry(entryData);
		return new ResponseEntity<EntryData>(entry,HttpStatus.CREATED);
	}
}
