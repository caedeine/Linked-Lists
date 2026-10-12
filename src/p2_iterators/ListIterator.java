package p2_iterators;
//this is not the same one in the API, though their names are the same
public class ListIterator {
    private LinkList ourList;
    private Link current;
    private Link previous;
    //we dont need next its in the individual link



    public ListIterator(LinkList linkList) {
        ourList = linkList; //they all point to the same link, but make no mistake,
        // they are still 3 separate reference variables holding the same reference, but they are NOT three object

    }
    public long deleteCurrent(){
        long value = current.iData;
        if(previous == null){//beginning of list
            ourList.setFirst(current.next);
            reset();

        }
        else {
            previous.next = current.next;
            if(atEnd()){
                reset();

            }else{
                current = current.next;
            }
        }
        return value;
    }
    public void insertAfter(long iData){
        Link newLink = new Link(iData);
        if (ourList.isEmpty() ){
            ourList.setFirst(newLink);
        } else{
            newLink.next = current.next;
        }
    }

    public void insertBefore(long iData){
        Link newLink = new Link(iData);
        if (previous == null){//beginning of the first list U empty list
            newLink.next = ourList.getFirst();
            ourList.setFirst(newLink);
            reset();
        } else{
            newLink.next = previous.next;
            previous.next = newLink;
            current = newLink;
        }
    }


    public void reset(){
        current = ourList.getFirst();
        previous = null;
    }
    public boolean atEnd(){
        return current.next == null;
    }
    public void nextLink(){
        previous = current;
        current = current.next;
    }
    public Link getCurrent(){
        return current;
    }
}
