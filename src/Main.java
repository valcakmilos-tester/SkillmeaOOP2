

public class Main {
    public static void main(String[] args) {

    Domov domNovakovcov = new Domov();
        domNovakovcov.pocetOkien = 12;
        domNovakovcov.pocetPoschodi = 3;
        domNovakovcov.rozloha = 42.5f;

    Domov domZajacov = new Domov();
    domZajacov.pocetOkien = 24;
    domZajacov.pocetPoschodi = 2;
    domZajacov.rozloha = 853.6f;

    domNovakovcov.vypocetCenyDomov();
    domZajacov.vypocetCenyDomov();
    System.out.println(domZajacov.rozloha + domNovakovcov.rozloha);
    }
}


