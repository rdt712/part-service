package com.toler.dtlp.part.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.toler.dtlp.part.dao.PartDao;
import com.toler.dtlp.part.domain.Part;
import com.toler.dtlp.part.domain.PartResponse;
import com.toler.dtlp.part.service.PartService;

@RestController
public class PartController {

	@Autowired
	private PartDao partDao;
	
	@Autowired
	private PartService partService;
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public Part getPart(@PathVariable long id) {
		return partService.getPartById(id);
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public PartResponse getAllParts() {
		return new PartResponse(partDao.findAll());
	}
}
