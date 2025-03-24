module com.example.apiviewerapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.apiviewerapp to javafx.fxml;
    exports com.example.apiviewerapp;
}