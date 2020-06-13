package io.library.subscriptioninfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SubscriptionInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubscriptionInfoServiceApplication.class, args);
	}

}
