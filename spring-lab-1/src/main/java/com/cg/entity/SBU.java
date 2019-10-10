package com.cg.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "sbu")
public class SBU {
	private int sbuId;
	private String sbuName;
	private String sbuHead;
	
	public int getSbuId() {
		return sbuId;
	}
	
	@Value("1001")
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	
	public String getSbuName() {
		return sbuName;
	}
	
	@Value("Kiran Rao")
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	
	public String getSbuHead() {
		return sbuHead;
	}
	
	@Value("Product Engineering Services")
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	
	
	
}
