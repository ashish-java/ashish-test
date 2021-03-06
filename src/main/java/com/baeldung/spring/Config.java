package com.baeldung.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.baeldung.spring")
public class Config {
 
	@Bean
    public Warranty warranty() {
        return new Warranty("1 Year Onsite Maintenance");
    }
	
	@Bean
	public Accessories accessories(){
		Accessories accessories = new Accessories();
		accessories.setName("Power Cable");
		return accessories;
	}
}
