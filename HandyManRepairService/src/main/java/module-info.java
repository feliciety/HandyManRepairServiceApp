module project.handymanrepairservice {
    requires javafx.controls;
    requires javafx.fxml;


    opens project.handymanrepairservice to javafx.fxml;
    exports project.handymanrepairservice;
}