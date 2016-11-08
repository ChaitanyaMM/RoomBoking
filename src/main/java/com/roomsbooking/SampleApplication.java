
package com.roomsbooking;

public class SampleApplication {

	@RequestMapping("/")
	public String home(){
		return "Hello World!";
	}
	
	public static void main(String[] args){
		SpringApplication.run(SampleApplication.class, args);
	}