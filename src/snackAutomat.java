import java.util.Arrays;

public class snackAutomat {

    public int køb(int pris, int betaltBeløb) {
        if (pris < 0 || betaltBeløb < 0) {
            throw new IllegalArgumentException("Beløbet eller prisen må ikke være negativ.");
        }
        if (betaltBeløb < pris) {
            throw new IllegalArgumentException("Det betalte beløb er for lavt.");
        }
        return betaltBeløb - pris;
    }

    public int[] byttePenge(int beløb) {
        int[] byttePenge = new int[5];

        // 20 mønt
        byttePenge[0] = beløb / 20;
        beløb = beløb % 20;

        // 10 mønt
        byttePenge[1] = beløb / 10;
        beløb = beløb % 10;

        // 5 mønt
        byttePenge[2] = beløb / 5;
        beløb = beløb % 5;

        // 2 mønt
        byttePenge[3] = beløb / 2;
        beløb = beløb % 2;

        // 1 mønt
        byttePenge[4] = beløb;

        return byttePenge;

    }
}
