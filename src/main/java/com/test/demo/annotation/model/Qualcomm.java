package com.test.demo.annotation.model;

import org.springframework.stereotype.Component;

@Component
public class Qualcomm implements MobileProcessor {

	public String displayConfig() {
		return "RAM 2 GB, Core 1.";

	}

}
