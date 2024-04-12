package br.com.joaocarloslima;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("view" + ".fxml"));
        Parent root = fxmlLoader.load();
        Controller controller = fxmlLoader.getController();
        scene = new Scene(root, 640, 480);

        scene.addEventFilter(KeyEvent.KEY_PRESSED, controller::keyHandler);
        stage.setTitle("Space Objects");
        stage.setResizable(false);
        stage.getIcons().add(new Image("file:src/main/resources/br/com/joaocarloslima/images/icon.png"));


        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}