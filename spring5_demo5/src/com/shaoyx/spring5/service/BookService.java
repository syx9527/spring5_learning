package com.shaoyx.spring5.service;

import com.shaoyx.spring5.dao.BookDao;
import com.shaoyx.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author SYX
 */
@Service
public class BookService {
    /**
     * 注入dao
     */
    @Autowired
    private BookDao bookDao;

    /**
     * 新增
     * @param book book
     */
    public void addBook(Book book) {
        bookDao.add(book);
    }

}
