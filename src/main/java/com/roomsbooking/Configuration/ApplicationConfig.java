package com.roomsbooking.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.roomsbooking"})
@PropertySource("classpath:com/roomsbooking/Configuration/config.properties")

public class ApplicationConfig {
	

}
