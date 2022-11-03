module com.dev.projkotlin {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;

    requires org.kordamp.bootstrapfx.core;

    opens com.dev.projkotlin to javafx.fxml;
    exports com.dev.projkotlin;
}