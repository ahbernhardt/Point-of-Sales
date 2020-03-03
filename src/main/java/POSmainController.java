package main.java;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class POSmainController implements Initializable {

    @FXML
    private Label localDateTime;

    @FXML
    private Button Logout;

    @FXML
    private Button Return_Button;

    @FXML
    private Button NewSales_Button;

    @FXML
    private Button SalesReport_But;

    @FXML
    void handleButtonClicks(javafx.event.ActionEvent actionEvent) {
        Object button = actionEvent.getSource();
        if ( button == NewSales_Button)
        {
            System.out.println("New Sales");
            loadStages( "/main/FXML/NewSales.fxml" );
        }
        else if ( button == Return_Button)
        {
            System.out.println("Return Sales");
            loadStages( "/main/FXML/ReturnSales.fxml" );
        }
        else if(button == Logout)
        {
            System.out.println("User Logout Success");
            loadStages( "/main/FXML/Login.fxml" );
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initTime();
    }

    private void initTime(){
        HomeScreenController.initTime( localDateTime );
    }


    private void loadStages(String fxml)
    {
        Parent window1;
        try {
            window1 = FXMLLoader.load(getClass().getResource(fxml));
            Stage homeScreenStage;
            Scene homeScreenScene = new Scene( window1 );
            homeScreenStage = POSRun.mainStage;
            homeScreenStage.setScene( homeScreenScene );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
