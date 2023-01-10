package com.shaoyx.spring5.dao;

import com.shaoyx.spring5.entity.Book;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author SYX
 */
@Repository
public class BookDaoImpl implements BookDao {

    /**
     * 注入JdbcTemplate
     */
    private final JdbcTemplate jdbcTemplate;

    public BookDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * 新增
     *
     * @param book book
     */
    @Override
    public void add(Book book) {
        String sql = "insert into t_book values(?,?,?)";
        int update = jdbcTemplate.update(sql, book.getBookId(), book.getBookName(), book.getBookStatus());
        System.out.println(update);
    }

    /**
     * 修改
     *
     * @param book book
     */
    @Override
    public void update(Book book) {
        String sql = "update t_book set book_name=?,book_status=? where book_id=?";
        int update = jdbcTemplate.update(sql, book.getBookName(), book.getBookStatus(), book.getBookId());
        System.out.println(update);
    }

    /**
     * 删除
     *
     * @param bookId bookId
     */
    @Override
    public void delete(String bookId) {
        String sql = "delete  from t_book where book_id=?";
        int update = jdbcTemplate.update(sql, bookId);
        System.out.println(update);
    }

    /**
     * 查询表中的记录数
     */
    @Override
    public int selectCount() {

        String sql = "SELECT COUNT(*) FROM t_book";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    /**
     * 查询返回对象by id
     */
    @Override
    public Book findBookInfoById(String id) {
        String sql = "SELECT * from t_book where book_id=?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class), id);
    }

    /**
     * 所有图书信息
     *
     * @return List<Book>
     */
    @Override
    public List<Book> findAllBook() {
        String sql = "select * from t_book";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
    }

    /**
     * 批量添加
     *
     * @param batchArgs 批量数据
     */
    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";

        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * 批量修改
     *
     * @param batchArgs 批量修改数据
     */
    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {
        String sql = "update t_book set book_name=?,book_status=? where book_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * 批量删除
     *
     * @param batchArgs 批量删除Id
     */
    @Override
    public void batchDeleteBook(List<Object[]> batchArgs) {
        String sql = "delete  from t_book where book_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
