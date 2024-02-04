package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fid;
	private String fname;
	private String femail;
	private String ffeedback;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFemail() {
		return femail;
	}
	public void setFemail(String femail) {
		this.femail = femail;
	}
	public String getFfeedback() {
		return ffeedback;
	}
	public void setFfeedback(String ffeedback) {
		this.ffeedback = ffeedback;
	}
	@Override
	public String toString() {
		return "Feedback [fid=" + fid + ", fname=" + fname + ", femail=" + femail + ", ffeedback=" + ffeedback + "]";
	}
	
}
