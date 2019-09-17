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
import javafx.scene.control.*;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hot Cakes
 */
public class Suma implements Initializable {
    public Button salir;
    @FXML
    private Label labelRespuesta;

    @FXML
    private TextField grad0;

    @FXML
    private TextField grad1;

    @FXML
    private Button confirmar;

    @FXML
    private TextField grad2;

    @FXML
    private TextField grad3;

    @FXML
    private TextField grad4;

    @FXML
    private TextField grad5;

    @FXML
    private TextField grad6;
    
    public void confirmarClicked(){
        System.out.println("Confirmar");
        Integer suma = 0;
        if(grad0.getText().isEmpty())suma=suma+0;else suma = suma + Integer.parseInt(grad0.getText());
        if(grad1.getText().isEmpty())suma=suma+0;else suma = suma + Integer.parseInt(grad1.getText());
        if(grad2.getText().isEmpty())suma=suma+0;else suma = suma + Integer.parseInt(grad2.getText());
        if(grad3.getText().isEmpty())suma=suma+0;else suma = suma + Integer.parseInt(grad3.getText());
        if(grad4.getText().isEmpty())suma=suma+0;else suma = suma + Integer.parseInt(grad4.getText());
        if(grad5.getText().isEmpty())suma=suma+0;else suma = suma + Integer.parseInt(grad5.getText());
        if(grad6.getText().isEmpty())suma=suma+0;else suma = suma + Integer.parseInt(grad6.getText());
        
        if (suma>20) 
            labelRespuesta.setText(suma.toString());
        else
            labelRespuesta.setText("Resultado incorrecto, la respuesta correcta es jasjhsajhasjhhasdjasdhashhasdhashsdauyuuacsbuy uybasdbyu as"
                    + "sdasas" + suma);
           
        System.out.println(suma);
    }
    
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
