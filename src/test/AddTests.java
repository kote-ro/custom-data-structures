package test;

import main.lists.MyArrayList;
import main.lists.MyLinkedList;
import main.util.ListFiller;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.LinkedList;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AddTests {
    private final ListFiller listFiller = new ListFiller();
    private final int amountOfElements = 10_000;

    private MyArrayList<String> myArrayList;
    private MyLinkedList<String> myLinkedList;
    private ArrayList<String> classicArrayList;
    private LinkedList<String> classicLinkedList;

    @Test
    void test1(){
        long currentTime = System.currentTimeMillis();

        myArrayList = listFiller.fillMyArrayList1(amountOfElements);

        long processTime = System.currentTimeMillis() - currentTime;
        System.out.println(processTime);
    }

    @Test
    void test2(){
        long currentTime = System.currentTimeMillis();

        myLinkedList = listFiller.fillMyLinkedList1(amountOfElements);

        long processTime = System.currentTimeMillis() - currentTime;
        System.out.println(processTime);
    }

    @Test
    void test3(){
        long currentTime = System.currentTimeMillis();

        classicArrayList = listFiller.fillClassicArrayList1(amountOfElements);

        long processTime = System.currentTimeMillis() - currentTime;
        System.out.println(processTime);
    }

    @Test
    void test4(){
        long currentTime = System.currentTimeMillis();

        classicLinkedList = listFiller.fillClassicLinkedList1(amountOfElements);

        long processTime = System.currentTimeMillis() - currentTime;
        System.out.println(processTime);
    }


    @Test
    void test5(){
        long currentTime = System.currentTimeMillis();

        myArrayList = listFiller.fillMyArrayList2(amountOfElements);

        long processTime = System.currentTimeMillis() - currentTime;
        System.out.println(processTime);
    }

    @Test
    void test6(){
        long currentTime = System.currentTimeMillis();

        myLinkedList = listFiller.fillMyLinkedList2(amountOfElements);

        long processTime = System.currentTimeMillis() - currentTime;
        System.out.println(processTime);
    }

    @Test
    void test7(){
        long currentTime = System.currentTimeMillis();

        classicArrayList = listFiller.fillClassicArrayList2(amountOfElements);

        long processTime = System.currentTimeMillis() - currentTime;
        System.out.println(processTime);
    }

    @Test
    void test8(){
        long currentTime = System.currentTimeMillis();

        classicLinkedList = listFiller.fillClassicLinkedList2(amountOfElements);

        long processTime = System.currentTimeMillis() - currentTime;
        System.out.println(processTime);
    }

}
