package io.library.subscriberinfoservice.resources;

import io.library.subscriberinfoservice.models.SubscriberDetail;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subscriber")
public class SubscriberResource {
    @RequestMapping("/{subscriberId}")
    public SubscriberDetail getSubscriber(@PathVariable("subscriberId") String subscriberId) {
        return new SubscriberDetail(subscriberId, "Ashu", "Pune", "1234");
    }
}
