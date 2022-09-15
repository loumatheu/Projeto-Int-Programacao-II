package app;

import exceptions.ElementoJaExisteException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.Estudante;
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
        launch();
    }
}
