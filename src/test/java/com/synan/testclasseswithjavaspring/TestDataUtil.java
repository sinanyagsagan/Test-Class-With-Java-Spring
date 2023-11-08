package com.synan.testclasseswithjavaspring;

import com.synan.testclasseswithjavaspring.model.Author;
import com.synan.testclasseswithjavaspring.model.Book;

public class TestDataUtil {

    private TestDataUtil(){}

    public static Author createTestAuthor() {
        return Author.builder()
                .id(1L)
                .name("TEST")
                .age(23)
                .build();
    }
    public static Author createTestAuthorA() {
        return Author.builder()
                .id(1L)
                .name("TEST A")
                .age(23)
                .build();
    }
    public static Author createTestAuthorB() {
        return Author.builder()
                .id(2L)
                .name("TEST B")
                .age(24)
                .build();
    }
    public static Author createTestAuthorC() {
        return Author.builder()
                .id(3L)
                .name("TEST C")
                .age(25)
                .build();
    }
    public static Book createTestBook() {
        return Book.builder()
                .isbn("978-1-2345-6789-0")
                .title("The Shadow in the Attic")
                .authorId(1L)
                .build();
    }
    public static Book createTestBookA() {
        return Book.builder()
                .isbn("978-1-2345-6789-1")
                .title("The Shadow in the Attic")
                .authorId(1L)
                .build();
    }

    public static Book createTestBookB() {
        return Book.builder()
                .isbn("978-1-2345-6789-2")
                .title("The Shadow in the Attic")
                .authorId(2L)
                .build();
    }

    public static Book createTestBookC() {
        return Book.builder()
                .isbn("978-1-2345-6789-3")
                .title("The Shadow in the Attic")
                .authorId(3L)
                .build();
    }

}
