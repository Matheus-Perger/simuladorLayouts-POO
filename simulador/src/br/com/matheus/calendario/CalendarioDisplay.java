package br.com.matheus.calendario;

import br.com.matheus.display.Display;
import br.com.matheus.display.Formatter;

public class CalendarioDisplay extends Display<Calendario> {

	private Calendario cal;
	private Formatter<Calendario> formata;
	
	public CalendarioDisplay(Calendario cal, Formatter<Calendario> formata) {
		super();
		this.cal = cal;
		this.formata = formata;
	}

	@Override
	public void show() {
		System.out.println(formata.formatter(cal));
	}
}
