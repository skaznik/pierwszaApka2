package test.test.pierwszaApka2.wzorce.programisci;

import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Scope(SCOPE_PROTOTYPE)
@Component
public class Komputer {
    public static int i = 0;

    public Komputer() {
        System.out.println("Komputer : " + i++);
    }

}
