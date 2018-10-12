package com.test.demo.annotation.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

		@Autowired
		@Qualifier("mediaTek")
		MobileProcessor mu;
		
		@Override
		public String toString() {
			return mu.displayConfig();
		}
		public MobileProcessor getMu() {
			return mu;
		}
		public void setMu(MobileProcessor mu) {
			this.mu = mu;
		}
		public void config()
		{
			System.out.println("xxxxxxx");
		}
}
