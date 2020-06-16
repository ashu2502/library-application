package io.library.subscriptioninfoservice.resources;

import io.library.subscriptioninfoservice.models.SubscriptionDetail;
import io.library.subscriptioninfoservice.service.BookInfoService;
import io.library.subscriptioninfoservice.service.SubscriberInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@EnableHystrix
@RequestMapping("/subscription")
public class SubscriptionResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private BookInfoService bookInfo;

    @Autowired
    private SubscriberInfoService subscriberInfo;

    @RequestMapping("/{subscriberId}")
    public List<SubscriptionDetail> getSubscriptionDetails(@PathVariable("subscriberId") String subscriberId) {
        // get all subscription IDs
        List<SubscriptionDetail> subscriptionDetails = Arrays.asList(new SubscriptionDetail("pern1","book1", new Date())
                , new SubscriptionDetail("pern2","book2", new Date()));

        // for each, call the other 2 services to collate book and subscriber detail
        return subscriptionDetails.stream().map(subscriptionDetail -> {
            subscriptionDetail.setBookDetail(bookInfo.getBookDetail(subscriptionDetail.getBookId()));
            subscriptionDetail.setSubscriberDetail(subscriberInfo.getSubscriberDetail(subscriptionDetail.getSubscriberId()));
            return subscriptionDetail;
        }).collect(Collectors.toList());
    }


}
