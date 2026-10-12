package p2_iterators;

public class Demo {
    public static void main(String[] args){
        LinkList theList = new LinkList();
        ListIterator iter1 = theList.getIterator();
        iter1.insertAfter(10);
        iter1.insertAfter(20);
        iter1.insertAfter(30);
        iter1.insertAfter(40);
        iter1.insertAfter(50);
        iter1.insertAfter(60);
        iter1.insertAfter(70);
        iter1.insertAfter(80);

        theList.displayList();
//        iter1.reset();
//        Link link1 = iter1.getCurrent();
//        link1.displayLink();
//        iter1.nextLink();
//        iter1.getCurrent().displayLink();
        iter1.reset();
        for (int i = 0; i < 3; i++){
            iter1.nextLink();
        }
        iter1.getCurrent().displayLink();
        ListIterator iter2 = theList.getIterator();
        iter2.reset();
        for(int i = 0; i < 6; i = i+3){
            iter2.nextLink();

        }
        iter2.getCurrent().displayLink();

    }
}
