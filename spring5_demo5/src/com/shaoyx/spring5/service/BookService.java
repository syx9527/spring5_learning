package com.shaoyx.spring5.service;

import com.shaoyx.spring5.dao.BookDao;
import com.shaoyx.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
     *
     * @param book book
     */
    public void addBook(Book book) {
        bookDao.add(book);
    }

    /**
     * 修改
     *
     * @param book book
     */
    public void updateBook(Book book) {
        bookDao.update(book);
    }

    /**
     * 删除
     *
     * @param bookId bookId
     */
    public void deleteBook(String bookId) {
        bookDao.delete(bookId);
    }

    /**
     * 查询记录总数
     */
    public int findBookCount() {
        return bookDao.selectCount();
    }

    /**
     * 查询返回对象by id
     */
    public Book findBookById(String id) {
        return bookDao.findBookInfoById(id);
    }

    /**
     * 查询返回对象by id
     */
    public List<Book> findAllBooks() {
        return bookDao.findAllBook();
    }

    /**
     * 批量添加
     */
    public void batchAdd(List<Object[]> batchArgs) {
        bookDao.batchAddBook(batchArgs);
    }

    /**
     * 批量修改
     */
    public void batchUpdate(List<Object[]> batchArgs) {
        bookDao.batchUpdateBook(batchArgs);
    }

    /**
     * 批量删除
     */
    public void batchDelete(List<Object[]> batchArgs) {
        bookDao.batchDeleteBook(batchArgs);
    }


}
