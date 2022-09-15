package app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import negocio.Controlador;

import java.io.IOException;
import java.util.Objects;

public class TelaFuncionarioController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Label labelBemvindo;

    @FXML
    protected void initialize(){
        labelBemvindo.setText(labelBemvindo.getText() + Controlador.getInstance().getUsuario().getNome());
    }

    @FXML
    protected void botaoComprarApertar(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaCompra.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void botaoSair(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Login.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void botaoVerCardapioApertar(){}

    @FXML
    protected void botaoCdEstudantesApertar(){}

    @FXML
    protected void botaoCdFuncionariosApertar(){}
}
