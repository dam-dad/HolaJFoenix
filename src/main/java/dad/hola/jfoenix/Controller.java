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
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.util.Duration;

public class Controller implements Initializable {

	@FXML
	private FontIcon topIcon;

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

		RadialGradient color = new RadialGradient(0, 0, 0.5, 0.5, 0.5, true, CycleMethod.NO_CYCLE,
			new Stop(0, Color.RED),
			new Stop(0.3, Color.GREEN),
			new Stop(1, Color.BLACK)
		); 
		
		topIcon.setIconColor(color);

	}

	public VBox getView() {
		return view;
	}

	@FXML
	void onSaludarAction(ActionEvent event) {

		Notifications.create()
			.graphic(FontIcon.of(Devicons.APPLE, 64, Color.GREEN))
			.title("Saludar")
			.text("¡Hola " + nombreText.getText() + "!")
			.hideAfter(Duration.seconds(5))
			.show();

	}

}
