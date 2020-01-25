package test.test.pierwszaApka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import test.test.pierwszaApka2.wzorce.prototyp.Figura;
import test.test.pierwszaApka2.wzorce.singelton.Kalkulator;


@SpringBootApplication
public class PierwszaApka2Application {

	public static void main(String[] args) {
		Kalkulator.getINSTANCE().dodaj(2,2);
		Figura.kwadrat(4).pole();
		SpringApplication.run(PierwszaApka2Application.class, args);
	}

}
