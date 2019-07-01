package br.com.matheus.relogio;

import br.com.matheus.display.Display;
import br.com.matheus.display.Formatter;

public class RelogioDisplay extends Display<Relogio> {

	private Relogio relogio;
	private Formatter<Relogio> formata;
	
	public RelogioDisplay(Relogio relogio, Formatter<Relogio> formata) {
		super();
		this.relogio = relogio;
		this.formata = formata;
	}

	@Override
	public void show() {
		System.out.println(formata.formatter(relogio));
	}
}
