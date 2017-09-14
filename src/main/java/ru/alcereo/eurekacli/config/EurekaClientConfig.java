package ru.alcereo.eurekacli.config;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alcereo on 14.09.17.
 */
@Configuration
@Profile("client")
@EnableEurekaClient
@RestController
public class EurekaClientConfig {

    @GetMapping
    public String getTest(){
        return "Ok!!";
    }

}
