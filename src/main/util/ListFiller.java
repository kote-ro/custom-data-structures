package main.util;

import main.lists.MyArrayList;
import main.lists.MyLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListFiller {
    public ArrayList<String> fillClassicArrayList1(int amountOfElements){
        ArrayList<String> classicArrayList = new ArrayList<>();

        for(int i = 0; i < amountOfElements; i++){
            classicArrayList.add("some string "+i);
        }

        return classicArrayList;
    }

    public LinkedList<String> fillClassicLinkedList1(int amountOfElements){
        LinkedList<String> classicLinkedList = new LinkedList<>();

        for(int i = 0; i < amountOfElements; i++){
            classicLinkedList.add("some string "+i);
        }

        return classicLinkedList;
    }

    public MyArrayList<String> fillMyArrayList1(int amountOfElements){
        MyArrayList<String> myArrayList = new MyArrayList<>();

        for(int i = 0; i < amountOfElements; i++){
            myArrayList.add("some string "+i);
        }

        return myArrayList;
    }

    public MyLinkedList<String> fillMyLinkedList1(int amountOfElements){
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        for(int i = 0; i < amountOfElements; i++){
            myLinkedList.add("some string "+i);
        }

        return myLinkedList;
    }

    public ArrayList<String> fillClassicArrayList2(int amountOfElements){
        ArrayList<String> classicArrayList = new ArrayList<>();

        for(int i = 0; i < amountOfElements; i++){
            classicArrayList.add(i, "some string "+i);
        }

        return classicArrayList;
    }

    public LinkedList<String> fillClassicLinkedList2(int amountOfElements){
        LinkedList<String> classicLinkedList = new LinkedList<>();

        for(int i = 0; i < amountOfElements; i++){
            classicLinkedList.add(i, "some string "+i);
        }

        return classicLinkedList;
    }

    public MyArrayList<String> fillMyArrayList2(int amountOfElements){
        MyArrayList<String> myArrayList = new MyArrayList<>();

        for(int i = 0; i < amountOfElements; i++){
            myArrayList.add(i, "some string "+i);
        }

        return myArrayList;
    }

    public MyLinkedList<String> fillMyLinkedList2(int amountOfElements){
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        for(int i = 0; i < amountOfElements; i++){
            myLinkedList.add(i,"some string "+i);
        }

        return myLinkedList;
    }

}
