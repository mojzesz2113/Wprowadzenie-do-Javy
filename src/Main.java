public class Main {
    public static void main(String[] args) {
//losowanie 6 liczb
        //wpisywanie 6 liczb
        //wypiszemy liczby wpisane i wylosowane
        System.out.println("Losowanie 6 liczb");

        //tablica
        int [] wylosowane = new int[6];
        //tablice w Javie nie moga miec zmienianego rozmiaru w trakcie dzialania
        //tablice w Javie przechowuja typy proste lub zlozone
        for(int i=0;i<wylosowane.length;i++){
            wylosowane[i] =(int)( Math.random()*100+1);
        }
        for(int wylosowanaWartosc :wylosowane){
            System.out.print(wylosowanaWartosc+" ");
        }

    }
}
