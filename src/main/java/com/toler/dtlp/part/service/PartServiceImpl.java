package com.toler.dtlp.part.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toler.dtlp.part.domain.Part;
import com.toler.dtlp.part.exception.NoPartException;
import com.toler.dtlp.part.dao.PartDao;

@Service
public class PartServiceImpl implements PartService {

	@Autowired
	private PartDao partDao;
	
	@Override
	public Part getPartById(Long id) {
		Part part = partDao.findOne(id);
		if (part == null) {
			throw new NoPartException(id);
		}
		return part;
	}

}
