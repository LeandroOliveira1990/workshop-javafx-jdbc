module application.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.workshopjavafxjdbc to javafx.fxml;
    exports application.workshopjavafxjdbc;
}