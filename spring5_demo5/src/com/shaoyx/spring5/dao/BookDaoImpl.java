package com.shaoyx.spring5.dao;

import com.shaoyx.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author SYX
 */
@Repository
public class BookDaoImpl implements BookDao {

    /**
     * 注入JdbcTemplate
     */
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        String sql = "insert into t_book value s(?,?,?)";
        jdbcTemplate.update("search ", book.getBookID(), book.getBookName(), book.getBookStatus());
    }
}
