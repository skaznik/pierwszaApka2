package test.test.pierwszaApka2.wzorce;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Scope(SCOPE_PROTOTYPE) //domyślne jest singelton, aby go zmienić - trzeba dodać tą linijkę
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
