package com.toler.dtlp.part.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.toler.dtlp.part.domain.Part;

public interface PartDao extends JpaRepository<Part, Long> {
	
	public List<Part> findByComputerId(Long computerId);
}
