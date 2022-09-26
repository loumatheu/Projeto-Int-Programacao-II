package app;

import exceptions.ElementoJaExisteException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Control;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.Estudante;
import models.Funcionario;
import models.Usuario;
import negocio.Controlador;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;

public class CadastroUserController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField codAluno;

    @FXML
    private TextField codFun;

    @FXML
    private TextField cpfAluno;

    @FXML
    private TextField cpfFun;

    @FXML
    private TextField cpfSearchE;

    @FXML
    private DatePicker dataContrato;

    @FXML
    private Label displayCod;

    @FXML
    private Label displayCpf;

    @FXML
    private Label displayEmail;

    @FXML
    private Label displayNasc;

    @FXML
    private Label displayNome;

    @FXML
    private TextField emailAluno;

    @FXML
    private TextField emailFun;

    @FXML
    private TextField matriculaAluno;

    @FXML
    private DatePicker nascAluno;

    @FXML
    private DatePicker nascFun;

    @FXML
    private TextField nomeAluno;

    @FXML
    private TextField nomeFun;

    @FXML
    private TextField salario;

    @FXML
    private TextField senhaAluno;

    @FXML
    private TextField senhaFun;


    @FXML
    protected void cadastrarEstudante (){
        if(!(senhaAluno.getText().equals("")) && !(nomeAluno.getText().equals("")) &&  // se não há algum
                !(emailAluno.getText().equals("")) && !(cpfAluno.getText().equals("")) &&  // campo em branco
                !(matriculaAluno.getText().equals("")) && !(codAluno.getText().equals("")) &&
                !(nascAluno.getValue().equals(LocalDate.now()))){
            try {
                Controlador.getInstance().inserirEstudante(new Estudante(codAluno.getText(),
                        nomeAluno.getText(), cpfAluno.getText(), nascAluno.getValue(),
                        emailAluno.getText(), senhaAluno.getText(), matriculaAluno.getText()));
                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("CADASTRO REALIZADO!");
                success.setContentText("Estudante cadastro com sucesso!");
                success.show();

                nomeAluno.setText("");
                cpfAluno.setText("");
                nascAluno.setValue(null);
                matriculaAluno.setText("");
                codAluno.setText("");
                emailAluno.setText("");
                senhaAluno.setText("");

            } catch (ElementoJaExisteException e) {
                Alert repeated = new Alert(Alert.AlertType.WARNING);
                repeated.setTitle("CADASTRO INVÁLIDO!");
                repeated.setContentText(e.getMessage());
                repeated.show();
            }
        } else {
            Alert fail = new Alert(Alert.AlertType.WARNING);
            fail.setTitle("CADASTRO INVÁLIDO!");
            fail.setContentText("Verifique as informações preenchidas!");
            fail.show();
        }
    }

    @FXML
    protected void cadastrarFuncionario (){

        if(!(codFun.getText().equals("")) && !(nomeFun.getText().equals("")) &&  // se não há algum
                !(emailFun.getText().equals("")) && !(cpfFun.getText().equals("")) &&  // campo em branco
                !(salario.getText().equals("")) &&
                !(nascFun.getValue().equals(LocalDate.now().minusYears(16)))){
            try {
                Controlador.getInstance().inserirFuncionario(new Funcionario(codFun.getText(),
                        nomeFun.getText(), cpfFun.getText(), nascFun.getValue(),
                        emailFun.getText(), senhaFun.getText(), Double.parseDouble(salario.getText()),
                        dataContrato.getValue()));

                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("CADASTRO REALIZADO!");
                success.setContentText("Funcionário cadastro com sucesso!");
                success.show();

                nomeFun.setText("");
                cpfFun.setText("");
                salario.setText("");
                codFun.setText("");
                emailFun.setText("");
                senhaFun.setText("");
                nascFun.setValue(null);
                dataContrato.setValue(null);

            } catch (ElementoJaExisteException e) {
                Alert repeated = new Alert(Alert.AlertType.WARNING);
                repeated.setTitle("CADASTRO INVÁLIDO!");
                repeated.setContentText(e.getMessage());
                repeated.show();
            }
        } else {
            Alert fail = new Alert(Alert.AlertType.WARNING);
            fail.setTitle("CADASTRO INVÁLIDO!");
            fail.setContentText("Verifique as informações preenchidas!");
            fail.show();
        }

    }

    @FXML
    protected void homeButton(ActionEvent event) throws IOException {
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

    @FXML
    protected void searchButton(){
        for (Usuario e: Controlador.getInstance().listarEstudantes()) {
            if (e.getCpf().equals(cpfSearchE.getText())){

            }
        }
    }
    @FXML
    protected void removeButton(){

    }

    @FXML
    protected void editButton() {

    }

}
