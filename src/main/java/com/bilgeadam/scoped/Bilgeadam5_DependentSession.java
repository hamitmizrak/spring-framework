package com.bilgeadam.scoped;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

// bütün kullanıcıdır kulalnıcı için geçerlidir.
// Aynı browserda yaşar farklı browserda yaşamaz
// sessionscope implements yazılmalıdır.
@Named
@ApplicationScoped
public class Bilgeadam5_DependentSession implements Serializable {
	private static final long serialVersionUID = -3112160708263140526L;
	
	@Inject
	Bilgeadam4_Dependent dependent;
}
