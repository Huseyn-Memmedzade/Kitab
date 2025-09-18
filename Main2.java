package yenipabka;

public class Main2 {

    public static void main(String[] args) {


        Kitab cinayet = new Kitab();
        cinayet.ad = "Cinayət və Cəza";
        cinayet.yazar = "Fyodor Dostoyevski";
        cinayet.sehifeSayi = 600;

        System.out.println("Kitab Ad : " + cinayet.ad);
        System.out.println("Kitab Yazar : " + cinayet.yazar);
        System.out.println("Kitab Sehifesi : " + cinayet.sehifeSayi);


        Kitab sefiller = new Kitab();
        sefiller.ad = "Sefiller";
        sefiller.yazar = "Viktor Hüqo";
        sefiller.sehifeSayi = 800;

        System.out.println("Kitab Ad : " + sefiller.ad);
        System.out.println("Kitab Yazar : " + sefiller.yazar);
        System.out.println("Kitab Sehifesi : " + sefiller.sehifeSayi);


    }
}