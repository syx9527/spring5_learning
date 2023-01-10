package com.shaoyx.spring5.test;

import com.shaoyx.spring5.entity.Book;
import com.shaoyx.spring5.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SYX
 */
public class TestBook {

    @Test
    public void testJdbcTemplateAdd() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        bookService.addBook(new Book("1", "Java", "1"));
        bookService.addBook(new Book("2", "Python", "1"));
        bookService.addBook(new Book("3", "Mysql", "0"));
        bookService.addBook(new Book("4", "Spring", "1"));

    }

    @Test
    public void testJdbcTemplateUpdate() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setBookId("1");
        book.setBookName("JAVA");
        book.setBookStatus("1");
        bookService.updateBook(book);

    }

    @Test
    public void testJdbcTemplateDelete() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setBookId("4");
        bookService.deleteBook(book.getBookId());

    }

    @Test
    public void testJdbcTemplateSelectCount() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        int count = bookService.findBookCount();
        System.out.println(count);

    }

    @Test
    public void testJdbcTemplateFindBookInfoById() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = bookService.findBookById("1");
        System.out.println(book);

    }

    @Test
    public void testJdbcTemplateFindAllBooks() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        List<Book> allBooks = bookService.findAllBooks();
        allBooks.forEach(book -> System.out.println(book.getBookName()));
        System.out.println(allBooks);

    }

    @Test
    public void testJdbcTemplateBatchAddBook() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"4", "Spring", "0"};
        Object[] o2 = {"5", "C++", "1"};
        Object[] o3 = {"6", "C#", "1"};
        Object[] o4 = {"7", "C", "0"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        batchArgs.add(o4);

        bookService.batchAdd(batchArgs);

        List<Book> allBooks = bookService.findAllBooks();
        System.out.println(allBooks);

    }

    @Test
    public void testJdbcTemplateBatchUpdateBook() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"_Spring", "0", "4"};
        Object[] o2 = {"_C++", "1", "5"};
        Object[] o3 = {"_C#", "1", "6"};
        Object[] o4 = {"_C", "0", "7"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        batchArgs.add(o4);

        bookService.batchUpdate(batchArgs);

        List<Book> allBooks = bookService.findAllBooks();
        System.out.println(allBooks);

    }

    @Test
    public void testJdbcTemplateBatchDeleteBook() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"4"};
        Object[] o2 = {"5"};
        Object[] o3 = {"6"};
        Object[] o4 = {"7"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        batchArgs.add(o4);

        bookService.batchDelete(batchArgs);

        List<Book> allBooks = bookService.findAllBooks();
        System.out.println(allBooks);

    }


}
