package main.java;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ResourceBundle;

public class NewSalesController implements Initializable {

    String tax, subtotal, Total;

    double[] itemcost = new double[15];

    @FXML
    private TextField subTotalField;

    @FXML
    private TextField taxField;

    @FXML
    private TextField netPayableField;

    @FXML
    private Button AppleButton;

    @FXML
    private Button OrangeButton;

    @FXML
    private Button BannaButton;

    @FXML
    private Button GrapeButton;

    @FXML
    private Button StrawBerryButton;

    @FXML
    private Button BlueBerryButton;

    @FXML
    private Button PearButton;

    @FXML
    private Button BaconButton;

    @FXML
    private Button LettuceButton;

    @FXML
    private Button TotalButton;

    @FXML
    private Button cancelbutton;

    @FXML
    private Button resetButton;

    @FXML
    private CheckBox Applecheck;

    @FXML
    private CheckBox orangecheck;

    @FXML
    private CheckBox bananacheck;

    @FXML
    private CheckBox grapecheck;

    @FXML
    private CheckBox baconcheck;

    @FXML
    private CheckBox strawberrycheck;

    @FXML
    private CheckBox blueberrycheck;

    @FXML
    private CheckBox pearcheck;

    @FXML
    private CheckBox lettucecheck;

    @FXML
    private TextField appletextfield;

    @FXML
    private TextField orangetextfield;

    @FXML
    private TextField bananatextfield;

    @FXML
    private TextField grapetextfield;

    @FXML
    private TextField bacontextfield;

    @FXML
    private TextField strawberrytextfield;

    @FXML
    private TextField blueberrytextfield;

    @FXML
    private TextField peartextfield;

    @FXML
    private TextField lettucetextfiel;


    @FXML
    private Label localDateTime;

    @FXML
    private Button Item_Button;

    @FXML
    private Button User_Button;

    @FXML
    private Button Home_Button;

    @FXML
    private Button Inventory_Button;

    @FXML
    private TextArea Receipt = new TextArea(  );

    @FXML
    private Button Logout;



    @FXML
    private void handleButtonClicks(javafx.event.ActionEvent actionEvent) {
//======================== LEFTSIDE BUTTONS ==================================
        if (actionEvent.getSource() == Home_Button) {
            loadStages( "/main/FXML/HomeScreen.fxml" );
        }if (actionEvent.getSource() == Logout) {
            loadStages( "/main/FXML/Login.fxml" );
        }
    }

// =================== ITEM BUTTON ==========================================
        @FXML
        private void applebutton (javafx.event.ActionEvent apple){
            //////  Apple
            apple.getSource();
            Applecheck.setDisable( false );
            if (Applecheck.isSelected()) {
                appletextfield.setText( "0" );
                appletextfield.requestFocus();
            } else {
                appletextfield.setText( "0" );
            }
        }

        @FXML
        private void baconbutton (javafx.event.ActionEvent bacon){
            //////        Bacon
            bacon.getSource();
            baconcheck.setDisable( false );
            if (baconcheck.isSelected()) {
                bacontextfield.setText( "0" );
                bacontextfield.requestFocus();
            } else {
                bacontextfield.setText( "0" );
            }
        }

        @FXML
       private void bananabutton (javafx.event.ActionEvent banana){
            ///////   Banana
            banana.getSource();
           bananacheck.setDisable( false );
            if (bananacheck.isSelected()) {
                bananatextfield.setText( "0" );
                bananatextfield.requestFocus();
            } else {
                bananatextfield.setText( "0" );
            }
        }

        @FXML
        private void blueberrybutton (javafx.event.ActionEvent blueberry){
            ///////   Blueberry
            blueberry.getSource();
            blueberrycheck.setDisable( false );
            if (blueberrycheck.isSelected()){
                blueberrytextfield.setText( "0" );
                blueberrytextfield.requestFocus();
            }else {
                blueberrytextfield.setText( "0" );
            }
        }

        @FXML
        private void grapebutton (javafx.event.ActionEvent grape){
            ///////   Grape
            grape.getSource();
            grapecheck.setDisable( false );
            if (grapecheck.isSelected()){
                grapetextfield.setText( "0" );
                grapetextfield.requestFocus();
            }else {
                grapetextfield.setText( "0" );
            }

        }

        @FXML
        private void lettucebutton (javafx.event.ActionEvent lettuce){
            //////        Lettuce
            lettuce.getSource();
            lettucecheck.setDisable( false );
            if (lettucecheck.isSelected()){
                lettucetextfiel.setText( "0" );
                lettucetextfiel.requestFocus();
            }else {
                lettucetextfiel.setText( "0" );
            }
        }

        @FXML
        private void orangebutton (javafx.event.ActionEvent orange){
            ///////    Orange
            orange.getSource();
                orangecheck.setDisable( false );
                if (orangecheck.isSelected()) {
                    orangetextfield.setText( "0" );
                    orangetextfield.requestFocus();
                } else {
                    orangetextfield.setText( "0" );
                }
            }

        @FXML
        private void pearbutton (javafx.event.ActionEvent pear){
            //////        Pear
            pear.getSource();
            pearcheck.setDisable( false );
            if (pearcheck.isSelected()) {
                peartextfield.setText( "0" );
                peartextfield.requestFocus();
            } else {
                peartextfield.setText( "0" );
            }
        }

        @FXML
        private void strawberrybutton (javafx.event.ActionEvent strawberry){
            ///////   Strawberry
            strawberry.getSource();
            strawberrycheck.setDisable( false );
            if (strawberrycheck.isSelected()) {
                strawberrytextfield.setText( "0" );
                strawberrytextfield.requestFocus();
            } else {
                strawberrytextfield.setText( "0" );
            }
        }

    @FXML
    private void getTotal(javafx.event.ActionEvent getTotal) {
        getTotal.getSource();
        System.out.println("Button out");
        itemcost[0] = Double.parseDouble( appletextfield.getText()) * 0.75;
        itemcost[1] = Double.parseDouble( orangetextfield.getText()) * 1.00;
        itemcost[2] = Double.parseDouble( bananatextfield.getText()) * 0.89;
        itemcost[3] = Double.parseDouble( grapetextfield.getText()) * 2.25;
        itemcost[4] = Double.parseDouble( strawberrytextfield.getText())* 2.75;
        itemcost[5] = Double.parseDouble( blueberrytextfield.getText()) * 2.35;
        itemcost[6] = Double.parseDouble( peartextfield.getText()) * 1.75;
        itemcost[7] = Double.parseDouble( bacontextfield.getText()) * 2.75;
        itemcost[8] = Double.parseDouble( lettucetextfiel.getText()) * 1.25;

        itemcost[9]= itemcost[0]+itemcost[1]+itemcost[2]+itemcost[3]+itemcost[4];
        itemcost[10]= itemcost[5] +itemcost[6]+itemcost[7]+itemcost[8];
        itemcost[11] = itemcost[9]+ itemcost[10];

        tax = String.format( "$%.2f",itemcost[11]/100);
        subtotal= String.format( "$%.2f",itemcost[11] );
        Total = String.format( "$%.2f", itemcost[11] + (itemcost[11]/100));

        System.out.println("======= Receipt =========");
        System.out.println("Quantity: "+ itemcost[11]);
        System.out.println("tax: "+ tax);
        System.out.println("subtotal: "+ subtotal);
        System.out.println("Total: "+ Total);

        taxField.setText( tax );
        subTotalField.setText( subtotal );
        netPayableField.setText( Total );

        /////////////////// RECEIPT//////////////////////////
        Receipt.setDisable( false );
        int refs = 100 +(int)(Math.random()*4);

        Calendar time = Calendar.getInstance( );
        time.getTime();
        SimpleDateFormat date = new SimpleDateFormat( "MM-dd-yyyy" );
        date.format(time.getTime());
        SimpleDateFormat Time = new SimpleDateFormat( "HH:mm:ss" );
        Time.format(time.getTime());

        //  ==============================================================
        Receipt.appendText( " 6P0S2 RECEIPT   \n" +
                "\nReference: \t\t" +refs +
            "\nDate:\t "+ date.format( time.getTime())+
                "\nTime: \t" +Time.format( time.getTime())+
           "\n+++++++++++++++++++++++++++++++++++++++++++++\t"+
                "\n++++++++++++++++++++++++++++++++++++\t"+

                  "\nQuantity: \t\t" + itemcost[11]+
                  "\nSubTotal: \t\t" + subtotal +
                  "\nTax: \t\t"+ tax +
                  "\nTotal: \t\t"+ Total+

                "\n++++++++++++++++++++++++++++++++++++++\t"+
           "\n++++++++++++++++++++++++++++++++++++++++++++++++\t");
         }



    @FXML
    private void resetbutton (javafx.event.ActionEvent reset){
        taxField.clear();
        subTotalField.clear();
        netPayableField.clear();
        ////////// items
        appletextfield.clear();
        bananatextfield.clear();
        bacontextfield.clear();
        grapetextfield.clear();
        lettucetextfiel.clear();
        orangetextfield.clear();
        strawberrytextfield.clear();
        blueberrytextfield.clear();
        peartextfield.clear();
//        AppleButton.cl
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initTime();
        AppleButton.setOnAction( this::applebutton );
        OrangeButton.setOnAction( this::orangebutton );
        BannaButton.setOnAction( this::bananabutton );
        GrapeButton.setOnAction( this::grapebutton );
        PearButton.setOnAction( this::pearbutton );
        LettuceButton.setOnAction( this::lettucebutton );
        StrawBerryButton.setOnAction( this::strawberrybutton );
        BlueBerryButton.setOnAction( this::blueberrybutton );
        BaconButton.setOnAction( this::baconbutton );
        TotalButton.setOnAction( this::getTotal );
        resetButton.setOnAction( this::resetbutton );
    }


    private void initTime(){
        HomeScreenController.initTime( localDateTime );
    }


    private void loadStages(String fxml)
    {
        Parent window1;
        try {
            window1 = FXMLLoader.load(getClass().getResource( fxml ));
            Stage homeScreenStage;
            Scene homeScreenScene = new Scene( window1 );
            homeScreenStage = POSRun.mainStage;
            homeScreenStage.setScene( homeScreenScene );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
