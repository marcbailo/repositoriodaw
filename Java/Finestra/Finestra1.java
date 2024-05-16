import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

class Finestra1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Finestra d'exemple");
        JButton button = new JButton("Clic aqui");

        frame.add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}