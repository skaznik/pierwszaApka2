package test.test.pierwszaApka2.wzorce.singelton;

public class Kalkulator {

    private static Kalkulator INSTANCE = new Kalkulator();

    private Kalkulator () {

    }

    public static Kalkulator getINSTANCE() {
        return INSTANCE;
    }

    public int dodaj(int a, int b) {
        return a+b;
    }
}
