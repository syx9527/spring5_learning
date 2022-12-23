package com.shaoyx.spring5;

/**
 * 演示使用set方法进行属性注入
 *
 * @author SYX
 */
public class Book {

    // 创建属性
    private String bookName;
    private String bookAuthor;
    private String address;

    public Book() {
    }

    // 创建属性对应的set方法
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testDemo() {
        System.out.println(bookName + "::" + bookAuthor + "::" + address);
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("java从入门到弃坑");

    }
}
