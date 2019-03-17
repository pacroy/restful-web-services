package me.chairat.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Helll World!");
    }

    @GetMapping("/hello-world/path-variable/{name}")
    public HelloWorldBean HelloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Helll World, %s!", name));
    }
}
