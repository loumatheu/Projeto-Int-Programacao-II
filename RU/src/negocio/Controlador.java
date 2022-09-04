package negocio;

import java.util.List;

import models.*;
import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;
import exceptions.ElementoJaExisteException;
import exceptions.ElementoNaoExisteException;



public class Controlador {

	private IRepositorioGenerico<Usuario> repositorioUsuarios;
	
	
	private static Controlador instance;

	private Controlador() {
		this.repositorioUsuarios= new RepositorioGenerico<>();
	}
	
	//M todo p blico para construir um Controlador
    public static Controlador getInstance() {
        if (instance == null) {
            instance = new Controlador();
        }
        return instance;
    }
  //M TODOS PARA ACESSAR CRUD DO repositorioUsuarios
  	public void inserirUsuario(Usuario obj) throws ElementoJaExisteException {
  		repositorioUsuarios.inserir(obj);
  	}

  	public List<Usuario> listarUsuarios() {
  		return repositorioUsuarios.listar();
  	}

  	public void removerUsuario(Usuario obj) throws ElementoNaoExisteException {
  		repositorioUsuarios.remover(obj);
  	}

  	public void atualizarUsuario(Usuario newObj) throws ElementoNaoExisteException {
  		repositorioUsuarios.atualizar(newObj);
  	}
}