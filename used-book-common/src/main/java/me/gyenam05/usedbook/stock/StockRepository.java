package me.gyenam05.usedbook.stock;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wyparks2@gmail.com on 2018. 10. 13.
 * Blog : http://WonYoungPark.github.io
 * Github : http://github.com/WonYoungPark
 */
public interface StockRepository extends JpaRepository<Stock, Integer> {

}
