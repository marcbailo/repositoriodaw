import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Clica aquí");
        btn.setOnAction(e -> mostrarSaludo());
        primaryStage.setScene(new Scene(btn, 200, 100));
        primaryStage.setTitle("Aplicación JavaFX");
        primaryStage.show();
    }

    private void mostrarSaludo() {
        Stage saludoStage = new Stage();
        saludoStage.setScene(new Scene(new Button("Hola!"), 150, 75));
        saludoStage.setTitle("Saludo");
        saludoStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

