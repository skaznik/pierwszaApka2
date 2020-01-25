package test.test.pierwszaApka2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import test.test.pierwszaApka2.model.Kierowca;
import test.test.pierwszaApka2.model.PrawoJazdy;
import test.test.pierwszaApka2.model.Samochod;
import test.test.pierwszaApka2.model.names.Prezent;
import test.test.pierwszaApka2.wzorce.programisci.EkspresDoKawy;
import test.test.pierwszaApka2.wzorce.programisci.Komputer;
import test.test.pierwszaApka2.wzorce.programisci.Programista;

import java.util.ArrayList;
import java.util.List;
@Profile("Programisci")
@Configuration
public class TestConfigurations {

    //@Bean
     //public List<Samochod> samochod() {
       //  List<Samochod> out = new ArrayList<>();
        // for(int i = 0; i<5;++i) {
          //   out.add(new Samochod());
        // }
        // return out;
    // }
    // @Bean
   // public PrawoJazdy prawoJazdy(){
     //   return new PrawoJazdy();
    // }
    // @Bean
    // public Kierowca kierowca() {
       // return new Kierowca();
    // }

    @Bean
   public Prezent dlaMalgosi() {
        return new Prezent("lalka");
   }
    @Bean
    public Prezent dlaJasia() {
        return new Prezent("autko");
    }
    @Bean
    public Prezent dlaZbusia() {
        return new Prezent("klocki");
   }
    @Bean
public Programista programista1(EkspresDoKawy ekspresDoKawy, Komputer komputer) {
        return new Programista(ekspresDoKawy, komputer);
    }
    @Bean
    public Programista programista2(EkspresDoKawy ekspresDoKawy, Komputer komputer) {
        return new Programista(ekspresDoKawy, komputer);
    }
    @Bean
    public Programista programista3(EkspresDoKawy ekspresDoKawy, Komputer komputer) {
        return new Programista(ekspresDoKawy, komputer);
    }

    @Bean
    public Programista programista4(EkspresDoKawy ekspresDoKawy, Komputer komputer) {
        return new Programista(ekspresDoKawy, komputer);
    }

}
