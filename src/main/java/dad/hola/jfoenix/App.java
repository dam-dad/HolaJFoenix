package dad.hola.jfoenix;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private Controller controller = new Controller();
	
	public static Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		App.primaryStage = primaryStage;
		
		primaryStage.setTitle("Hola JFoenix");
		primaryStage.setScene(new Scene(controller.getView()));
		primaryStage.show();
		
	}

}
