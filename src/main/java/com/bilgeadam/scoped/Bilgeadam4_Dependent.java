package com.bilgeadam.scoped;

import java.io.Serializable;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

// dependent: default gelir. Hangi classta @Inject edilmişse o classa bürünür
// yani bukelemon gibi
@Named
@Dependent
public class Bilgeadam4_Dependent implements Serializable {
	private static final long serialVersionUID = -3112160708263140526L;
	
	public String getScoped() {
		return "applicationScoped:" + hashCode();
	}
}
