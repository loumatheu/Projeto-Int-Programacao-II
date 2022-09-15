package app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.Usuario;
import negocio.Controlador;

import java.io.IOException;
import java.util.Objects;

public class TelaLoginController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField CPFTextField;

    @FXML
    private Label LabelAvisoErroLogin;

    @FXML
    private PasswordField senhaPasswordField;

    /*public void trocaPraAluno(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("TelaAluno.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }*/

    /*public void trocaPraFuncionario(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("TelaFuncionario.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root); //copiar esse código dentro do evento pra trocar tela, só mudar o .fxml
        stage.setScene(scene);
        stage.show();
    }*/

    @FXML
    protected void botaoLoginApertar(ActionEvent event) throws IOException {
        Usuario user;
        for(Usuario usuario:Controlador.getInstance().listarEstudantes()){
            if(usuario.getCpf().equals(CPFTextField.getText()) &&
                    usuario.getSenha().equals(senhaPasswordField.getText())){
                Controlador.getInstance().setUsuario(usuario);
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaAluno.fxml")));
                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }
        if(Controlador.getInstance().getUsuario() == null){
            for(Usuario usuario:Controlador.getInstance().listarFuncionarios()){
                if(usuario.getCpf().equals(CPFTextField.getText()) &&
                        usuario.getSenha().equals(senhaPasswordField.getText())){
                    Controlador.getInstance().setUsuario(usuario);
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaFuncionario.fxml")));
                    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
            }
        }
        if(Controlador.getInstance().getUsuario() == null){
            LabelAvisoErroLogin.setText("Usuário não encontrado. Tente novamente.");
        }
    }
}
