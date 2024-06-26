import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class robot extends JFrame {

private JLabel estadoLabel;
private JButton moverEndavantButton;
private JButton moverEnrereButton;
private JButton girarEsquerraButton;
private JButton girarDretaButton;
private JButton guardarEstatButton;
private JButton carregarEstatButton;

  private int x = 0;
  private int y = 0;
  private String direccion = "Nord";

  
  public robot() {
        setTitle("Control de Robot");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 5, 5));


 estadoLabel = new JLabel("Estat del Robot: (0, 0) Direcció: Nord");
        moverEndavantButton = new JButton("Moure Endavant");
        moverEnrereButton = new JButton("Moure Enrere");
        girarEsquerraButton = new JButton("Girar Esquerra");
        girarDretaButton = new JButton("Girar Dreta");
        guardarEstatButton = new JButton("Guardar Estat");
        carregarEstatButton = new JButton("Carregar Estat"); 

    
  panel.add(moverEndavantButton);
        panel.add(moverEnrereButton);
        panel.add(girarEsquerraButton);
        panel.add(girarDretaButton);
        panel.add(guardarEstatButton);
        panel.add(carregarEstatButton);

        add(estadoLabel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);


   moverEndavantButton.addActionListener(e -> moverEndavant());
    moverEnrereButton.addActionListener(e -> moverEnrere());
    girarEsquerraButton.addActionListener(e -> girarEsquerra());
    girarDretaButton.addActionListener(e -> girarDreta());
    guardarEstatButton.addActionListener(e -> guardarEstat());
    carregarEstatButton.addActionListener(e -> carregarEstat());

  }
 
  
  private void moverEndavant() {
        switch (direccion) {
            case "Nord":
                y++;
                break;
            case "Est":
                x++;
                break;
            case "Sud":
                y--;
                break;
            case "Oest":
                x--;
                break;
        }
        actualizarEstado();
    }

    private void moverEnrere() {
        switch (direccion) {
            case "Nord":
                y--;
                break;
            case "Est":
                x--;
                break;
            case "Sud":
                y++;
                break;
            case "Oest":
                x++;
                break;
        }
        actualizarEstado();
    }

  private void girarEsquerra() {
        switch (direccion) {
            case "Nord":
                direccion = "Oest";
                break;
            case "Est":
                direccion = "Nord";
                break;
            case "Sud":
                direccion = "Est";
                break;
            case "Oest":
                direccion = "Sud";
                break;
        }
        actualizarEstado();
    }

    private void girarDreta() {
        switch (direccion) {
            case "Nord":
                direccion = "Est";
                break;
            case "Est":
                direccion = "Sud";
                break;
            case "Sud":
                direccion = "Oest";
                break;
            case "Oest":
                direccion = "Nord";
                break;
        }
        actualizarEstado();
    }

private void guardarEstat() {
        try (PrintWriter writer = new PrintWriter(new File("robot_state.txt"))) {
            writer.println(x + "," + y + "," + direccion);
            JOptionPane.showMessageDialog(this, "Estado guardado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   private void carregarEstat() {
        try (BufferedReader reader = new BufferedReader(new FileReader("robot_state.txt"))) {
            String[] estado = reader.readLine().split(",");
            x = Integer.parseInt(estado[0]);
            y = Integer.parseInt(estado[1]);
            direccion = estado[2];
            actualizarEstado();
            JOptionPane.showMessageDialog(this, "Estado cargado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  private void actualizarEstado() {
        estadoLabel.setText("Estat del Robot: (" + x + ", " + y + ") Direcció: " + direccion);
        System.out.println("Estat del Robot: (" + x + ", " + y + ") Direcció: " + direccion);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ControlDeRobot().setVisible(true));
    }
    
  
}
