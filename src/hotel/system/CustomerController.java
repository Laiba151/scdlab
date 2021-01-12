    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.system;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Laiba
 */
public class CustomerController implements Initializable {

    @FXML
    private Label ID;
    @FXML
    private Label Name;
    @FXML
    private Label Phoneno;
    @FXML
    private Label Roomno;
    @FXML
    private Label Address;
    @FXML
    private Label intiming;
    @FXML
    private Label Outtiming;
    @FXML
    private Button Done;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void GuestInfo(MouseEvent event) {
    
    }
    

    @FXML
    private void Checkinandouttiming(MouseEvent event) {
    }

    @FXML
    private void Paybill(MouseEvent event) {
    }

  

    @FXML
    private void Back(ActionEvent event) throws IOException {
           Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void Done(ActionEvent event) {
    }
    
}
