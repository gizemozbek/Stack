package Stack;
//Link sinifi, bagli listedeki her bir dügümü temsil eden sınıf
public class Link {
    public long data;
    public Link next;
    public Link(long d) {
        data = d;
    }

    public void displayLink(){
        System.out.print(data + " ");
    }
}
