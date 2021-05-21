package main.util;

import main.lists.MyArrayList;
import main.lists.MyLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListRemover {
    public ArrayList<String> removeClassicArrayList1(int amountOfElements, ArrayList<String> classicArrayList){
        for(int i = 0; i < amountOfElements; i++){
            classicArrayList.remove("some string "+i);
        }
        return classicArrayList;
    }

    public LinkedList<String> removeClassicLinkedList1(int amountOfElements, LinkedList<String> classicLinkedList){
        for(int i = 0; i < amountOfElements; i++){
            classicLinkedList.remove("some string "+i);
        }
        return classicLinkedList;
    }

    public MyArrayList<String> removeMyArrayList1(int amountOfElements, MyArrayList<String> myArrayList){
        for(int i = 0; i < amountOfElements; i++){
            myArrayList.remove("some string "+i);
        }
        return myArrayList;
    }

    public MyLinkedList<String> removeMyLinkedList1(int amountOfElements, MyLinkedList<String> myLinkedList){
        for(int i = 0; i < amountOfElements; i++){
            myLinkedList.remove("some string "+i);
        }
        return myLinkedList;
    }

    public ArrayList<String> removeClassicArrayList2(int amountOfElements, ArrayList<String> classicArrayList){
        for(int i = 0; i < amountOfElements; i++){
            classicArrayList.remove(i);
        }
        return classicArrayList;
    }

    public LinkedList<String> removeClassicLinkedList2(int amountOfElements, LinkedList<String> classicLinkedList){
        for(int i = 0; i < amountOfElements; i++){
            classicLinkedList.remove(i);
        }
        return classicLinkedList;
    }

    public MyArrayList<String> removeMyArrayList2(int amountOfElements, MyArrayList<String> myArrayList){
        for(int i = 0; i < amountOfElements; i++){
            myArrayList.remove(i);
        }

        return myArrayList;
    }

    public MyLinkedList<String> removeMyLinkedList2(int amountOfElements, MyLinkedList<String> myLinkedList){
        for(int i = 0; i < amountOfElements; i++){
            myLinkedList.remove(i);
        }

        return myLinkedList;
    }
}
