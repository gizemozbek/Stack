package Stack;

public class LinkStack {
    //bagli listeyi kullanarak stack'i uygulayan sinif
    private LinkList theList;

    public LinkStack() {
        theList = new LinkList();
    }
    public void push(long d){
        //push ile yigina veri eklenir
        theList.insertFirst(d);
    }
    public long pop(){
        //pop ile yigindan veri cikarilir
        return theList.deleteFirst();
        //silinecek elemani getir
    }

    public boolean isEmpty(){
        //yigin bos mu degil mi?
        return theList.isEmpty();
    }

    public void displayStack (){
        //displayStack ile yigindaki tum elemanlar yazdirilir
        System.out.println("Stack (top->buttom):");
        theList.displayList();
        System.out.println("");
    }
    public long peek(){
        //peek ile yiginin en ust elemani (basini) dondurur
        return theList.displayHead();
    }
}