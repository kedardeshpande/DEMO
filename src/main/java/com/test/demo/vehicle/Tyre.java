package com.test.demo.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	private String make;
	private String color;


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "Tyre [make=" + make + "]";
	}

	
	
}
