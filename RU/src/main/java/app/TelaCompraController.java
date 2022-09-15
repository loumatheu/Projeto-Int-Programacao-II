package app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import negocio.Controlador;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import models.Estudante;
import models.Funcionario;
import negocio.Controlador;

import java.io.IOException;
import java.util.Objects;

public class TelaCompraController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Label labelQtdAlmoco;

    @FXML
    private Label labelQtdJanta;

    @FXML
    private Label labelNomeAluno;

    @FXML
    protected void initialize() {
        labelNomeAluno.setText(" " + Controlador.getInstance().getUsuario().getNome());
    }

    @FXML
    void botaoComprarJanta(ActionEvent event) {

    }

    @FXML
    protected void botaoComprarAlmoco(ActionEvent event) {

    }


    @FXML
    protected void botaoVoltar(ActionEvent event) throws IOException {
        if (Controlador.getInstance().getUsuario() instanceof Estudante) {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaAluno.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Tela Inicial");
        } else if (Controlador.getInstance().getUsuario() instanceof Funcionario) {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaFuncionario.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Tela inicial");
        }
    }
}
