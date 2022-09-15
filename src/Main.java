import java.util.*;

public class Main {
    public static void main(String[] args) {
        //losowanie bez powtorzen
        //kolekcja
        //w trakcie dzialania programu mozna zmieniac rozmiar kolekcji
        //kolekcja moze przechowywac tylko typy zlozone
        //SET - zbior elementy nie beda sie powtarzac
        //w zbiorze elementy nie sa indeksowane
        Set<Integer> wylosowane = new HashSet<>();
        while(wylosowane.size()<6){
            wylosowane.add((int)(Math.random()*100+1));
        }
        //System.out.println("wylosowane:"+wylosowane);

        //wczytywanie z klawiatury 6 liczb
        Scanner klawiatura = new Scanner(System.in);
        List<Integer> wpisane = new ArrayList<>();
        //lista elementy moga sie powtarzac
        //lista ma indeksowane elementy
        System.out.println("Podaj 6 liczb");
        for(int i=0;i<6;i++){
            System.out.println("Liczba "+i);
            int wczytanaWartosc = klawiatura.nextInt();
            while (wpisane.contains(wczytanaWartosc)){
                System.out.println("Taka liczba juz zostala podana, podaj inna");
                wczytanaWartosc = klawiatura.nextInt();
            }
            wpisane.add(wczytanaWartosc);
        }
        System.out.println("Wpisane "+wpisane);

        //zapis listy ktora bedzie zawierala elementy
        //ktore powtarzaja sie w wpisane i wylosowane
        List<Integer> trafione = new LinkedList<>();
        for(Integer wpisanaWartosc : wpisane){
            if(wylosowane.contains(wpisanaWartosc)){
                trafione.add(wpisanaWartosc);
            }
        }
        System.out.println("Trafione"+trafione);
    }
}
