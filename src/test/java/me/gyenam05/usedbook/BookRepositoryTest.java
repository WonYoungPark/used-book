package me.gyenam05.usedbook;

import me.gyenam05.usedbook.book.Book;
import me.gyenam05.usedbook.book.BookRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by wyparks2@gmail.com on 2018. 11. 6.
 * Blog : http://WonYoungPark.github.io
 * Github : http://github.com/WonYoungPark
 */
@DataJpaTest
@RunWith(SpringRunner.class)
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void 조회() {
        List<Book> books = bookRepository.findAll();
    }

    @Test
    public void 저장() {
        Book newBook = Book.builder()
                           .isbn("isbn")
                           .author("author")
                           .publisher("publisher")
                           .name("name")
                           .build();

        bookRepository.save(newBook);

        Assert.assertTrue(bookRepository.findAll().size() > 0);
    }
}
