package br.com.matheus.calendario;

import br.com.matheus.display.Formatter;

public class CalendarioFormatter implements Formatter<Calendario> {

	@Override
	public String formatter(Calendario value) {
		
		return value.getDia() + "/" + value.getMes() + "/" + value.getAno();
	}

}
