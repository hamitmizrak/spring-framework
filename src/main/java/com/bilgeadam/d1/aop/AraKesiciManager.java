package com.bilgeadam.d1.aop;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("interceptorCdi")
@ApplicationScoped
public class AraKesiciManager implements Serializable {
	private static final long serialVersionUID = 6919152730411650191L;
	
	@Inject
	private AraKesici araKesici;
	
	public String araKesiciManagerMethod(String data) {
		return araKesici.araKesiciMethod(data) + " hashcode: " + hashCode();
	}
}
