import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import dados.RepositorioGenerico;
import exceptions.*;
import models.CardapioSemanal;
import models.Usuario;
import models.Estudante;
import models.Funcionario;
import models.TipoRefeicao;
import models.OpcaoRefeicao;
import negocio.Controlador;

public class Tela {

	public static void main(String[] args) throws ElementoJaExisteException {

		LocalDate dataNascimento = LocalDate.of(2000, 9, 4);

		Controlador controlador = new Controlador();


		Estudante estudante1=new Estudante("1", "a", "123.456.789-00", dataNascimento, "@gmail.com", "123456", "654321");
		Funcionario funcionario1=new Funcionario("1", "b", "1233555", dataNascimento, "@hotmail.", "123456",123.4, dataNascimento);

		controlador.inserir(estudante1);
		controlador.inserir(funcionario1);
		
		TipoRefeicao tipo= TipoRefeicao.ALMOCO;
		OpcaoRefeicao refeicao = new OpcaoRefeicao("arroz", "feijao", "tomate","banana", "sorcete", tipo);
		Map<TipoRefeicao,OpcaoRefeicao>  mapa =new HashMap<TipoRefeicao, OpcaoRefeicao>();
		mapa.put(tipo, refeicao);
		
		CardapioSemanal cardapio = new CardapioSemanal(dataNascimento, dataNascimento, mapa);
		
		
	}

}
