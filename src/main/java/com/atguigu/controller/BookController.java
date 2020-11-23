package com.atguigu.controller;

import com.atguigu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author sunzhipeng
 * @create 2020-11-12 22:32
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

}
