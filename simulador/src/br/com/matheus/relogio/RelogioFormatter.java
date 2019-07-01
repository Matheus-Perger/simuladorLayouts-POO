package br.com.matheus.relogio;

import br.com.matheus.display.Formatter;

public class RelogioFormatter implements Formatter<Relogio> {

	@Override
	public String formatter(Relogio value) {
		
		return value.getHora() + ":" + value.getMinuto();
	}

}
