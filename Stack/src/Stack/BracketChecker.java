package Stack;

public class BracketChecker { //parantezleri kontrol etmek icin kullanilan sinif
    //metindeki parantezlerin dogru siralama ve eslesme kurallarina gore acilip kapanmasini kontrol eder
    private String input;
    public BracketChecker(String in) {
        //kullanicidan alinan metni tutan input degiskeni taniyoruz
        input = in; //inputa kullanicidan alinan metin atanir
    }

    public void check() { //parantez kontrol islemi
        int stackSize = input.length();//girdinin uzunluguna bagli olarak, acilan parantezleri gecici olarak saklamak icin StackX tipinde yigin olusturuyoruz
        StackX theStack = new StackX (stackSize);

        for(int i=0; i < input.length(); i++) { //for ile metin uzerinde dolasilir
        char ch = input.charAt(i);
            switch(ch){
                case '{':
                case'[':
                case'(':
                theStack.push(ch);
                break;
                case '}':
                case ']':
                case')':

                    //yigin bos degilse
                    if (!theStack.isEmpty()) {
                        char popped = theStack.pop();
                        if((ch =='}' && popped != '{') || (ch == ']' && popped != '[' && popped != ')') || (ch == ')' && popped != '(' ))
                            System.out.println("Hsta yanlis parantez: " + ch + "İndis:" +i);
                    }
                    else //yigin bossa
                        System.out.println("Hata fazla parantez kapatilmis: " + ch + "İndis:" +i);
                    break;
            }
        }
        if (!theStack.isEmpty())
            System.out.println("Hata: Sag Parantez Eksik");
        //Acilan parantez kadar kapatilamali
        //stackten pop ile acilan parantez sayisi cekildi
        //kapatilmamissa sag parantez eksik kalir
    }
}
