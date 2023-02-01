package com.prospecta.sevriceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;


import com.prospecta.dto.AllDTOEnrty;
import com.prospecta.dto.EntryDataDTO;
import com.prospecta.exception.EntryDataException;
import com.prospecta.model.EntryData;
import com.prospecta.repository.RepoEntry;
import com.prospecta.service.DataService;

public class DataServicesImp implements DataService{

	
	@Autowired
	private RepoEntry repoEntry;
	
	

	@Override
	public List<EntryDataDTO> getResultsInListbyCategory(String category) throws EntryDataException {
		// TODO Auto-generated method stub
		final String urlEntries = "https://api.publicapis.org/entries";
		RestTemplate restTemplate = new RestTemplate();
		AllDTOEnrty allDTOEnrty = restTemplate.getForObject(urlEntries, AllDTOEnrty.class);
		
		List<EntryDataDTO> list =new ArrayList<>();
		
		for(EntryData d : allDTOEnrty.getEntryDatas()) {
			if(d.getCategory().equals(category)) {
				list.add(new EntryDataDTO(d.getAPI(), d.getDescription()));
				
			}
		}
		if(list.size()==0) {
			throw new EntryDataException("No entries found by category "+ category);
		}
		return list;
		
	}

	
	@Autowired
	private EntryDataDTO entyrDataDTO;

	@Override
	public EntryData addEntry(EntryData entry) throws EntryDataException{		
//		EntryData addEntryData=entyrDataDTO.(entry);
		
		return null;
	}
	
	
	
	
	
	
}
