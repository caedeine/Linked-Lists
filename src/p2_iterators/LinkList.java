package p2_iterators;

public class LinkList {
    private Link first; //first link....
    public LinkList(){
        first = null;
    }
    public ListIterator getIterator(){
        return new ListIterator(this);
    }
    public void setFirst(Link link){
        first = link;
    }

    public Link getFirst() {
        return first;
    }
    public void displayList(){ //keep display LIST in here, display LINK in the link... be in the domain of one or the other
        Link current = first;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return first == null;

    }
}

