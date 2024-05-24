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


 estadoLabel = new JLabel("Estat del Robot: (0, 0) Direcció: Nord");
        moverEndavantButton = new JButton("Moure Endavant");
        moverEnrereButton = new JButton("Moure Enrere");
        girarEsquerraButton = new JButton("Girar Esquerra");
        girarDretaButton = new JButton("Girar Dreta");
        guardarEstatButton = new JButton("Guardar Estat");
        carregarEstatButton = new JButton("Carregar Estat");    








  
}
