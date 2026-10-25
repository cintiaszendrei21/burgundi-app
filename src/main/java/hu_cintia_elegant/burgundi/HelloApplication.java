package hu_cintia_elegant.burgundi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("A te stílusod");
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("stilus.css").toExternalForm());
        stage.show();
    }
}
