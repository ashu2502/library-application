package io.library.subscriptioninfoservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import io.library.subscriptioninfoservice.models.SubscriberDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SubscriberInfoService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getFallbackSubscriberDetail",
                    commandProperties = {
                                @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
                                @HystrixProperty(name="circuitBreaker.requestVolumeThreshold", value = "5"),
                                @HystrixProperty(name="circuitBreaker.errorThresholdPercentage", value = "50"),
                                @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds", value = "15000")
                    })
    public SubscriberDetail getSubscriberDetail(String subscriberId) {
        return restTemplate.getForObject("http://subscriber-info-service/subscriber/" + subscriberId, SubscriberDetail.class);
    }

    public SubscriberDetail getFallbackSubscriberDetail(String subscriberId) {
        return new SubscriberDetail("", "Subscriber Detail Not Found", "", "");
    }

}
