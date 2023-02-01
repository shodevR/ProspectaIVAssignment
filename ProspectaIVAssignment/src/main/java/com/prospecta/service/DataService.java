package com.prospecta.service;

import java.util.List;

import com.prospecta.dto.EntryDataDTO;
import com.prospecta.exception.EntryDataException;
import com.prospecta.model.EntryData;

public interface DataService {

	
	public List<EntryDataDTO>getResultsInListbyCategory(String category)throws EntryDataException;
	
	public EntryData addEntry(EntryData entry) throws EntryDataException;
	
}
