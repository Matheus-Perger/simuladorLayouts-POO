package br.com.matheus.radio;

import br.com.matheus.display.Formatter;

public class RadioFormatter implements Formatter<Radio> {

	@Override
	public String formatter(Radio value) {
		
		return value.getRadio() + " " + value.getNumeroRadio() + " " + value.getSintonizacao();
	}

}
