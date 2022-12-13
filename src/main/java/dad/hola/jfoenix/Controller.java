package dad.hola.jfoenix;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.controlsfx.control.Notifications;
import org.kordamp.ikonli.devicons.Devicons;
import org.kordamp.ikonli.javafx.FontIcon;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Controller implements Initializable {


    @FXML
    private JFXTextField nombreText;

    @FXML
    private JFXButton saludarButton;

    @FXML
    private VBox view;

	public Controller() {
		try { 
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
	
	public VBox getView() {
		return view;
	}

    @FXML
    void onSaludarAction(ActionEvent event) {

    	FontIcon icon = FontIcon.of(Devicons.APPLE, 32, Color.GREEN);
    	
    	Notifications.create()
    		.graphic(icon)
    		.title("Saludar")
    		.text("Hola " + nombreText.getText())
    		.hideAfter(Duration.seconds(5))
    		.show();
    	
    }	

}
