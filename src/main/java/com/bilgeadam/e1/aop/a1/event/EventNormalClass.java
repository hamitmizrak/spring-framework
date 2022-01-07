package com.bilgeadam.e1.aop.a1.event;

import javax.enterprise.event.Observes;

public class EventNormalClass {
	
	public void actionMethod(@Observes EventData data) {
		System.out.println("Merhabalar: " + data.getName());
	}
}
