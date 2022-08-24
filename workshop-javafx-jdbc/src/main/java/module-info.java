module application.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.workshopjavafxjdbc to MainView.fxml;
    opens application.workshopjavafxjdbc.gui;
    opens application.workshopjavafxjdbc.gui.util;
    exports application.workshopjavafxjdbc;
}