package com.uca.capas.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {
	
	@AssertTrue(message="¡Ups! no puedes agregar producto porque eres un robot, favor hacer click en REGRESAR")
	private Boolean soyRobot;

	public Robot() {
		super();
	}

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}
	
	
}