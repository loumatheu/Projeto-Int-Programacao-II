package app;

import exceptions.ElementoJaExisteException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.Estudante;
import models.Funcionario;
import negocio.Controlador;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;

public class TelaCDFuncionarioController {
    private Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    private TextField nomeTextField;

    @FXML
    private TextField codigoTextField;

    @FXML
    private TextField CPFTextField;

    @FXML
    private TextField salarioTextField;

    @FXML
    private TextField senhaTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private DatePicker dataNascimentoPicker;

    @FXML
    private DatePicker dataContratacaoPicker;

    @FXML
    private Label labelAviso;

    @FXML
    protected void initialize(){
        dataNascimentoPicker.setValue(LocalDate.now());
        dataContratacaoPicker.setValue(LocalDate.now());
    }

    @FXML
    protected void botaoCriarEstudante(){
        if(!(senhaTextField.getText().equals("")) && !(nomeTextField.getText().equals("")) &&  // se não há algum
                !(emailTextField.getText().equals("")) && !(CPFTextField.getText().equals("")) &&  // campo em branco
                !(salarioTextField.getText().equals("")) && !(codigoTextField.getText().equals("")) &&
                !(dataNascimentoPicker.getValue().equals(LocalDate.now()))){
            try {
                Controlador.getInstance().inserirFuncionario(new Funcionario(codigoTextField.getText(),
                        nomeTextField.getText(), CPFTextField.getText(), dataNascimentoPicker.getValue(),
                        emailTextField.getText(), senhaTextField.getText(), Double.parseDouble(salarioTextField.getText()),
                        dataContratacaoPicker.getValue()));
                labelAviso.setText("Funcionário cadastrado com sucesso!");
            } catch (ElementoJaExisteException e) {
                labelAviso.setText("Funcionário já cadastrado.");
            }
        } else {
            labelAviso.setText("Informações inválidas. Confira o que foi inserido e tente novamente.");
        }
    }

    @FXML
    protected void botaoVoltar(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaFuncionario.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Tela inicial");
    }
}
