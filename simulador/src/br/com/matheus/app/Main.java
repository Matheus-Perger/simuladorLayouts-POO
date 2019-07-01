package br.com.matheus.app;

import br.com.matheus.calendario.Calendario;
import br.com.matheus.calendario.CalendarioDisplay;
import br.com.matheus.calendario.CalendarioFormatter;
import br.com.matheus.display.Display;
import br.com.matheus.display.Formatter;
import br.com.matheus.radio.Radio;
import br.com.matheus.radio.RadioDisplay;
import br.com.matheus.radio.RadioFormatter;
import br.com.matheus.relogio.Relogio;
import br.com.matheus.relogio.RelogioDisplay;
import br.com.matheus.relogio.RelogioFormatter;
import br.com.matheus.temperatura.Temperatura;
import br.com.matheus.temperatura.TemperaturaDisplay;
import br.com.matheus.temperatura.TemperaturaFormatter;

public class Main {

	public static void main(String[] args) {
		
		// Calendario
		Calendario cal = new Calendario(10, 02, 2019);
		Formatter<Calendario> formaCal = new CalendarioFormatter();
		Display<Calendario> calDisplay = new CalendarioDisplay(cal, formaCal);
		
		// Radio
		Radio radio = new Radio("FM", 103.1, "Mhz");
		Formatter<Radio> formataRadio = new RadioFormatter();
		Display<Radio> radioDisplay = new RadioDisplay(radio, formataRadio);
		
		// Relogio
		Relogio relogio = new Relogio(30, 02);
		Formatter<Relogio> formataRelogio = new RelogioFormatter();
		Display<Relogio> relogioDisplay = new RelogioDisplay(relogio, formataRelogio);
		
		// Temperatura
		Temperatura temperatura = new Temperatura(20.5, "°C");
		Formatter<Temperatura> formataTemperatura = new TemperaturaFormatter();
		Display<Temperatura> temperaturaDisplay = new TemperaturaDisplay(temperatura, formataTemperatura);
		
		System.out.println("Display Calendário: ");
		calDisplay.show();
		System.out.println("--------------------------------------");
		System.out.println("Display Rádio: ");
		radioDisplay.show();
		System.out.println("--------------------------------------");
		System.out.println("Display Relógio: ");
		relogioDisplay.show();
		System.out.println("--------------------------------------");
		System.out.println("Display Temperatura: ");
		temperaturaDisplay.show();

	}

}
