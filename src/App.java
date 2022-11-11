
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        

        Scene scene = new Scene(FXMLLoader.load(App.class.getResource("Login.fxml")));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}