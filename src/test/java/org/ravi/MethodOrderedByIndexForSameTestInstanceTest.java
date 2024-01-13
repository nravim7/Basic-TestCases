package org.ravi;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByIndexForSameTestInstanceTest {

    StringBuilder completed = new StringBuilder("");

    @AfterEach
    void afterEach() {
        System.out.println("completed is: "+completed);
    }
    @Order(2)
    @Test
    void testB() {
        System.out.println("Running Test B");
        completed.append("2");
    }

    @Order(3)
    @Test
    void testA() {
        System.out.println("Running Test A");
        completed.append("3");
    }

    @Order(1)
    @Test
    void testD() {
        System.out.println("Running Test D");
        completed.append("1");
    }

    @Order(4)
    @Test
    void testC() {
        System.out.println("Running Test C");
        completed.append("4");
    }
}
