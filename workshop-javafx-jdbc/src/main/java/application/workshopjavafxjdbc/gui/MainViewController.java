package application.workshopjavafxjdbc.gui;

import application.workshopjavafxjdbc.Main;
import application.workshopjavafxjdbc.gui.util.Alerts;
import application.workshopjavafxjdbc.model.services.DepartmentService;
import application.workshopjavafxjdbc.model.services.SellerService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

public class MainViewController implements Initializable {

    @FXML
    private MenuItem menuItemSeller;

    @FXML
    private MenuItem menuItemDepartment;

    @FXML
    private MenuItem menuItemAbout;

    @FXML
    public void onMenuItemSellerAction(){
        loadView("SellerList.fxml", (SellerListController controler)->{
            controler.setSellerService(new SellerService());
            controler.UpdateTableView();
        });

    } @FXML
    public void onMenuItemDepartmentAction(){
        loadView("DepartmentList.fxml", (DepartmentListController controler)->{
            controler.setDepartmentService(new DepartmentService());
            controler.UpdateTableView();
        });
    }



    @FXML
    public void onMenuItemAboutAction(){
       loadView("About.fxml", x ->{});
    }



    @Override
    public void initialize(URL uri, ResourceBundle rb) {

    }

    private synchronized <T> void loadView(String absoluteName, Consumer<T> initializingAction){

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
            VBox newVbox = loader.load();

            Scene mainScene = Main.getMainScene();
            VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

            Node mainMenu = mainVBox.getChildren().get(0);
            mainVBox.getChildren().clear();
            mainVBox.getChildren().add(mainMenu);
            mainVBox.getChildren().addAll(newVbox.getChildren());

            T controller = loader.getController();
            initializingAction.accept(controller);

        } catch (IOException e) {
            Alerts.showAlert("IO Exception", "Error loading view",e.getMessage(), Alert.AlertType.ERROR);
        }

    }





}
