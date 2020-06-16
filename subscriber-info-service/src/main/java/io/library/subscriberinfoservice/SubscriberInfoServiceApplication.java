package io.library.subscriberinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SubscriberInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubscriberInfoServiceApplication.class, args);
	}

}
