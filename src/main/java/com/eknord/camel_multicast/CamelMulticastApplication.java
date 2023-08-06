package com.eknord.camel_multicast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigurationProperties
@EnableAutoConfiguration
public class CamelMulticastApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelMulticastApplication.class, args);
	}

}
