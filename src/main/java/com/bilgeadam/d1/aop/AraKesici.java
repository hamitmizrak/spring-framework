package com.bilgeadam.d1.aop;

@InterceptorKesici
public class AraKesici {
	
	public String araKesiciMethod(String data) {
		return "Normal" + data;
	}
}
