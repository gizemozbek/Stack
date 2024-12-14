package Stack;

public class StackXApp {
    public static void main(String[] args) {
        //StackX nesnesi olusturduk ve yigin kapasitesini 10 olarak ayarladik
        StackX theStack = new StackX(10);

        //yigina karakter ekleme
        //ilk eleman's'(alt), son eleman 'a'(üst) olur
        theStack.push('s');
        theStack.push('a');
        theStack.push('d');
        theStack.push('a');

        //yigin bosalana kadar calisacak while dongusu olustur
        //dongude peek() ile üstteki eleman goruntulenmeli(eleman yigindan cikartilmadan)
        //pop() ile üstteki eleman yigindan cikarilir ve ekrana yazdirilir
        //yigina girme sarisi bu durumda terse donecektir (LİFO prensibi)('s','a','d','a' -> 'a','d','a','s')

        while (!theStack.isEmpty()) {
            //karakter basmak icin
            char peekvalue = theStack.peek();
            char value = theStack.pop();
            System.out.print(value + " ");
        }
        System.out.println("");
    }
}
