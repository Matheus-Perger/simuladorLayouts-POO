package br.com.matheus.radio;

import br.com.matheus.display.Display;
import br.com.matheus.display.Formatter;

public class RadioDisplay extends Display<Radio> {

	private Radio radio;
	private Formatter<Radio> formata;
	
	public RadioDisplay(Radio radio, Formatter<Radio> formata) {
		super();
		this.radio = radio;
		this.formata = formata;
	}

	@Override
	public void show() {
		System.out.println(formata.formatter(radio));
	}
}
