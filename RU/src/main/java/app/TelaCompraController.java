package app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

}
