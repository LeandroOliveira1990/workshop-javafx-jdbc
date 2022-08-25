package application.workshopjavafxjdbc.gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class util {

    public static Stage currentStage(ActionEvent event){

        return (Stage) ((Node)event.getSource()).getScene().getWindow();

    }

}
