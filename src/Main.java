import java.util.HashSet;
import java.util.Set;

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
            wylosowane.add((int)(Math.random()*10));
        }
        System.out.println("wylosowane:"+wylosowane);
    }
}
