package models;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Map;
import java.util.Objects;

import exceptions.DataInvalidaException;

public class CardapioSemanal {
	
	private LocalDate dataInicial;
	private LocalDate dataFinal;
	private Map<DiasDaSemana, OpcaoRefeicao> cardapio;
	
	
	public CardapioSemanal() {
		super();
	}


	public CardapioSemanal(LocalDate dataInicial, Map<DiasDaSemana, OpcaoRefeicao> cardapio) {
		super();
		this.dataInicial = dataInicial;
		this.dataFinal =dataInicial.plusDays(4);
		this.cardapio = cardapio;
	}


	public LocalDate getDataInicial() {
		return dataInicial;
	}


	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}


	public LocalDate getDataFinal() {
		return dataFinal;
	}


	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}


	public Map<DiasDaSemana, OpcaoRefeicao> getCardapio() {
		return cardapio;
	}


	public void setCardapio(Map<DiasDaSemana, OpcaoRefeicao> cardapio) {
		this.cardapio = cardapio;
	}


	@Override
	public String toString() {
		return "\nCardapioSemanal [dataInicial=" + dataInicial + ", dataFinal=" + dataFinal + ", cardapio=\n" +
				"\nSegunda: "+cardapio.get(DiasDaSemana.SEGUNDA)+
				"\nTerça: "+cardapio.get(DiasDaSemana.TERCA)+"\nQuarta: "+cardapio.get(DiasDaSemana.QUARTA)+
				"\nQuinta: "+cardapio.get(DiasDaSemana.QUINTA)+"\nSexta: "+ cardapio.get(DiasDaSemana.SEXTA) + "]\n";
	}


	@Override
	public int hashCode() {
		return Objects.hash(cardapio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CardapioSemanal other = (CardapioSemanal) obj;
		return Objects.equals(cardapio, other.cardapio);
	}
	
	
	
	
}
