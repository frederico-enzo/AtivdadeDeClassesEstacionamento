package org.example;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Movimentacao {
	private Veiculo veiculo;
	private Condutor condutor;
	private LocalDateTime entrada;
	private LocalDateTime saida;
	private LocalTime tempo;
	private LocalTime tempoDesconto;
	private LocalTime tempoMulta;
	private BigDecimal valorHora;
	private BigDecimal valorHoraMulta;
	private BigDecimal valorDesconto;
	private BigDecimal valorTotal;
	private BigDecimal valorMulta;

	public Movimentacao(Veiculo veiculo, Condutor condutor, LocalDateTime entrada, LocalDateTime saida) {

		this.veiculo = veiculo;
		this.condutor = condutor;

		this.entrada = entrada;
		this.saida = saida;

		this.tempo = null;
		this.tempoDesconto = null;
		this.tempoMulta = null;

		this.valorDesconto = BigDecimal.ZERO;	// forma de inicar a varivel com zero
		this.valorTotal = BigDecimal.ZERO;
		this.valorMulta = BigDecimal.ZERO;
		this.valorHora = BigDecimal.ZERO;
		this.valorHoraMulta = BigDecimal.ZERO;

	}
//_________________________________________________
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
//_________________________________________________
	public Condutor getCondutor() {
	return condutor;
}
	public void setCondutor(Condutor condutor) {
		this.condutor = condutor;
	}
//_________________________________________________
	public LocalDateTime getEntrada() {
		return entrada;
}
	public void setEntrada(LocalDateTime entrada) {
		this.entrada = entrada;
	}

//_________________________________________________
	public LocalDateTime getSaida() {
		return saida;
	}
	public void setSaida(LocalDateTime saida) {
		this.saida = saida;
	}
//_________________________________________________
	public LocalTime getTempo() {
	return tempo;
	}
//_________________________________________________
	public LocalTime getTempoDesconto() {
		return tempoDesconto;
	}
//_________________________________________________
public LocalTime gettempoMulta() {
	return tempoDesconto;
	}
//_________________________________________________

	public BigDecimal getvalorDesconto() {
		return valorDesconto;
	}
//_________________________________________________
	public BigDecimal getvalorTotal() {
		return valorTotal;
	}
//_________________________________________________

	public BigDecimal getvalorMulta() {
		return valorMulta;
	}
//_________________________________________________

	public BigDecimal getvalorHora() {
		return valorHora;
	}
//_________________________________________________

	public BigDecimal getvalorHoraMulta() {
		return valorHoraMulta;
	}

//_________________________________________________

}
