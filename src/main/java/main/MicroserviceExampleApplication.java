package main;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceExampleApplication {
    public static void main(String[] args) {
        String[] stringArray = {"aaa","bbb"};
        List<String> list = Arrays.asList(stringArray); 
        String [] array = list.toArray(String[]::new);
        // System.out.println(Arrays.toString(array));
        System.out.println(list);
        outerloop:
        for(int i=0;i<10;i++) {
            System.out.println(i);
            for(int j=0;j<5;j++) {
                System.out.println(j);
                continue outerloop;
            }
        }
    }
}