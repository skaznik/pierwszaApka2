package test.test.pierwszaApka2.model.names;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mikolaj {
    private Dziecko jas;
    private Dziecko malgosia;
    private Dziecko zbus;

    public Mikolaj(@Qualifier("zlosliwiec") Dziecko jas, @Qualifier("dziewczynka") Dziecko malgosia, @Qualifier("lobuz") Dziecko zbus) {
        this jas = jas;
        this.malgosia = malgosia;
        this.zbus = zbus;
    }
}
