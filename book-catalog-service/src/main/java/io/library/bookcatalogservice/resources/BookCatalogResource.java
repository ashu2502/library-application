package io.library.bookcatalogservice.resources;

import io.library.bookcatalogservice.models.BookDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{bookId}")
    public BookDetail getBook(@PathVariable("bookId") String bookId) {
        return new BookDetail(bookId, "The Trial", "Story of modern judiciary","Franz Kafka", 4);
    }

    /*@RequestMapping("/{searchQuery}")
    public List<BookDetail> getBookFromName(@PathVariable("searchQuery") String searchQuery) {
        //return new BookDetail(searchQuery, "The Trial", "Story of modern judiciary","Franz Kafka", 4);
        //restTemplate.getForObject("https://www.googleapis.com/books/v1?q="+searchQuery+"&API_KEY=AIzaSyA5Yv1jyklrf1cwpJ-EvgUBS9gnoMl80Ec", );
    }*/
}
