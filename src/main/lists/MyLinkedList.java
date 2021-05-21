package main.lists;

import java.util.LinkedList;

public class MyLinkedList<T> extends LinkedList<T> {
    private Node head;

    public boolean add(T elem) {
        Node newNode = new Node(elem);
        if(head == null) {
            head = newNode;
        }else {
            Node n = head;
            while(n.next != null) {
                n = n.next;
            }
            n.next = newNode;
        }
        return true;
    }

    public void addAtStart(T elem) {
        Node newNode = new Node(elem);

        newNode.next = head;
        head = newNode;
    }

    public void add(int index, T elem) {
        if(index == 0){
            addAtStart(elem);
        }else{
            Node newNode = new Node(elem);

            Node currentNode = head;
            for(int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    public T remove(int index) {
        if(index == 0) {
            head = head.next;
        }else{
            Node currentNode = head;
            for(int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
        }
        return null;
    }

    public boolean remove(Object elem){
        remove(indexOf(elem));
        return true;
    }

    public boolean contains(Object elem) {
        return indexOf(elem) >= 0;
    }

    public int indexOf(Object elem) {
        int index = 0;
        if (elem == null) {
            return index;
        } else {
            Node currentNode = head;

            while(currentNode.getNext() != null){
                if(currentNode.getData() == elem){
                    return index;
                }
                currentNode = currentNode.getNext();
                index++;
            }
        }
        return -1;
    }

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}