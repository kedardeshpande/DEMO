package com.test.demo.annotation.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor {

	public String displayConfig() {
		
		return "2nd best processor";
	}

}
