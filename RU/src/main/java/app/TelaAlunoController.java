package app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import negocio.Controlador;

public class TelaAlunoController {


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


}
