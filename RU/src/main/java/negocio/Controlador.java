package negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import exceptions.DataInvalidaException;
import exceptions.PeriodoInvalidoException;
import models.*;
import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;
import exceptions.ElementoJaExisteException;
import exceptions.ElementoNaoExisteException;

public class Controlador {

    private IRepositorioGenerico<Estudante> repositorioEstudante;
    private IRepositorioGenerico<Funcionario> repositorioFuncionario;
    private IRepositorioGenerico<TicketRefeicao> repositorioTicketRefeicao;
    private IRepositorioGenerico<CardapioSemanal> repositorioCardapioSemanal ;
    private static Controlador instance;

    private Usuario usuario;

    private Controlador (){
        this.repositorioEstudante = new RepositorioGenerico<>();
        this.repositorioFuncionario = new RepositorioGenerico<>();
        this.repositorioTicketRefeicao = new RepositorioGenerico<>();
        this.repositorioCardapioSemanal = new RepositorioGenerico<>();
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
    
    public void inserirCardapioSemanal(CardapioSemanal obj) throws ElementoJaExisteException{
        repositorioCardapioSemanal.inserir(obj);
    }
    
    public void removerCardapioSemanal(CardapioSemanal obj) throws ElementoNaoExisteException{
        repositorioCardapioSemanal.remover(obj);
    }
    
    public void atualizarCardapioSemanal(CardapioSemanal obj) throws ElementoNaoExisteException{
        repositorioCardapioSemanal.atualizar(obj);
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

    public Map<LocalDate,Integer> relatorioVendasAlmoco(LocalDate inicio, LocalDate fim) throws DataInvalidaException, PeriodoInvalidoException{
        //List<VendasPorDia> relatorio=new ArrayList<>();
        Map<LocalDate,Integer> count=new HashMap<>();
        //Map<LocalDate,Integer> relatorio=new HashMap<>();
        //int count=0;
        if(!inicio.isAfter(LocalDate.now()) && !fim.isAfter(LocalDate.now()) && !inicio.isAfter(fim)){
            for (TicketRefeicao venda:this.repositorioTicketRefeicao.listar()) {
                if(!venda.getDataVenda().isBefore(inicio) && !venda.getDataVenda().isAfter(fim)){
                    //count++;
                    if(count.containsKey(venda.getDataVenda()) && venda.getTipo().name().equals("ALMOCO")) {
                        count.replace(venda.getDataVenda(), count.get(venda.getDataVenda()) + 1);
                    }
                    else if(!count.containsKey(venda.getDataVenda()) && venda.getTipo().name().equals("ALMOCO")){
                        count.put(venda.getDataVenda(),1);
                        //relatorio.put(venda.getDataVenda(),count.get(venda.getDataVenda()).toString());
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