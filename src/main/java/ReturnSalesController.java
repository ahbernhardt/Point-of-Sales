//package App_Interface.POS;
//
//import App_Interface.LoginandHomeScreen.HomeScreenController;
//import App_Interface.Main;
//
//import javafx.fxml.main.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.stage.Stage;
//import java.io.IOException;
//import java.net.URL;
//import java.util.ResourceBundle;
//
//public class ReturnSalesController implements Initializable {
//
////    @main.FXML
////    private TableView<?> productTableView;
////
////    @main.FXML
////    private TableColumn<?, ?> productColumn;
////
////    @main.FXML
////    private TableView<?> listTableView;
////
////    @main.FXML
////    private TableColumn<?, ?> itemColumn;
////
////    @main.FXML
////    private TableColumn<?, ?> priceColumn;
////
////    @main.FXML
////    private TableColumn<?, ?> quantityColumn;
////
////    @main.FXML
////    private TableColumn<?, ?> totalColumn;
////
////    @main.FXML
////    private Button addButton;
////
////    @main.FXML
////    private Button removeButton;
////
////    @main.FXML
////    private Button resetButton;
////
////    @main.FXML
////    private TextField productField;
////
////    @main.FXML
////    private TextField priceField;
////
////    @main.FXML
////    private TextArea descriptionArea;
////
////    @main.FXML
////    private TextField quantityField;
////
////    @main.FXML
////    private Label quantityLabel;
////
////    @main.FXML
////    private TextField subTotalField;
////
////    @main.FXML
////    private TextField vatField;
////
////    @main.FXML
////    private TextField netPayableField;
////
////    @main.FXML
////    private Button paymentButton;
////
////    @main.FXML
////    private Label Username_Label;
////
//    @main.FXML
//    private Label localDateTime;
//
////    @main.FXML
////    private Button Item_Button;
////
////    @main.FXML
////    private Button Sales_Button;
////
////    @main.FXML
////    private Button User_Button;
////
////    @main.FXML
////    private Button Home_Button;
////
////    @main.FXML
////    private Button Inventory_Button;
//
//    @main.FXML
//    private Button Logout;
//
//
//
//    @main.FXML
//   public void handleButtonClicks(javafx.event.ActionEvent actionEvent)
//        {
////        if ( actionEvent.getSource() == Home_Button)
////        {
////            loadStages( "/Dashboard/HomeScreen.fxml" );
////        }
////        else if ( actionEvent.getSource() == Item_Button)
////        {
////            loadStages( "/Dashboard/Item/ItemsList.fxml" );
////        }
////        else if ( actionEvent.getSource() == User_Button)
////        {
////            loadStages( "/Dashboard/Users/UserMain.fxml" +
////                    ".fxml" );
////        }
////        else if ( actionEvent.getSource() == Sales_Button)
////        {
////            loadStages( "/Dashboard/POS/Sales.fxml" );
////        }
////        else if ( actionEvent.getSource() == Inventory_Button)
////        {
////            loadStages( "/Dashboard/Inventory/InventoryReport.fxml" );
////        }
//            if (actionEvent.getSource() == Logout)
//            {
//                loadStages();
//            }
//
//        }
//
//
//
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//        initTime();
//    }
//
//
//    private void initTime(){
//        HomeScreenController.initTime( localDateTime );
//    }
//
//
//    private void loadStages()
//    {
//        Parent window1;
//        try {
//            window1 = FXMLLoader.load(getClass().getResource( "/App_Interface/LoginandHomeScreen/Login.fxml" ));
//            Stage homeScreenStage;
//            Scene homeScreenScene = new Scene( window1 );
//            homeScreenStage = Main.mainStage;
//            homeScreenStage.setScene( homeScreenScene );
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
