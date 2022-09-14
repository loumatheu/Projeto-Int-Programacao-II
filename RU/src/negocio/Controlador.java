package negocio;

import java.util.List;

import models.*;
import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;
import exceptions.ElementoJaExisteException;
import exceptions.ElementoNaoExisteException;

public class Controlador {

	private IRepositorioGenerico<Estudante> repositorioEstudante;
	private IRepositorioGenerico<Funcionario> repositorioFuncionario;
	private IRepositorioGenerico<TicketRefeicao> repositorioTicketRefeicao;
	private static Controlador instance;

	private Controlador (){
		this.repositorioEstudante = new RepositorioGenerico<>();
		this.repositorioFuncionario = new RepositorioGenerico<>();
		this.repositorioTicketRefeicao = new RepositorioGenerico<>();
	}

	public static Controlador getInstance() {
		if (instance == null) {
			instance = new Controlador();
		}
		return instance;
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

}