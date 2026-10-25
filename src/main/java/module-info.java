module hu_cintia_elegant.burgundi {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens hu_cintia_elegant.burgundi to javafx.fxml;
    exports hu_cintia_elegant.burgundi;
}