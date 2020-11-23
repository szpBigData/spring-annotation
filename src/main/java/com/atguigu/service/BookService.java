package com.atguigu.service;

import com.atguigu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sunzhipeng
 * @create 2020-11-12 22:32
 */
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public void print(){
        System.out.println(bookDao);
    }
}
