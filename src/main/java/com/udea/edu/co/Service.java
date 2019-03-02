package com.udea.edu.co;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class Service {
		@RequestMapping(value= "/{nombre}", method = RequestMethod.GET)
		public String saludo(@PathVariable String nombre) {
			return "Hola " + nombre +"!.";
		}

}
