package test.test.pierwszaApka2.wzorce;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(BeanDefinition.SCOPE_PROTOTYPE) //domyślne jest singelton, aby go zmienić - trzeba dodać tą linijkę
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
