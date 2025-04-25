/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package bike_rental;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Jamie Eduardo Rosal
 */
public class MainController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button Adduser;
    @FXML
    private Button addcredit;
    @FXML
    private Button usercredithiostory;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void adduser(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/bike_rental/Add_user.fxml"));
            Parent root1 = loader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initStyle(StageStyle.DECORATED);
            stage.setTitle("add userWindow");
            stage.setScene(new Scene(root1));
            stage.show();

        } catch (IOException ex) {
             System.out.println(ex);
        }
    }

    @FXML
    private void addcredit(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/bike_rental/UserC_History.fxml"));
            Parent root1 = loader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initStyle(StageStyle.DECORATED);
            stage.setTitle("Add Credit Window");
            stage.setScene(new Scene(root1));
            stage.show();

        } catch (IOException ex) {
             System.out.println(ex);
        }
    }

    @FXML
    private void usercredit(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/bike_rental/UserCreditHistory.fxml"));
            Parent root1 = loader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initStyle(StageStyle.DECORATED);
            stage.setTitle("Add Credit Window");
            stage.setScene(new Scene(root1));
            stage.show();

        } catch (IOException ex) {
             System.out.println(ex);
        }
        
    }
    
}
