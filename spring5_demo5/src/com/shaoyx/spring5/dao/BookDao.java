package com.shaoyx.spring5.dao;

import com.shaoyx.spring5.entity.Book;

import java.util.List;

/**
 * @author SYX
 */
public interface BookDao {

    /**
     * 新增
     *
     * @param book book
     */
    void add(Book book);

    /**
     * 编辑
     *
     * @param book book
     */
    void update(Book book);

    /**
     * 删除
     *
     * @param id Book_id
     */
    void delete(String id);

    /**
     * 查询表中的记录数
     *
     * @return count
     */
    int selectCount();

    /**
     * 查询返回对象by id
     *
     * @param id book_id
     * @return Book
     */
    Book findBookInfoById(String id);

    /**
     * 所有图书信息
     *
     * @return List<Book>
     */
    List<Book> findAllBook();

    /**
     * 批量添加
     *
     * @param batchArgs 批量数据
     */
    void batchAddBook(List<Object[]> batchArgs);

    /**
     * 批量修改
     *
     * @param batchArgs 批量修改数据
     */
    void batchUpdateBook(List<Object[]> batchArgs);

    /**
     * 批量删除
     *
     * @param batchArgs 批量删除Id
     */
    void batchDeleteBook(List<Object[]> batchArgs);
}
