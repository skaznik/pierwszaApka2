package test.test.pierwszaApka2.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samochod {

    private Kierowca kierowca;
    //private Kola kola;
    //private Silnik silnik;
    private Czesc kola;
    private Czesc silnik;

    // 1 metoda - z setterem
//@Autowired
    //public void setKierowca(Kierowca kierowca) {
       // this.kierowca = kierowca;
   // }
//@Autowired
    //public void setKola(Kola kola) {
     //   this.kola = kola;
   // }
//@Autowired
   // public void setSilnik(Silnik silnik) {
      //  this.silnik = silnik;
   // }

    // inna matoda (z intefrejsem)
    public Samochod(Kierowca kierowca, Czesc kola, Czesc silnik) {
        this.kierowca = kierowca;
        this.kola = kola;
        this.silnik = silnik;
    }
}
