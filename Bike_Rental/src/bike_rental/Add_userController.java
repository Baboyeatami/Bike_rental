/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package bike_rental;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Jamie Eduardo Rosal
 */
public class Add_userController implements Initializable {

    @FXML
    private TextField F_name;
    @FXML
    private TextField M_name;
    @FXML
    private TextField L_name;
    @FXML
    private ComboBox<String> deparment;
    @FXML
    private ComboBox<String> userttype;
    @FXML
    private Button AddUser;
    @FXML
    private Button UpdateUser;
    @FXML
    private Button DeleteUser;
    @FXML
    private TextField CardNo;
    @FXML
    private Button ScanCard;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AddUser(ActionEvent event) throws SQLException {
        
            try {
            DBConnection.ReadIPaddress();
            DBConnection.init();
            Connection c = DBConnection.getConnection();
            PreparedStatement ps;

            String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());

            ps = c.prepareStatement("Insert into user (F_name, L_name, Department, Status,Cardno) values ('" + F_name.getText() + "','" + L_name.getText() + "','" + deparment.getSelectionModel().getSelectedItem() + "','" + userttype.getSelectionModel().getSelectedItem() + "','" + CardNo.getText() + "')");

            if (!ps.execute()) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("New User");
                alert.setHeaderText("User ");
                alert.setContentText("New User Created Successfully! ");

                Optional<ButtonType> result = alert.showAndWait();
                if (result.isPresent() && result.get() == ButtonType.OK) {
                    F_name.setText("");
                    L_name.setText("");
                   F_name.requestFocus();
                }
            }
            else {System.out.println("error in adding student");}
        } catch (Exception e) {
                System.out.println(e);
        }

         


}
        
        
           
       

        
    


    @FXML
    private void DeleteUser(ActionEvent event) {
    }

    @FXML
    private void ScanCard(ActionEvent event) {
    }
    
    
     void loadcombo_data() {

        ObservableList<String> data = FXCollections.observableArrayList();

        data.add("Item Id");
        data.add("Item Name");
        data.add("Description");

        userttype.setItems(data);

        //OptionsCombo.setValue("Select User Level");
    }

    
}
