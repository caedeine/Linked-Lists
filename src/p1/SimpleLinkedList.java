package p1;

import java.util.Optional;

public class SimpleLinkedList {
    private Link first;

    public SimpleLinkedList() {
        first = null;
    }

    public void insertFirst(String name, double gpa) {
        Link newLink = new Link(name, gpa);
        newLink.setNext(first);
        first = newLink;
        //time complexity O(1)
    }

    public void displayList() {
        System.out.println("List(first --> last: ) ");
        Link current = first;
        while (current != null) {
            current.displayLink();//display links until we reach the one with the null
            current = current.getNext(); //current becomesthe next link
        }
        System.out.println();


    }

    public Optional<Link> find(String key) {
        Link current = first;
        while (!(current.getStudent().getName().equals(key))) {
            if (current.getNext() == null) {
                return Optional.ofNullable(null);
            } else {
                current = current.getNext();
            }

        }
        return Optional.of(current);


    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.getNext();
        return temp;
        //time complexity O(1)

    }

    //note an edge case is where we need first link to ne null and second to exist if there only 1 object in the list
    public Optional<Link> delete(String name) {
        //to do this we need to find it, and then set the one before current to now point to the one after the old current, this effectively deletes it
        //but we need a second link: previous
        Link current = first;
        Link previous = first;
        while (current.getStudent().getName().equals(name)) {
            if (current.getNext() == null) {
                return Optional.ofNullable(null);
            } else {
                previous = current;
                current = current.getNext();
            }
        }
        if (current == first) {
            first = current.getNext();
        } else {
            previous.setNext(current.getNext());
        }
        return Optional.of(current);
    }

    public boolean isEmpty() {
        return first == null;
    }
}
    //with a double linked list we can add from the rear quiclky and remove from the front easily


    //the third type of linked list(Doubly-linked-list) gives the previous to every single link, so we can remove from the rear easily as well, since we know the previous of the last (not like in double linked where although we know the last, we dont know the one before last.);
    //the first link will have its previous set to null, the last link have its next to null;

    //the built in linkedlist type in java is a Doubly-linked-list (the third)



//Java has a built in Iterator class methods are next, previous, reset, each object has its own of these methods (thats what a class is...)
//you therefore dont need multiple next or current and use the Iterator.
//simplifies the implementation


//generics, linked list on the test pretty much only
