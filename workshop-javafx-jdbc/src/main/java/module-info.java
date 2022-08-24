module application.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.workshopjavafxjdbc to MainView.fxml;
    exports application.workshopjavafxjdbc;
}