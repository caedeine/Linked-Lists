package p3_api;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    //this is the one from the API
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        ListIterator iter1 = list.listIterator();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        list.add("F");
        list.forEach(System.out::println); // functional interface - ?
        //the above is a method reference


        list.forEach(e -> System.out.println(e));// equivalent
        //the above is the simple consumer
    }
}
