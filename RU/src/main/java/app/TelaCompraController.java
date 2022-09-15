package app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
<<<<<<< HEAD
import javafx.scene.control.Label;
import negocio.Controlador;

public class TelaCompraController {

    @FXML
    private Label labelQtdAlmoco;

    @FXML
    private Label labelQtdJanta;

    @FXML
    private Label labelNomeAluno;

    @FXML
    protected void initialize() {
        labelNomeAluno.setText(Controlador.getInstance().getUsuario().getNome());
    }

    @FXML
    void botaoComprarJanta(ActionEvent event) {

    }

    @FXML
    void botaoVoltarEstudante(ActionEvent event) {

    }
=======
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
    protected void botaoComprarAlmoco(){}

    @FXML
    protected void botaoComprarJanta(){}

    @FXML
    protected void botaoVoltar(ActionEvent event) throws IOException {
        if(Controlador.getInstance().getUsuario() instanceof Estudante){
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaAluno.fxml")));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if(Controlador.getInstance().getUsuario() instanceof Funcionario){
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaFuncionario.fxml")));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

>>>>>>> f026f4bb3e09382c9e288483779cc3a8b7bcfb90

}
