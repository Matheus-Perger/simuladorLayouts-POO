package br.com.matheus.temperatura;

import br.com.matheus.display.Formatter;

public class TemperaturaFormatter implements Formatter<Temperatura> {

	@Override
	public String formatter(Temperatura value) {
		
		return value.getTemperatura() + " " + value.getTipo();
	}

}
