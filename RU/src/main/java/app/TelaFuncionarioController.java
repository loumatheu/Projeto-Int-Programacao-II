package app;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import negocio.Controlador;

public class TelaFuncionarioController {
    @FXML
    private Label labelBemvindo;

    @FXML
    protected void initialize(){
        labelBemvindo.setText(labelBemvindo.getText() + Controlador.getInstance().getUsuario().getNome());
    }

    @FXML
    protected void botaoComprarApertar(){}

    @FXML
    protected void botaoSair(){}

    @FXML
    protected void botaoVerCardapioApertar(){}

    @FXML
    protected void botaoCdEstudantesApertar(){}

    @FXML
    protected void botaoCdFuncionariosApertar(){}
}
