package test.test.pierwszaApka2.wzorce.programisci;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class Programista {

    private EkspresDoKawy ekspresDoKawy;
    private Komputer komputer;

    public Programista(EkspresDoKawy ekspresDoKawy, Komputer komputer) {
        this.ekspresDoKawy = ekspresDoKawy;
        this.komputer = komputer;
    }
}
