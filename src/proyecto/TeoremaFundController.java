/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hot Cakes
 */
public class TeoremaFundController implements Initializable {
    @FXML
    public Button salir;
    
    public void salirClicked(){
     System.out.println("salir");   
     Stage stage = (Stage) salir.getScene().getWindow();
     stage.close();

     }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
