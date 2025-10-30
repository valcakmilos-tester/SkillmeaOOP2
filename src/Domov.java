public class Domov {
    float rozloha;
    int pocetOkien;
    String material;
    int pocetPoschodi;
    boolean jeAlarmZapnuty;

    public void vypocetCenyDomov() {
        System.out.println(pocetOkien*8000 + rozloha*8400);
    }


}
