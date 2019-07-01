package br.com.matheus.radio;

public class Radio {

	private String radio;
	private double numeroRadio;
	private String sintonizacao;
	
	public Radio(){
	}
	
	public Radio(String radio, double numeroRadio, String sintonizacao) {
		this.radio = radio;
		this.numeroRadio = numeroRadio;
		this.sintonizacao = sintonizacao;
	}

	public String getRadio() {
		return radio;
	}

	public void setRadio(String radio) {
		this.radio = radio;
	}

	public double getNumeroRadio() {
		return numeroRadio;
	}

	public void setNumeroRadio(double numeroRadio) {
		this.numeroRadio = numeroRadio;
	}

	public String getSintonizacao() {
		return sintonizacao;
	}

	public void setSintonizacao(String sintonizacao) {
		this.sintonizacao = sintonizacao;
	}
}
