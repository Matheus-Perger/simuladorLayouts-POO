package br.com.matheus.temperatura;

import br.com.matheus.display.Display;
import br.com.matheus.display.Formatter;

public class TemperaturaDisplay extends Display<Temperatura> {

	private Temperatura temperatura;
	private Formatter<Temperatura> formata;
	
	public TemperaturaDisplay(Temperatura temperatura, Formatter<Temperatura> formata) {
		super();
		this.temperatura = temperatura;
		this.formata = formata;
	}

	@Override
	public void show() {
		System.out.println(formata.formatter(temperatura));
	}
}
