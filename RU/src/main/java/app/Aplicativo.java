package app;

import exceptions.ElementoJaExisteException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.Estudante;
import models.Funcionario;
import models.TicketRefeicao;
import models.TipoRefeicao;
import negocio.Controlador;

import java.io.IOException;
import java.time.LocalDate;

public class Aplicativo extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Aplicativo.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Login RU");
        stage.setScene(scene);
        stage.show();
}

    public static void main(String[] args) {
        Controlador controladorteste = Controlador.getInstance();
        try {
            Controlador.getInstance().inserirEstudante(new Estudante("1233123","jose silva","12345678900",
                    LocalDate.now(),"email@hotmail.com","senha","1273299786"));
        } catch (ElementoJaExisteException e) {
            System.out.println("Teste");
        }
        Funcionario f = new Funcionario("1233123","ana maria","12345678911",
                LocalDate.now(),"email@hotmail.com","senha",1500.99,LocalDate.now());
        try {
            Controlador.getInstance().inserirFuncionario(f);
        } catch (ElementoJaExisteException e) {
            System.out.println("Teste");
        }
        /*try {
            Controlador.getInstance().getRepositorioTicketRefeicao().inserir(new TicketRefeicao(LocalDate.now(),LocalDate.now(), "12837163",3.50,f, TipoRefeicao.ALMOCO));
        } catch (ElementoJaExisteException e) {
            System.out.println("Teste");
        }*/
        launch();
    }
}
