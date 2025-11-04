public class Domov {
    // Toto su vlastnosti (fields)
    float rozloha;
    int pocetOkien;
    String material;
    int pocetPoschodi;
    boolean jeAlarmZapnuty;

    //Toto je konstruktor
    Domov(float roz, int pocOken, int pocPoschodi){
        rozloha = roz;
        pocetOkien = pocOken;
        pocetPoschodi = pocPoschodi;
    }

    //public void vypocetCenyDomov() {
    //    System.out.println(pocetOkien*8000 + rozloha*8400);

    //Toto je metoda
    public float vypocetCenaDomov(int lukrativnaOblast, String menoRodiny){;
        System.out.println(menoRodiny);
        float vypocet = lukrativnaOblast * (pocetOkien*800 + rozloha*840);
        return vypocet;
    }

    //Getter pro ziskani dat v private fields
    public int getPocetOkien(){
        return pocetOkien;
    }

    //Setter pro prepis dat v private field
    public void setPocetOkien(int novyPocetOkien){
        pocetOkien = novyPocetOkien;
    }
}
