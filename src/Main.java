public class Main {
    public static void main(String[] args) {

    Domov domNovak =  new Domov(536f, 10, 3);
    Domov domZajac = new Domov(423f, 8, 2);
    Domov domKralik = new Domov(356f, 6, 4);

    float cenaDomNovak = domNovak.vypocetCenaDomov(1,"Novak");
    float cenaDomZajac = domZajac.vypocetCenaDomov(3,"Zajac");
    float cenaDomKralik = domKralik.vypocetCenaDomov(2,"Kralik");

    System.out.println(domZajac.rozloha + domNovak.rozloha);

 /*   Random nahGen = new Random();
    nahGen.nextInt();
*/

    }
}


