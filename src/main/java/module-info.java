module com.example.practicafxjson {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.fasterxml.jackson.databind;

    opens com.example.practicafxjson to javafx.fxml;
    exports com.example.practicafxjson;
}