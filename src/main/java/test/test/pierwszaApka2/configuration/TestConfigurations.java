package test.test.pierwszaApka2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import test.test.pierwszaApka2.model.Samochod;

@Configuration
public class TestConfigurations {

    @Bean
     public Samochod samochod() {
         return new Samochod();
     }
}
