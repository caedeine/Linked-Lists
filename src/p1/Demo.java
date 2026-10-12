package p1;

import java.sql.SQLOutput;
import java.util.Optional;

public class Demo {
    public static void main(String[] args){
        SimpleLinkedList list = new SimpleLinkedList();
        list.insertFirst("A",1.1);
        list.insertFirst("B",2.1);
        list.insertFirst("C",3.1);
        list.insertFirst("D",4.1);
        Optional<Link> optional = list.delete("C");

        //empty is null


        if(optional.isPresent()){
            optional.get().displayLink();
        }
        System.out.println("The remaining list: ");
        list.displayList();

        //another way to do the above. better actuallky but i dont feel like uncomenting it
        // optional.ifPresent(Link::displayLink);



//        if (linkFound == null){
//            System.out.println("No such name found!");
//        }
//        linkFound.displayLink();
        //this is a stack's second implementation insert and pop are O(1)
        //this implementation is better because we don't need to specify the size. we can grow as much as we want
        //this stack is never full (given you have more memory to add)
        //no amortization

        //downsides: links are not continuously next to each other. retrieving data may be slightly slower
        //because processors will retrieve data adjacent to the location where you are retrieving data in anticipaton
        //that you'll use that data too later.
        //with linked list it will try to still retrieve stuff next to it, meaning you may retrieve irrelavent stuff as well

        //if you know the size, use an array for a stack. if you dont know its size consider linkedlist (sacrifice performance)

        //for a queue, for linkedlist adding or removing is O(N) instead of O(1) for both in stack. Much worse

        //generics, bags, linked list quiz maybe next tuesday (after the one from thursday oct1)
    }
}
