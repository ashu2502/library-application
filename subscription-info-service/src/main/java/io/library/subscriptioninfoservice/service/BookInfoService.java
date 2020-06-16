package io.library.subscriptioninfoservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.library.subscriptioninfoservice.models.BookDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookInfoService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getFallbackBookDetail")
    public BookDetail getBookDetail(String bookId) {
        return restTemplate.getForObject("http://book-catalog-service/book/" + bookId, BookDetail.class);
    }

    public BookDetail getFallbackBookDetail(String bookId) {
        return new BookDetail("", "Book Detail Not Found", "", "", -1);
    }
}
