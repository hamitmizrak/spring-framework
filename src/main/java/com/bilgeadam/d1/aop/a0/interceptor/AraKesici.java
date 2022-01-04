package com.bilgeadam.d1.aop.a0.interceptor;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@InterceptorKesici
@Named
@ApplicationScoped
public class AraKesici {
	
	public String araKesiciMethod(String data) {
		return "Normal" + data;
	}
}
