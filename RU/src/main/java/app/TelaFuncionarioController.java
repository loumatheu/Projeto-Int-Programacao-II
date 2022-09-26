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
    protected void initialize() {
        labelBemvindo.setText(labelBemvindo.getText() + Controlador.getInstance().getUsuario().getNome());
        labelQtdAlmoco.setText(labelQtdAlmoco.getText() + Controlador.getInstance().listarTicketAlmocoNaoConsumido(Controlador.getInstance().getUsuario()).size());
        labelQtdJantar.setText(labelQtdJantar.getText() + Controlador.getInstance().listarTicketJantarNaoConsumido(Controlador.getInstance().getUsuario()).size());
    }

    @FXML
    protected void botaoComprarApertar(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaCompra.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Compra de tickets");
    }

    @FXML
    protected void botaoSair(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Login.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
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
    protected void userCadastro(ActionEvent event) throws IOException{
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CadastroUsers.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Cadastrar Usuários");
    }
    
   /* @FXML
    protected void botaoCdCardapio(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaCDCardapio.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Cadastro do Cardapio");
    }*/

    @FXML
    protected void botaoRelatoriosApertar(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaRelatorio.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Relatório");
    }

    @FXML
    protected void botaoConsumirApertar(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaConsumo.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Consumo de Tickets");
    }

    @FXML
    protected void botaoCardapiosApertar(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaGerenciamentoCardapio.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Gerenciamento de Cardápios");
    }

    @FXML
    protected void botaoHistoricoApertar(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaHistorico.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Histórico de Usuário");
    }
}
