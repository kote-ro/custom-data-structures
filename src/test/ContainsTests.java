package test;

import main.lists.MyArrayList;
import main.lists.MyLinkedList;
import main.util.ListFiller;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.LinkedList;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ContainsTests {
    private final ListFiller listFiller = new ListFiller();

    private final int amountOfElements = 100_000;
    private final int index = amountOfElements/2;

    private MyArrayList<String> myArrayList;
    private MyLinkedList<String> myLinkedList;
    private ArrayList<String> classicArrayList;
    private LinkedList<String> classicLinkedList;

    @BeforeAll
    void setupLists(){
        myArrayList = listFiller.fillMyArrayList1(amountOfElements);
        myLinkedList = listFiller.fillMyLinkedList1(amountOfElements);
        classicArrayList = listFiller.fillClassicArrayList1(amountOfElements);
        classicLinkedList = listFiller.fillClassicLinkedList1(amountOfElements);
    }

    @Test
    void test1(){
        long currentTime = System.currentTimeMillis();
        boolean result = myArrayList.contains("some string "+index);
        long processTime = System.currentTimeMillis() - currentTime;
        System.out.println(processTime+" - "+result);
    }

    @Test
    void test2(){
        long currentTime = System.currentTimeMillis();
        boolean result = myLinkedList.contains("some string "+index);
        long processTime = System.currentTimeMillis() - currentTime;
        System.out.println(processTime+" - "+result);
    }

    @Test
    void test3(){
        long currentTime = System.currentTimeMillis();
        boolean result = classicArrayList.contains("some string "+index);
        long processTime = System.currentTimeMillis() - currentTime;
        System.out.println(processTime+" - "+result);
    }

    @Test
    void test4(){
        long currentTime = System.currentTimeMillis();
        boolean result = classicLinkedList.contains("some string "+index);
        long processTime = System.currentTimeMillis() - currentTime;
        System.out.println(processTime+" - "+result);
    }


}
