package com.nvankhoiws.singlylinkedlist.main;

import com.nvankhoiws.singlylinkedlist.component.implement.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        System.out.println("=================================");
        System.out.println("Size of list:\n" + list.size());
        System.out.println("Display the list:\n" + list);
        System.out.println("=============APPEND TO LIST====================");
        list.append(1);
        list.append(1);
        list.append(3);
        list.append(11);
        list.append(33);
        list.append(7);
        list.append(97);
        list.append(-198);
        list.append(1);
        list.append(0);
        list.append(3);
        list.append(-34);
        System.out.println("Size of list:\n" + list.size());
        System.out.println("Display the list:\n" + list);
        System.out.println("=============REMOVE TAIL====================");
        list.removeTail();
        System.out.println("Size of list:\n" + list.size());
        System.out.println("Display the list:\n" + list);
        System.out.println("=============REMOVE TAIL====================");
        list.removeTail();
        System.out.println("Size of list:\n" + list.size());
        System.out.println("Display the list:\n" + list);
        System.out.println("=============REMOVE TAIL====================");
        list.removeTail();
        System.out.println("Size of list:\n" + list.size());
        System.out.println("Display the list:\n" + list);
        System.out.println("=============REMOVE IF GREATER THAN 6====================");
        list.removeIfGreaterThan(6);
        System.out.println("Size of list:\n" + list.size());
        System.out.println("Display the list:\n" + list);

    }
}
