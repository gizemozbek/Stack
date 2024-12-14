package Stack;

public class LinkList {
    //LinkList, tek yonlu bagli listeyi temsil eder
    // listenin basindaki elemani (headi)tutar ve ekleme, silme gibi temel islemleri yapar
    private Link head;

    public LinkList() {
        //eleman eklenmeye hazir hale gelmesi icin listenin baslangic durumu bos olarak baslatilmali
        head = null;
    }
    public boolean isEmpty() {
        //bagli liste bos mu? head ustunden kontrol et
        return head == null;
    }

    public void insertFirst(long d){
        //insertFirst ile yeni dugum olusturulur, basa eklenir
        //yeni dugumun next'i, mevcut listenin basini (eski head'i) isaret etmeli
        //yeni dugum listenin basi olmalı ve head yeni dugumu gostermeli
        Link newLink = new Link(d);
        newLink.next = head;
        head = newLink;
    }

    public long deleteFirst(){
        //deleteFirst ile listenin basindaki dugum silinir
        //head bir sonraki dugumu (head.next) isaret etmeli
        Link temp = head;
        head = head.next;
        return temp.data;
    }

    public long displayHead(){
        //displayHead ile listenin basindaki dugumun data degeri dondurulur
        return head.data;
    }

    public void displayList(){
        //displayList ile tüm listenin elemanlari sirasiyla yazdirilir
        //current her adımda ekrana yazdirilir ve bi sonraki dugume gecer (current.next)
        Link current = head;
        while(current != null){ //current null oldugunda dongu sonlanir
            current.displayLink();
            current = current.next;
        }
    }
}
