package com.synan.testclasseswithjavaspring.dao;

import com.synan.testclasseswithjavaspring.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorDao {
    void create(Author author);

    Optional<Author> findOne(long authorId);

    List<Author> find();

    void update(long id, Author author);
}
