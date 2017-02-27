package com.toler.dtlp.part.domain;

import java.util.List;

public class PartResponse {

	private List<Part> parts;
	
	public PartResponse() { }

	public PartResponse(List<Part> parts) {
		this.parts = parts;
	}

	public List<Part> getParts() {
		return parts;
	}

	public void setParts(List<Part> parts) {
		this.parts = parts;
	}
}
