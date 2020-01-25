package test.test.pierwszaApka2.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kierowca {
    // pierwsza metoda - bezpośrednio na polu (przed nazwą pola Autowired)
    @Autowired
    private Kluczyki kluczyki;
    private PrawoJazdy prawoJazdy;
  // druga metoda - przez zmianę settera (przed setterem - Autowired)
@Autowired
    public void setKluczyki(Kluczyki kluczyki) {
    this.kluczyki = kluczyki;
}
@Autowired
    public void setPrawoJazdy(PrawoJazdy prawoJazdy) {
        this.prawoJazdy = prawoJazdy;
    }

    //trzecia metoda - przez konstruktor (nie potrzebny autowired) UWAGA: może być tylko 1 konstruktor!!
    public Kierowca (Kluczyki kluczyki, PrawoJazdy prawoJazdy) {
    this.kluczyki = kluczyki;
    this.prawoJazdy = prawoJazdy;
    }
}
