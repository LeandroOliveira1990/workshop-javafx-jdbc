module application.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens application.workshopjavafxjdbc to MainView.fxml;
    opens application.workshopjavafxjdbc.gui;
    opens application.workshopjavafxjdbc.gui.util;
    opens application.workshopjavafxjdbc.model.entities;

    exports application.workshopjavafxjdbc;
}