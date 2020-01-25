package test.test.pierwszaApka2.wzorce.programisci;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Profile("Programisci")
@Component
public class EkspresDoKawy {

    public static int i = 0;

    public EkspresDoKawy() {
        System.out.println("Ekspres do kawy : " + i++);
    }

}
