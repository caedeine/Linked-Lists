package p2_iterators;

public class Link {
    public long iData; //just so we can see whats going on (public), no getters or setters
    public Link next;
    public Link(long iData){
        this.iData = iData;

    }
    public void displayLink(){
        System.out.print(iData + " ");

    }


}
