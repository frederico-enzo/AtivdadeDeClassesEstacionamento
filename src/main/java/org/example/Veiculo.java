package org.example;

public class Veiculo {

	private String placa;
	private Cor cor;
	private Tipo tipo;
	private Modelo modelo;
	private int ano;

	public Veiculo(String placa, Cor cor, Tipo tipo, Modelo modelo, int ano) {
		this.placa = placa;
		this.cor = cor;
		this.tipo = tipo;
		this.modelo = modelo;
		this.ano = ano;
	}
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}


}
