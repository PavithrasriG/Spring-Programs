package com.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Realme {
	
	@Autowired
	//@Qualifier("snapDragon")
	@Qualifier("mediaTek")
	
	MobileProcessor cpu;

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void PhoneConfig() {
		System.out.println("RAM 8GB Dual core 128px");
		cpu.process();
		
	}
	
	
	

}
