package app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import models.Funcionario;
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
    private Label labelQtdAlmoco;

    @FXML
    private Label labelQtdJantar;

    @FXML
    protected void initialize(){
        labelBemvindo.setText(labelBemvindo.getText() + Controlador.getInstance().getUsuario().getNome());
        labelQtdAlmoco.setText(labelQtdAlmoco.getText() + Controlador.getInstance().listarTicketAlmocoUsuario(Controlador.getInstance().getUsuario()).size());
        labelQtdJantar.setText(labelQtdJantar.getText() + Controlador.getInstance().listarTicketJantarUsuario(Controlador.getInstance().getUsuario()).size());
    }

    @FXML
    protected void botaoComprarApertar(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaCompra.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Compra de tickets");
    }

    @FXML
    protected void botaoSair(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Login.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Login");
    }

    @FXML
    protected void botaoVerCardapioApertar(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaCardapio.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Cardápio Semanal");
    }

    @FXML
    protected void botaoCdEstudantesApertar(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaCDEstudante.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Cadastro de Estudantes");
    }

    @FXML
    protected void botaoCdFuncionariosApertar(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaCDFuncionario.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Cadastro de Funcionários");
    }
}
