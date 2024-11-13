public class Main {
    public static void main(String[] args) {
        snackAutomat automat = new snackAutomat();
        int pris = 57;
        int betaltBeløb = 100;
        int beløbTilbage = automat.køb(pris,betaltBeløb);

        System.out.println("Byttepenge: " + beløbTilbage + "kr.");

        int[] byttePenge = automat.byttePenge(beløbTilbage);

        System.out.println("Beløb: " + beløbTilbage + "kr.");

        System.out.println("Antal 20 kr: " + byttePenge[0]);
        System.out.println("Antal 10 kr: " + byttePenge[1]);
        System.out.println("Antal 5 kr: " + byttePenge[2]);
        System.out.println("Antal 2 kr: " + byttePenge[3]);
        System.out.println("Antal 1 kr: " + byttePenge[4]);
    }


}