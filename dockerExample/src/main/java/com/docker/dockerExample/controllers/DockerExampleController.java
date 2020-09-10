package com.docker.dockerExample.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.dockerExample.entity.Greeting;

@RestController // This means that this class is a Controller
@RequestMapping(path = "/") // This means URL's start with /demo (after Application path)
public class DockerExampleController {

	
	private static final String template = "Hello, world!";
    private final AtomicLong counter = new AtomicLong();

   @CrossOrigin("*")
    @RequestMapping("/greeting")
    public Greeting greeting() {
         return new Greeting(counter.incrementAndGet(), template);
    }
}
