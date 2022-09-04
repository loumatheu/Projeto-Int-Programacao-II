package dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import exceptions.ElementoJaExisteException;
import exceptions.ElementoNaoExisteException;

public class RepositorioGenerico<T> implements IRepositorioGenerico<T> {
    
    protected List<T> elementos;
    private String filename;
    
    @SuppressWarnings("unchecked")
    public RepositorioGenerico(String filename) {
        this.filename = filename;
        this.elementos = new ArrayList<>();
        
        Object listaElementos = RepositorioFileUtil.lerDoArquivo(this.filename); 
        if (listaElementos != null && listaElementos instanceof List<?>){
            this.elementos = (List<T>) listaElementos;
        }
    }
    
    /**
     * M�todo somente deve permitir a inser��o de um novo elementos se o mesmo
     * n�o j� n�o foi inserido anteriorment. Para isso � imprescind�vel a
     * correta implementa��o do m�todo equals do objeto envolvido.
     * 
     * A implementa��o deste m�todo deve OBRIGATORIAMENTE usar o m�todo contains
     * da interface java.util.List para verificar se o elemento a ser adicionado
     * j� existe na lista.
     * 
     * @throws ElementoJaExisteException
     *             Exce��o dever� ser levantada se, ao tentar inserir um novo
     *             elemento e o mesmo j� exista no reposit�rio
     */
    @Override
    public void inserir(T novoObj) throws ElementoJaExisteException  {
        if (!this.elementos.contains(novoObj)) {
            this.elementos.add(novoObj);
        } else {
            throw new ElementoJaExisteException(novoObj);
        }
        
        RepositorioFileUtil.salvarArquivo(elementos, this.filename);
    }

    @Override
    public List<T> listar() {
        return Collections.unmodifiableList(this.elementos);
    }

    /**
     * M�todo deve remover um elemento previamente cadastrado no reposit�rio.
     * 
     * A implementa��o deste m�todo deve OBRIGATORIAMENTE usar o m�todo indexOf
     * da classe java.util.List para encontrar o �ndice de um determinado objeto
     * do reposit�rio e remov�-lo.
     * 
     * @throws ElementoNaoExisteException
     *             Exce��o dever� ser levantada se, ao tentar remover um
     *             elemento da lista, o mesmo n�o exista no reposit�rio
     */
    @Override
    public void remover(T obj) throws ElementoNaoExisteException {
        if (this.elementos.contains(obj)) {
            this.elementos.remove(this.elementos.indexOf(obj));
        } else {
            throw new ElementoNaoExisteException(obj);
        }
        
        RepositorioFileUtil.salvarArquivo(elementos, this.filename);
    }

    /**
     * Método deve atualizar um elemento previamente cadastrado no reposit�rio.
     * 
     * A implementação deste método deve OBRIGATORIAMENTE usar o método indexOf
     * da classe java.util.List para encontrar o índice de um determinado voo e
     * atualiz�-lo.
     * 
     * @throws ElementoNaoExisteException
     *             Exceção deve ser levantada se, ao tentar procurar um
     *             elemento para ser atualizado, o mesmo não exista no
     *             repositório
     */
    @Override
    public void atualizar(T newObj) throws ElementoNaoExisteException {
        if (this.elementos.contains(newObj)) {
            int indice = this.elementos.indexOf(newObj);
            this.elementos.set(indice, newObj);
        } else {
            throw new ElementoNaoExisteException(newObj);
        }
        
        RepositorioFileUtil.salvarArquivo(elementos, this.filename);
    }
    
}
