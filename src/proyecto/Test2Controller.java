/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Hot Cakes
 */
public class Test2Controller implements Initializable {
    private Button suma;
    private Button div;
    private Button mult;
    public Button salir;
    private Button resta;
    private BorderPane Bp;
    private Button teof;
    
//    public void sumaClicked(){
//        System.out.println("suma");
//    }
//    
    public void restaClicked(){
        System.out.println("resta");
    }
    
    public void multClicked(){
        System.out.println("mult");
    }
    
    public void divClicked(){
        System.out.println("div");
    }
    
    public void salirClicked(){
        System.out.println("salir");   
        Stage stage = (Stage) salir.getScene().getWindow();
        stage.close();
        
    }
    
    public void teofClicked(){
        System.out.println("Teof");
    }
    
   @FXML
   void sumaClicked(ActionEvent event){
       try {
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Suma.fxml"));
           Parent root1 = (Parent) fxmlLoader.load();
           Stage stage = new Stage();
           stage.initModality(Modality.APPLICATION_MODAL);
           stage.setTitle("Suma");
           stage.setScene(new Scene(root1));  
           stage.show();

       } 
       catch (Exception e) {
           System.out.println(e);
       }
   }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
