/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trincas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Raphael
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        TableController controller = new TableController();
        
        controller.readFile("test.txt");
        
        label.setText("Check the log for your result");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
