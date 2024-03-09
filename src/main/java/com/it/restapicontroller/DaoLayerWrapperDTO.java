package com.it.restapicontroller;

import java.util.ArrayList;
import java.util.List;

public class DaoLayerWrapperDTO {
	private List<?> signup= new ArrayList<>();
	private String code;
	private String message;
	public List<?> getSignup() {
		return signup;
	}
	public void setSignup(List<?> signup) {
		this.signup = signup;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
	
	

}
