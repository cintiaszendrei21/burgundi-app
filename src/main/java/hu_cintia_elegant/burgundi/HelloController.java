package hu_cintia_elegant.burgundi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onGardrobButtonClick(){
        System.out.println("Gardrób gomb");
    }
    @FXML
    protected void onHelloButtonClick() {
        System.out.println("Harmónia gomb");
    }
}
