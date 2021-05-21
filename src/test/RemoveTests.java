package test;

import main.lists.MyArrayList;
import main.lists.MyLinkedList;
import main.util.ListFiller;
import main.util.ListRemover;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.LinkedList;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RemoveTests {
    private final ListFiller listFiller = new ListFiller();
    private final ListRemover listRemover = new ListRemover();
    private final int amountOfElements = 100_000;
    private final int index = amountOfElements / 2;

    private MyArrayList<String> myArrayList;
    private MyLinkedList<String> myLinkedList;
    private ArrayList<String> classicArrayList;
    private LinkedList<String> classicLinkedList;

    @Test
    void test1(){
        myArrayList = listFiller.fillMyArrayList1(amountOfElements);

        long currentTime = System.currentTimeMillis();
        myArrayList = listRemover.removeMyArrayList1(amountOfElements, myArrayList);
        long processTime = System.currentTimeMillis() - currentTime;
        System.out.println(processTime);
    }

    @Test
    void test2(){
        myArrayList = listFiller.fillMyArrayList1(amountOfElements);

        long currentTime = System.currentTimeMillis();
        myArrayList = listRemover.removeMyArrayList2(index, myArrayList);
        long processTime = System.currentTimeMillis() - currentTime;
        System.out.println(processTime);
    }

    @Test
    void test3(){
        myLinkedList = listFiller.fillMyLinkedList1(amountOfElements);

        long currentTime = System.currentTimeMillis();
        myLinkedList = listRemover.removeMyLinkedList2(index, myLinkedList);
        long processTime = System.currentTimeMillis() - currentTime;
        System.out.println(processTime);
    }

    @Test
    void test4(){
        classicArrayList = listFiller.fillClassicArrayList1(amountOfElements);

        long currentTime = System.currentTimeMillis();
        classicArrayList = listRemover.removeClassicArrayList1(amountOfElements, classicArrayList);
        long processTime = System.currentTimeMillis() - currentTime;
        System.out.println(processTime);
    }

    @Test
    void test5(){
        classicArrayList = listFiller.fillClassicArrayList1(amountOfElements);

        long currentTime = System.currentTimeMillis();
        classicArrayList = listRemover.removeClassicArrayList2(index, classicArrayList);
        long processTime = System.currentTimeMillis() - currentTime;

        System.out.println(processTime);
    }

    @Test
    void test6(){
        classicLinkedList = listFiller.fillClassicLinkedList1(amountOfElements);

        long currentTime = System.currentTimeMillis();
        classicLinkedList = listRemover.removeClassicLinkedList1(amountOfElements, classicLinkedList);
        long processTime = System.currentTimeMillis() - currentTime;

        System.out.println(processTime);
    }

    @Test
    void test7(){
        classicLinkedList = listFiller.fillClassicLinkedList1(amountOfElements);

        long currentTime = System.currentTimeMillis();
        classicLinkedList = listRemover.removeClassicLinkedList2(index, classicLinkedList);
        long processTime = System.currentTimeMillis() - currentTime;

        System.out.println(processTime);
    }
}
