package me.gyenam05.usedbook.book;

import lombok.RequiredArgsConstructor;
import me.gyenam05.usedbook.book.BookDetailResponseDto;
import me.gyenam05.usedbook.book.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wyparks2@gmail.com on 2018. 10. 13.
 * Blog : http://WonYoungPark.github.io
 * Github : http://github.com/WonYoungPark
 */
@RequiredArgsConstructor
@RequestMapping("/books")
@RestController
public class BookController {

    private BookService bookService;

    @GetMapping
    public List<BookDetailResponseDto> getBooks() {
        BookService bookService = new BookService();
        return null;
    }
}
