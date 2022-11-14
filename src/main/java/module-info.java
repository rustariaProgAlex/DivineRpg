module com.main {
    requires javafx.controls;
    requires javafx.fxml;
    opens com.dev to javafx.fxml;
    exports com.dev;
}
