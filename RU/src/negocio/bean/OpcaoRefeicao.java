package negocio.bean;

public class OpcaoRefeicao {
    private String opcao1;
    private String opcao2;
    private String opcaoVegana;
    private String acompanhamentos;
    private String sobremesa;
    private TipoRefeicao tipo;
    
	public OpcaoRefeicao() {
		super();
	}

	public OpcaoRefeicao(String opcao1, String opcao2, String opcaoVegana, String acompanhamentos, String sobremesa,
			TipoRefeicao tipo) {
		super();
		this.opcao1 = opcao1;
		this.opcao2 = opcao2;
		this.opcaoVegana = opcaoVegana;
		this.acompanhamentos = acompanhamentos;
		this.sobremesa = sobremesa;
		this.tipo = tipo;
	}
	
	public String getOpcao1() {
		return opcao1;
	}
	public void setOpcao1(String opcao1) {
		this.opcao1 = opcao1;
	}
	public String getOpcao2() {
		return opcao2;
	}
	public void setOpcao2(String opcao2) {
		this.opcao2 = opcao2;
	}
	public String getOpcaoVegana() {
		return opcaoVegana;
	}
	public void setOpcaoVegana(String opcaoVegana) {
		this.opcaoVegana = opcaoVegana;
	}
	public String getAcompanhamentos() {
		return acompanhamentos;
	}
	public void setAcompanhamentos(String acompanhamentos) {
		this.acompanhamentos = acompanhamentos;
	}
	public String getSobremesa() {
		return sobremesa;
	}
	public void setSobremesa(String sobremesa) {
		this.sobremesa = sobremesa;
	}
	public TipoRefeicao getTipo() {
		return tipo;
	}
	public void setTipo(TipoRefeicao tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "OpcaoRefeicao [opcao1=" + opcao1 + ", opcao2=" + opcao2 + ", opcaoVegana=" + opcaoVegana
				+ ", acompanhamentos=" + acompanhamentos + ", sobremesa=" + sobremesa + ", tipo=" + tipo + "]";
	}
      
    
}
