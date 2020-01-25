package test.test.pierwszaApka2.wzorce;

import org.springframework.stereotype.Component;

@Component
public class Jas {

    public Jas(Ciastko ciastko) {
        if(ciastko.ugryz()) {
            System.out.println("Jaś : mniam");
        } else {
            System.out.println("Jaś : już ugryzione");
        }
    }
}
