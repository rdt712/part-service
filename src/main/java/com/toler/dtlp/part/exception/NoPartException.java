package com.toler.dtlp.part.exception;

public class NoPartException extends RuntimeException {

	private static final long serialVersionUID = 1561780458992630890L;
	
	private long partId;
	
	public NoPartException(long partId) {
		this.partId = partId;
	}
	
	public long getPartId() {
		return partId;
	}
	
	public void setPartId(long partId) {
		this.partId = partId;
	}
}
