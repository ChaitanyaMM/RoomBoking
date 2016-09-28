package com.roomsbooking.Controller;


import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

 import com.roomsbooking.Service.RoomService;

@RestController
@RequestMapping("room")
public class RoomController{
	private static final Logger logger = Logger.getLogger(RoomController.class);

	public static final String APPLICATION_JSON = "application/json";
//	 @Autowired
//	 private RoomService roomservice;
 
   @RequestMapping(value ="/sample",method = RequestMethod.GET)
   public String printHello() {
	     System.out.println("sample services is Calling");
       return "hello";
   }
//   @RequestMapping(path ="room/sample1",method = RequestMethod.GET)
//   public String printHello1(ModelMap model) {
//      model.addAttribute("message", "Hello Spring MVC Framework!");
//
//      return "Hai THis it Room ";
//   }
	 
//   @RequestMapping(value ="room/sample3",method = RequestMethod.GET)
//   public ResponseEntity<Map<String, Object>> SampleService(ModelMap model) {
//	   System.out.println("hiiiiiiiiii");
//      model.addAttribute("message", "Hello Spring MVC Framework!");
//      Map<String,Object> responce = new HashMap<String,Object>();
//    //  String sample= roomservice.sample();
//      responce.put("HAI", sample);
//
//      return new ResponseEntity<Map<String, Object>>(responce, HttpStatus.OK);
//   }
 
 
	

}