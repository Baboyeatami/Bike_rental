/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package bike_rental;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Jamie Eduardo Rosal
 */
public class Bike_Rental extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
         Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.isAlwaysOnTop();
        stage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            launch(args);
            DBConnection.ReadIPaddress();
            launch(args);
            System.out.println(System.getProperty("user.dir"));
        } catch (IOException ex) {
            Logger.getLogger(Bike_Rental.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
