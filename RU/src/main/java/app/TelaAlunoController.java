package app;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import models.TicketRefeicao;
import negocio.Controlador;

import java.io.IOException;
import java.util.Objects;

public class TelaAlunoController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    ObservableList<TicketRefeicao> list = FXCollections.observableArrayList();

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


}
