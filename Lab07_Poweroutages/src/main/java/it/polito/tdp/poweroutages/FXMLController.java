/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.poweroutages;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblSelection;

    @FXML
    private ComboBox<?> boxNERC;

    @FXML
    private Label lblYears;

    @FXML
    private TextField txtYears;

    @FXML
    private Label lblHours;

    @FXML
    private TextField txtHours;

    @FXML
    private Button btmWorst;

    @FXML
    private TextArea txtResult;

    @FXML
    void doChoice(ActionEvent event) {

    }

    @FXML
    void doWorst(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert lblSelection != null : "fx:id=\"lblSelection\" was not injected: check your FXML file 'Scene.fxml'.";
        assert boxNERC != null : "fx:id=\"boxNERC\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblYears != null : "fx:id=\"lblYears\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtYears != null : "fx:id=\"txtYears\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblHours != null : "fx:id=\"lblHours\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtHours != null : "fx:id=\"txtHours\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btmWorst != null : "fx:id=\"btmWorst\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
