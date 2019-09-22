package kz.iitu.jd3.bookratings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @GetMapping("/{bookId}")
    public Rating getRatingByBookId(
            @PathVariable("bookId") String bookId) {

        return new Rating(bookId, 5);
    }
}
