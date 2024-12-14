package Stack;

public class StackX {
    private int maxSize; //yiginin max kapasitesi
    private char[] stackArray; // yiginin elemanlarini saklamak icin kullanılan dizi
    private int top; //yiginin en üstündeki elemanin indisini tutan degisken

    public StackX(int s) {
        //yiginin boyutunu dinamik olarak ayarlanir
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1; //yigini bos kabul etmek icin -1 alinir
    }

    //top degerini once artirip eleman anlik (j) indise eklendi yani sonra kullandik
    //LIFO -> artirilmis deger yiginin ustunu isaret eder
    //push ile yiginin en ustune eleman ekleme
    //push(): stack'e veri ekleme
    public void push(char j) {
        stackArray[++top] = j;
    }

    //cikarilan elemanin yerini belirlemek icin
    //pop(): stack'ten veri okuma
    //pop metodu ile yiginin en ustundeki eleman cikarilmali ve dondurulmali
    //cikartilan elemanin yerini belirlemek icin once top'daki eleman alinmali ve top bir azaltilmali
    public char pop() {
        return stackArray[top--];
    }

    //peek():siradaki veriyi okuma (top())
    //peek() metodu ile yiginin en ustundeki eleman cikarilmamali sadece dondurulmeli
    public char peek(){
        return stackArray[top];
    }

    //yigin bossa true, degilse false donduren metot icin isEmpty() kullandik
    //top degeri -1 ise yigin bostur
    public boolean isEmpty() {
        return (top == -1);
    }

    //yigin doluysa true, degilse false donduren metot icin isFull() kullandik
    //top degeri (maxSize -1) ise yigin doludur
    public boolean isFull() {
        return (top == maxSize - 1);
    }






}
