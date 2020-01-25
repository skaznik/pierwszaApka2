package test.test.pierwszaApka2.wzorce;

import org.springframework.stereotype.Component;

@Component
public class Malgosia {

    public Malgosia(Ciastko ciastko) {
        if(ciastko.ugryz()) {
            System.out.println("Małgosia : mniam");
        } else {
            System.out.println("Małgosia : już ugryzione");
        }
    }

}
