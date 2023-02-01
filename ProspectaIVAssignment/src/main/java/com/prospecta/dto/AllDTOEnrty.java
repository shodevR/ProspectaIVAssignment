package com.prospecta.dto;

import java.io.Serializable;
import java.util.List;

import com.prospecta.model.EntryData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllDTOEnrty implements Serializable{

	private Integer count;
	
	private List<EntryData> entryDatas;
}
