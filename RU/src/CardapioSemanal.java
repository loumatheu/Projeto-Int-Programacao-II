import java.time.LocalDate;
import java.util.Map;
import java.util.Objects;

public class CardapioSemanal {
	
	private LocalDate dataInicial;
	private LocalDate dataFinal;
	private Map<TipoRefeicao, OpcaoRefeicao> cardapio;
	
	
	public CardapioSemanal() {
		super();
	}


	public CardapioSemanal(LocalDate dataInicial, LocalDate dataFinal, Map<TipoRefeicao, OpcaoRefeicao> cardapio) {
		super();
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
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


	public Map<TipoRefeicao, OpcaoRefeicao> getCardapio() {
		return cardapio;
	}


	public void setCardapio(Map<TipoRefeicao, OpcaoRefeicao> cardapio) {
		this.cardapio = cardapio;
	}


	@Override
	public String toString() {
		return "CardapioSemanal [dataInicial=" + dataInicial + ", dataFinal=" + dataFinal + ", cardapio=" + cardapio
				+ "]";
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
