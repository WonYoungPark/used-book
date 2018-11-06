package me.gyenam05.usedbook.store;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by wyparks2@gmail.com on 2018. 10. 13.
 * Blog : http://WonYoungPark.github.io
 * Github : http://github.com/WonYoungPark
 */
@Getter
@Entity
@Table(name = "store")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Store {
    @Id
    @GeneratedValue
    private Integer id;

    private String code;

    private String name;
}
