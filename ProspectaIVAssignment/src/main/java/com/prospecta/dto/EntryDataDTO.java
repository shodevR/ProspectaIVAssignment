package com.prospecta.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntryDataDTO {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer entryId;
	
	private String title;
	private String description;
	
}
