package test.test.pierwszaApka2.wzorce;

import org.springframework.stereotype.Component;

@Component
public class Ciastko {

    private boolean ugryzione = false;

    public boolean ugryz() {
        if (ugryzione) {
            return false;
        }
            System.out.println("Chrumm");
            ugryzione = true;
            return true;
           }

}
