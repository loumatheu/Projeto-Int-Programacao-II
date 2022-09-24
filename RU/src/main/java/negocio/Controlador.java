package negocio;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;


import exceptions.*;
import models.*;
import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;

public class Controlador {

    private IRepositorioGenerico<Estudante> repositorioEstudante;
    private IRepositorioGenerico<Funcionario> repositorioFuncionario;
    private IRepositorioGenerico<TicketRefeicao> repositorioTicketRefeicao;
    private IRepositorioGenerico<CardapioSemanal> repositorioCardapioSemanal;
    private IRepositorioGenerico<TipoRefeicao> repositorioTipoRefeicao;
    private IRepositorioGenerico<OpcaoRefeicao> repositorioOpcaoRefeicao;
    
    private static Controlador instance;

    private Usuario usuario;

    private Controlador (){
        this.repositorioEstudante = new RepositorioGenerico<>();
        this.repositorioFuncionario = new RepositorioGenerico<>();
        this.repositorioTicketRefeicao = new RepositorioGenerico<>();
        this.repositorioCardapioSemanal = new RepositorioGenerico<>();
        this.repositorioTipoRefeicao = new RepositorioGenerico<>();
        this.repositorioOpcaoRefeicao = new RepositorioGenerico<>();
    }

    public static Controlador getInstance() {
        if (instance == null) {
            instance = new Controlador();
        }
        return instance;
    }


    // Getters & Setters, pode ser util em algum momento do codigo ou até mesmo pra debuggar
	/*public RepositorioGenerico<Usuario> getRepositorioUsuarios() {
		return repositorioUsuarios;
	}

	public void setRepositorioUsuarios(RepositorioGenerico<Usuario> repositorioUsuarios) {
		this.repositorioUsuarios = repositorioUsuarios;
	}

	public RepositorioGenerico<TicketRefeicao> getRepositorioTicketRefeicao() {
		return repositorioTicketRefeicao;
	}

	//Métodos delegate
	public void setRepositorioTicketRefeicao(RepositorioGenerico<TicketRefeicao> repositorioTicketRefeicao) {
		this.repositorioTicketRefeicao = repositorioTicketRefeicao;
	}

	public List<TicketRefeicao> listar() {
		return repositorioTicketRefeicao.listar();
	}

	public void inserir(Usuario novoObj) throws ElementoJaExisteException {
		repositorioUsuarios.inserir(novoObj);
	}

	public void remover(Usuario obj) throws ElementoNaoExisteException {
		repositorioUsuarios.remover(obj);
	}

	public void atualizar(Usuario newObj) throws ElementoNaoExisteException {
		repositorioUsuarios.atualizar(newObj);
	}

	public void inserir(TicketRefeicao novoObj) throws ElementoJaExisteException {
		repositorioTicketRefeicao.inserir(novoObj);
	}

	public void remover(TicketRefeicao obj) throws ElementoNaoExisteException {
		repositorioTicketRefeicao.remover(obj);
	}

	public void atualizar(TicketRefeicao newObj) throws ElementoNaoExisteException {
		repositorioTicketRefeicao.atualizar(newObj);
	}*/

    public IRepositorioGenerico<Estudante> getRepositorioEstudante() {
        return repositorioEstudante;
    }

    public void setRepositorioEstudante(IRepositorioGenerico<Estudante> repositorioEstudante) {
        this.repositorioEstudante = repositorioEstudante;
    }

    public IRepositorioGenerico<Funcionario> getRepositorioFuncionario() {
        return repositorioFuncionario;
    }

    public void setRepositorioFuncionario(IRepositorioGenerico<Funcionario> repositorioFuncionario) {
        this.repositorioFuncionario = repositorioFuncionario;
    }

    public IRepositorioGenerico<TicketRefeicao> getRepositorioTicketRefeicao() {
        return repositorioTicketRefeicao;
    }

    public void setRepositorioTicketRefeicao(IRepositorioGenerico<TicketRefeicao> repositorioTicketRefeicao) {
        this.repositorioTicketRefeicao = repositorioTicketRefeicao;
    }
    
    public IRepositorioGenerico<CardapioSemanal> getRepositorioCardapioSemanal() {
        return repositorioCardapioSemanal;
    }
    
    public void setRepositorioCardapioSemanal(IRepositorioGenerico<CardapioSemanal> repositorioCardapioSemanal) {
        this.repositorioCardapioSemanal = repositorioCardapioSemanal;
    }

    public IRepositorioGenerico<TipoRefeicao> getRepositorioTipotRefeicao() {
        return repositorioTipoRefeicao;
    }
    
    public void setRepositorioTipoRefeicao(IRepositorioGenerico<TipoRefeicao> repositorioTipoRefeicao) {
        this.repositorioTipoRefeicao = repositorioTipoRefeicao;
    }
    
    public IRepositorioGenerico<OpcaoRefeicao> getRepositorioOpcaotRefeicao() {
        return repositorioOpcaoRefeicao;
    }
    
    public void setRepositorioOpcaoRefeicao(IRepositorioGenerico<OpcaoRefeicao> repositorioOpcaoRefeicao) {
        this.repositorioOpcaoRefeicao = repositorioOpcaoRefeicao;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Estudante> listarEstudantes(){
        return repositorioEstudante.listar();
    }

    public void removerEstudante(Estudante obj) throws ElementoNaoExisteException{
        repositorioEstudante.remover(obj);
    }

    public void atualizarEstudante(Estudante obj) throws ElementoNaoExisteException{
        repositorioEstudante.atualizar(obj);
    }

    public void inserirEstudante(Estudante obj) throws ElementoJaExisteException{
        repositorioEstudante.inserir(obj);
    }

    public List<Funcionario> listarFuncionarios(){
        return repositorioFuncionario.listar();
    }

    public void removerFuncionario(Funcionario obj) throws ElementoNaoExisteException{
        repositorioFuncionario.remover(obj);
    }

    public void atualizarFuncionario(Funcionario obj) throws ElementoNaoExisteException{
        repositorioFuncionario.atualizar(obj);
    }

    public void inserirFuncionario(Funcionario obj) throws ElementoJaExisteException{
        repositorioFuncionario.inserir(obj);
    }

    public List<TicketRefeicao> listarTicketRefeicao() {
        return repositorioTicketRefeicao.listar();
    }
    
    public void inserirTicket(TicketRefeicao obj) throws ElementoJaExisteException {
    	repositorioTicketRefeicao.inserir(obj);
    }
    
    public List<CardapioSemanal> listarCardapioSemanal(){
        return repositorioCardapioSemanal.listar();
    }
    
    public void inserirCardapioSemanal(LocalDate dataInicial,Map<DiasDaSemana,OpcaoRefeicao> cardapio ) throws ElementoJaExisteException, DataInvalidaException {
        if(dataInicial.getDayOfWeek().equals(DayOfWeek.MONDAY) && !dataInicial.isBefore(LocalDate.now())) {
            CardapioSemanal novo = new CardapioSemanal(dataInicial, cardapio);
            repositorioCardapioSemanal.inserir(novo);
        }
        else {
            throw new DataInvalidaException(dataInicial);
        }
    }
    
    public void removerCardapioSemanal(CardapioSemanal obj) throws ElementoNaoExisteException{
        repositorioCardapioSemanal.remover(obj);
    }
    
    public void atualizarCardapioSemanal(CardapioSemanal obj) throws ElementoNaoExisteException{
        repositorioCardapioSemanal.atualizar(obj);
    }
    
    public List<TipoRefeicao> listarTipoRefeicao(){
        return repositorioTipoRefeicao.listar();
    }
    
 
    
    
    public List<OpcaoRefeicao> listarOpcaoRefeicao(){
        return repositorioOpcaoRefeicao.listar();
    }
    
    public void inserirOpcaoRefeicao(OpcaoRefeicao obj) throws ElementoJaExisteException{
        repositorioOpcaoRefeicao.inserir(obj);
    }
    
    public void removerOpcaoRefeicao(OpcaoRefeicao obj) throws ElementoNaoExisteException{
        repositorioOpcaoRefeicao.remover(obj);
    }
    
    public void atualizarOpcaoRefeicao(OpcaoRefeicao obj) throws ElementoNaoExisteException{
        repositorioOpcaoRefeicao.atualizar(obj);
    }
    
    
    
    
    // Recebe uma instancia de usuario e 
    //retorna uma lista com os tickes de almço que ele possui.
    public List<TicketRefeicao> listarTicketAlmocoUsuario(Usuario usuario){
    	List<TicketRefeicao> ticketsDoUsuario = new ArrayList<>(); 
		
    	for(int i=0;i<repositorioTicketRefeicao.listar().size();i++) {
    		TicketRefeicao u = repositorioTicketRefeicao.listar().get(i);
    		
			if(usuario.equals(u.getComprador())) {
				TipoRefeicao tipo=TipoRefeicao.valueOf("ALMOCO");
				
				if(u.getTipo().equals(tipo))
				    ticketsDoUsuario.add(u);
			}
    	}
    	
		return ticketsDoUsuario;
    	
    }

    public List<TicketRefeicao> listarTicketAlmocoNaoConsumido(Usuario usuario){
        List<TicketRefeicao> ticketsAlmoco=this.listarTicketAlmocoUsuario(usuario);
        List<TicketRefeicao> ticketsDisponiveis=new ArrayList<>();

        for(TicketRefeicao ticket:ticketsAlmoco){
            if(ticket.getDataConsumo().equals(LocalDate.of(1,1,1))){
                ticketsDisponiveis.add(ticket);
            }
        }

        return ticketsDisponiveis;

    }

    public List<TicketRefeicao> listarTicketJantarUsuario(Usuario usuario){
    	List<TicketRefeicao> ticketsDoUsuario = new ArrayList<>();
		
    	for(int i=0;i<repositorioTicketRefeicao.listar().size();i++) {
    		TicketRefeicao u = repositorioTicketRefeicao.listar().get(i);
    		
			if(usuario.equals(u.getComprador())) {
				TipoRefeicao tipo=TipoRefeicao.valueOf("JANTAR");
				
				if(u.getTipo().equals(tipo))
				    ticketsDoUsuario.add(u);
			}
    	}
    	
		return ticketsDoUsuario;
    	
    }

    public List<TicketRefeicao> listarTicketJantarNaoConsumido(Usuario usuario){
        List<TicketRefeicao> ticketsJantar=this.listarTicketJantarUsuario(usuario);
        List<TicketRefeicao> ticketsDisponiveis=new ArrayList<>();

        for(TicketRefeicao ticket:ticketsJantar){
            if(ticket.getDataConsumo().equals(LocalDate.of(1,1,1))){
                ticketsDisponiveis.add(ticket);
            }
        }

        return ticketsDisponiveis;

    }

    public String consumirRefeicao(Usuario user, TipoRefeicao tipo) throws NaoPossuiTicketDisponivelException {
        List<TicketRefeicao> tickets;
        if(tipo.equals(TipoRefeicao.ALMOCO)){
            tickets=listarTicketAlmocoNaoConsumido(user);
        } else{
            tickets=listarTicketJantarNaoConsumido(user);
        }
        String codConsumo;
        if(tickets.size()!=0){
            codConsumo=tickets.get(0).getCodigo();
            tickets.get(0).setDataConsumo(LocalDate.now());
        }
        else{
            if(tipo.equals(TipoRefeicao.ALMOCO))
                throw new NaoPossuiTicketDisponivelException (TipoRefeicao.ALMOCO);
            else
                throw new NaoPossuiTicketDisponivelException (TipoRefeicao.JANTAR);
        }
        return codConsumo;

    }

    public void comprarRefeicao (Usuario user, TipoRefeicao tipo) throws ElementoJaExisteException {
        TicketRefeicao novoTicket=new TicketRefeicao(LocalDate.now(),String.valueOf(new Random().nextInt(100000)),3.5,user,tipo);
        this.repositorioTicketRefeicao.inserir(novoTicket);

    }



    public OpcaoRefeicao inserirOpcoesDeAlmoco(String opcao1,
    		String opcao2,String vegetariano, String fastGrill, String suco, String sobremesa, DiasDaSemana dia) throws ParametroVazioException {
    	OpcaoRefeicao refeicoes=null;
    	if(!(opcao1.isEmpty()) && !opcao2.isEmpty() && !(vegetariano.isEmpty()) && !suco.isEmpty() && !sobremesa.isEmpty() && !fastGrill.isEmpty() ) {
    		 refeicoes=new OpcaoRefeicao(opcao1, opcao2, vegetariano, fastGrill, suco, sobremesa,TipoRefeicao.ALMOCO);
    	}else {
    		if(opcao1.isEmpty()) {
    			throw new ParametroVazioException("Prato principal 1 da "+dia.name().toLowerCase());
    		}
    		if(opcao2.isEmpty()) {
    			throw new ParametroVazioException("Prato principal 2 da "+dia.name().toLowerCase());
    		}
    		if(vegetariano.isEmpty()) {
    			throw new ParametroVazioException("Prato vegetariano da "+dia.name().toLowerCase());
    		}
    		if(suco.isEmpty()) {
    			throw new ParametroVazioException("O suco da "+dia.name().toLowerCase());
    		}
    		if(fastGrill.isEmpty()) {
    			throw new ParametroVazioException("O fast grill da "+dia.name().toLowerCase());
    		}
    		if(sobremesa.isEmpty()) {
    			throw new ParametroVazioException("A sobremesa da "+dia.name().toLowerCase());
    		}
    			
    	}
    	
    	return refeicoes;
    }
    


    public Map<LocalDate,Integer> relatorioVendasAlmoco(LocalDate inicio, LocalDate fim) throws DataInvalidaException, PeriodoInvalidoException{
        Map<LocalDate,Integer> count=new HashMap<>();
        if(!inicio.isAfter(LocalDate.now()) && !fim.isAfter(LocalDate.now()) && !inicio.isAfter(fim)){
            for (TicketRefeicao venda:this.repositorioTicketRefeicao.listar()) {
                if(!venda.getDataVenda().isBefore(inicio) && !venda.getDataVenda().isAfter(fim)){
                    if(count.containsKey(venda.getDataVenda()) && venda.getTipo().name().equals("ALMOCO")) {
                        count.replace(venda.getDataVenda(), count.get(venda.getDataVenda()) + 1);
                    }
                    else if(!count.containsKey(venda.getDataVenda()) && venda.getTipo().name().equals("ALMOCO")){
                        count.put(venda.getDataVenda(),1);
                    }
                }
            }
        }
        else {
            if (inicio.isAfter(LocalDate.now())) {
                throw new DataInvalidaException(inicio);
            }
            if (fim.isAfter(LocalDate.now())) {
                throw new DataInvalidaException(fim);
            }
            if (inicio.isAfter(fim)) {
                throw new PeriodoInvalidoException(inicio,fim);
            }
        }
        return count;
    }

    public Map<LocalDate,Integer> relatorioVendasJantar(LocalDate inicio, LocalDate fim) throws DataInvalidaException, PeriodoInvalidoException{
        Map<LocalDate,Integer> count=new HashMap<>();
        if(!inicio.isAfter(LocalDate.now()) && !fim.isAfter(LocalDate.now()) && !inicio.isAfter(fim)){
            for (TicketRefeicao venda:this.repositorioTicketRefeicao.listar()) {
                if(!venda.getDataVenda().isBefore(inicio) && !venda.getDataVenda().isAfter(fim)){
                    if(count.containsKey(venda.getDataVenda()) && venda.getTipo().name().equals("JANTAR")) {
                        count.replace(venda.getDataVenda(), count.get(venda.getDataVenda()) + 1);
                    }
                    else if(!count.containsKey(venda.getDataVenda()) && venda.getTipo().name().equals("JANTAR")){
                        count.put(venda.getDataVenda(),1);
                    }
                }
            }
        }
        else {
            if (inicio.isAfter(LocalDate.now())) {
                throw new DataInvalidaException(inicio);
            }
            if (fim.isAfter(LocalDate.now())) {
                throw new DataInvalidaException(fim);
            }
            if (inicio.isAfter(fim)) {
                throw new PeriodoInvalidoException(inicio,fim);
            }
        }
        return count;
    }
    public Map<LocalDate,Integer> relatorioConsumoAlmoco(LocalDate inicio, LocalDate fim) throws DataInvalidaException, PeriodoInvalidoException{
        Map<LocalDate,Integer> count=new HashMap<>();
        if(!inicio.isAfter(LocalDate.now()) && !fim.isAfter(LocalDate.now()) && !inicio.isAfter(fim)){
            List<TicketRefeicao> listaConsumos=this.repositorioTicketRefeicao.listar().stream().filter(t->t.getDataConsumo()!=null).toList();
            for (TicketRefeicao consumo:listaConsumos) {
                if(!consumo.getDataConsumo().isBefore(inicio) && !consumo.getDataConsumo().isAfter(fim)){
                    if(count.containsKey(consumo.getDataConsumo()) && consumo.getTipo().name().equals("ALMOCO")) {
                        count.replace(consumo.getDataConsumo(), count.get(consumo.getDataConsumo()) + 1);
                    }
                    else if(!count.containsKey(consumo.getDataConsumo()) && consumo.getTipo().name().equals("ALMOCO")){
                        count.put(consumo.getDataConsumo(),1);
                    }
                }
            }
        }
        else {
            if (inicio.isAfter(LocalDate.now())) {
                throw new DataInvalidaException(inicio);
            }
            if (fim.isAfter(LocalDate.now())) {
                throw new DataInvalidaException(fim);
            }
            if (inicio.isAfter(fim)) {
                throw new PeriodoInvalidoException(inicio,fim);
            }
        }
        return count;
    }
    public Map<LocalDate,Integer> relatorioConsumoJantar(LocalDate inicio, LocalDate fim) throws DataInvalidaException, PeriodoInvalidoException{
        Map<LocalDate,Integer> count=new HashMap<>();
        if(!inicio.isAfter(LocalDate.now()) && !fim.isAfter(LocalDate.now()) && !inicio.isAfter(fim)){
            List<TicketRefeicao> listaConsumos=this.repositorioTicketRefeicao.listar().stream().filter(t->t.getDataConsumo()!=null).toList();
            for (TicketRefeicao consumo:listaConsumos) {
                if(!consumo.getDataConsumo().isBefore(inicio) && !consumo.getDataConsumo().isAfter(fim)){
                    if(count.containsKey(consumo.getDataConsumo()) && consumo.getTipo().name().equals("JANTAR")) {
                        count.replace(consumo.getDataConsumo(), count.get(consumo.getDataConsumo()) + 1);
                    }
                    else if(!count.containsKey(consumo.getDataConsumo()) && consumo.getTipo().name().equals("JANTAR")){
                        count.put(consumo.getDataConsumo(),1);
                    }
                }
            }
        }
        else {
            if (inicio.isAfter(LocalDate.now())) {
                throw new DataInvalidaException(inicio);
            }
            if (fim.isAfter(LocalDate.now())) {
                throw new DataInvalidaException(fim);
            }
            if (inicio.isAfter(fim)) {
                throw new PeriodoInvalidoException(inicio,fim);
            }
        }
        return count;
    }


}