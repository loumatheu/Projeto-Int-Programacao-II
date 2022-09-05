package negocio;

import java.util.List;

import models.*;
import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;
import exceptions.ElementoJaExisteException;
import exceptions.ElementoNaoExisteException;



public class Controlador {

	// Dispensa construtor
	private RepositorioGenerico<Usuario> repositorioUsuarios = new RepositorioGenerico<>();

	private RepositorioGenerico<TicketRefeicao> repositorioTicketRefeicao = new RepositorioGenerico<>();

	// Getters & Setters, pode ser util em algum momento do codigo ou até mesmo pra debuggar
	public RepositorioGenerico<Usuario> getRepositorioUsuarios() {
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
	}
}