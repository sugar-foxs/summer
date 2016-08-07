package com.guchunhui.serviceImp;

import com.guchunhui.mapper.BookMapper;
import com.guchunhui.model.Book;
import com.guchunhui.queryCondition.BookQuery;
import com.guchunhui.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gch on 16-5-9.
 */
@Service("bookService")
public class BookServiceImp implements BookService {

    @Autowired
    private BookMapper bookMapper;

    public void insertBook(Book book) {
        bookMapper.insertBook(book);
    }

    public Book findBookById(long id) {
        return bookMapper.findBookById(id);
    }

    public List<Book> findBooksByMessage(String name) {
        return bookMapper.findBooksByMessage(name);
    }

    public List<Book> findAllBooks() {
        return bookMapper.findAllBooks();
    }

    public List<Book> findBooksByClass(BookQuery bookQuery) {
        return bookMapper.findBooksByClass(bookQuery);
    }

    public void deleteBookById(long id) {
        bookMapper.deleteBookById(id);
    }

    public void deleteBookByName(String name) {
        bookMapper.deleteBookByName(name);
    }
}
