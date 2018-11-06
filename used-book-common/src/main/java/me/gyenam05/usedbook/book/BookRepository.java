package me.gyenam05.usedbook.book;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wyparks2@gmail.com on 2018. 10. 13.
 * Blog : http://WonYoungPark.github.io
 * Github : http://github.com/WonYoungPark
 */
public interface BookRepository extends JpaRepository<Book, Integer> {

}
