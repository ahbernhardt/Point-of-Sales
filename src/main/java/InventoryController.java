package main.java;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ResourceBundle;

public class InventoryController implements Initializable {
    @FXML
    private Button Logout;

    @FXML
    private Button POS_Button;

    @FXML
    private Button Home_Button;

    @FXML
    private Label localDateTime;
    @FXML
    private TextArea textArea = new TextArea(  );



    @FXML
    private void handleButtonClicks (javafx.event.ActionEvent actionEvent)
    {
        if ( actionEvent.getSource() == Home_Button)
        {
            loadStages( "/main/FXML/HomeScreen.fxml" );
        }
        else if ( actionEvent.getSource() == POS_Button)
        {
            loadStages( "/main/FXML/NewSales.fxml" );
        }
        else if (actionEvent.getSource() == Logout)
        {
            loadStages( "/main/FXML/Login.fxml" );
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initTime();

        int refs = 100 +(int)(Math.random()*4);

        Calendar time = Calendar.getInstance( );
        time.getTime();
        SimpleDateFormat date = new SimpleDateFormat( "MM-dd-yyyy" );
        date.format(time.getTime());
        SimpleDateFormat Time = new SimpleDateFormat( "HH:mm:ss" );
        Time.format(time.getTime());

        //  ==============================================================
        textArea.appendText( " Display Inventory Report  \n" +
                   "\n+++++++++++++++++++++++++++++++++++++++++++++\t"+
                        "\n++++++++++++++++++++++++++++++++++++\t"+
                "Reference: \t\t" +refs +
                "\nDate:\t\t "+ date.format( time.getTime())+
                "Time: \t\t" +Time.format( time.getTime())+
                "\n+++++++++++++++++++++++++++++++++++++++++++++\t"+
                    "\n++++++++++++++++++++++++++++++++++++\t");
    }


    private void initTime(){
        HomeScreenController.initTime( localDateTime );
    }


    private void loadStages(String fxml)
    {
        Parent window1;
        try {
            window1 = FXMLLoader.load(getClass().getResource(fxml));
            Stage homescreenStage;
            Scene homesreenScene = new Scene( window1 );
            homescreenStage = POSRun.mainStage;
            homescreenStage.setScene( homesreenScene );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
