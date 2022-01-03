package com.bilgeadam.scoped;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

// sadece 1 istek boyunca çalışır ve sonra ölür
// alışveriş sitesi: sepet ürünlerini
// performans düşüklüğüe sebeb oalbilir.
@Named
@RequestScoped
public class Bilgeadam1 {
	
	public String getRequest() {
		return "request:" + hashCode();
	}
}
