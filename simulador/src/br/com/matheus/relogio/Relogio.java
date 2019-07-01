package br.com.matheus.relogio;

public class Relogio {

	private Integer minuto;
	private Integer hora;
	
	public Relogio(Integer minuto, Integer hora) {
		super();
		this.minuto = minuto;
		this.hora = hora;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}
	
}
