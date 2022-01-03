package com.bilgeadam.scoped;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

// 1 kulalnıcı için geçerlidir.
// Aynı browserda yaşar farklı browserda yaşamaz
// sessionscope implements yazılmalıdır.
@Named
@SessionScoped
public class Bilgeadam2 implements Serializable {
	private static final long serialVersionUID = -3112160708263140526L;
	
	public String getScoped() {
		return "session:" + hashCode();
	}
}
