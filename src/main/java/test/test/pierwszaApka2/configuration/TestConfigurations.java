package test.test.pierwszaApka2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import test.test.pierwszaApka2.model.Kierowca;
import test.test.pierwszaApka2.model.PrawoJazdy;
import test.test.pierwszaApka2.model.Samochod;
import test.test.pierwszaApka2.model.names.Prezent;

import java.util.ArrayList;
import java.util.List;

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

}
