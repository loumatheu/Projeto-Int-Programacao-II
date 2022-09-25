package app;

import exceptions.DataInvalidaException;
import exceptions.ElementoJaExisteException;
import exceptions.ParametroVazioException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.DiasDaSemana;
import models.OpcaoRefeicao;
import models.TipoRefeicao;
import negocio.Controlador;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TelaBuscaCardapioController {
    	
	private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private ChoiceBox<TipoRefeicao> cbTipo;
    @FXML
    private TextField principal1SegundaTextField;
    
    @FXML
    private TextField principal1TercaTextField;
    
    @FXML
    private TextField principal1QuartaTextField;
    
    @FXML
    private TextField principal1QuintaTextField;
    
    @FXML
    private TextField principal1SextaTextField;
    
    
    @FXML
    private TextField principal2SegundaTextField;
    
    @FXML
    private TextField principal2TercaTextField;
    
    @FXML
    private TextField principal2QuartaTextField;
    
    @FXML
    private TextField principal2QuintaTextField;
    
    @FXML
    private TextField principal2SextaTextField;
    
    
    @FXML
    private TextField fastSegundaTextField;
    
    @FXML
    private TextField fastTercaTextField;
    
    @FXML
    private TextField fastQuartaTextField;
    
    @FXML
    private TextField fastQuintaTextField;
    
    @FXML
    private TextField fastSextaTextField;
    
    
    @FXML
    private TextField vegetarianoSegundaTextField;
    
    @FXML
    private TextField vegetarianoTercaTextField;
    
    @FXML
    private TextField vegetarianoQuartaTextField;
    
    @FXML
    private TextField vegetarianoQuintaTextField;
    
    @FXML
    private TextField vegetarianoSextaTextField;
    
    
    @FXML
    private TextField sucoSegundaTextField;
    
    @FXML
    private TextField sucoTercaTextField;
    
    @FXML
    private TextField sucoQuartaTextField;
    
    @FXML
    private TextField sucoQuintaTextField;
    
    @FXML
    private TextField sucoSextaTextField;
    
    
    @FXML
    private TextField sobremesaSegundaTextField;
    
    @FXML
    private TextField sobremesaTercaTextField;
    
    @FXML
    private TextField sobremesaQuartaTextField;
    
    @FXML
    private TextField sobremesaQuintaTextField;
    
    @FXML
    private TextField sobremesaSextaTextField;

    
    @FXML
    private DatePicker dataInicioCardapio;
    
    @FXML
    protected void initialize(){
       dataInicioCardapio.setValue(LocalDate.now());
       ObservableList<TipoRefeicao> tipos = FXCollections.observableArrayList();
       tipos.add(TipoRefeicao.ALMOCO);
       tipos.add(TipoRefeicao.JANTAR);
       cbTipo.setItems(tipos);
       cbTipo.setValue(TipoRefeicao.ALMOCO);
          }




      @FXML
    protected void botaoVoltar(ActionEvent event) throws IOException {
          root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TelaGerenciamentoCardapio.fxml")));
          stage = (Stage)((Node)event.getSource()).getScene().getWindow();
          scene = new Scene(root);
          stage.setScene(scene);
          stage.show();
          stage.setTitle("Gerenciamento de Cardápios");
    }
    
   
}


