package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceExampleApplication {
    public static void main(String[] args) {
        String str = "aaa.bbb";
        System.out.println(str.split("[.]").length);
    }
    ThreadLocal<String> threadLocal = ThreadLocal.withInitial(() ->"aa");
    @RequestMapping("/hello")
    public String hello() {
        return "Hello from microservice!";
    }
}