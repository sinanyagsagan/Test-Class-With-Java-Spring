package com.synan.testclasseswithjavaspring;

import com.synan.testclasseswithjavaspring.dao.impl.AuthorDaoImplIntegrationTest;
import com.synan.testclasseswithjavaspring.dao.impl.BookDaoImplIntegrationTest;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(Suite.class)
//@Suite.SuiteClasses({AuthorDaoImplIntegrationTest.class, BookDaoImplIntegrationTest.class})
@SpringBootTest
class TestClassesWithJavaSpringApplicationTests {

    @Test
    void contextLoads() {

    }

}
