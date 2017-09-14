package ru.alcereo.eurekacli.config;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by alcereo on 14.09.17.
 */
@Configuration
@Profile("server")
@EnableEurekaServer
public class EurekaServerConfig {
}
