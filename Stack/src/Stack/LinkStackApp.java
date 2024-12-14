package Stack;

public class LinkStackApp {
    public static void main(String[] args) {
        LinkStack theStack = new LinkStack();
        //push ile yigina veri ekleme
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        theStack.displayStack();
        //displayStack ile yigindaki tum elemanlar yazdirilir

        System.out.println(theStack.peek());//yiginin en ustundeki eleman yazdirilir
        theStack.pop();//yiginin en ustundeki eleman cikarilir
        System.out.println(theStack.peek());//yiginin yeni en ust elemani yazdirilir
    }
}
