package com.prospecta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prospecta.model.EntryData;

@Repository
public interface RepoEntry extends JpaRepository<EntryData, String>{
	
}
