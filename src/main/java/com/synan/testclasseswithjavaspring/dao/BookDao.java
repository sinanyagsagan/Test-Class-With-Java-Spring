package com.synan.testclasseswithjavaspring.dao;

import com.synan.testclasseswithjavaspring.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookDao {

    void create(Book book);

    Optional<Book> find(String isbn);

    List<Book> find();
}
