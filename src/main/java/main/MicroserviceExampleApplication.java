package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
 
@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceExampleApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello from microservice!";
    }
}