import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Robot extends JFrame {

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

  
  public Robot() {
        setTitle("Control de Robot");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 5, 5));








  
}
