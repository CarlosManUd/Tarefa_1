package tarefa_1;

import javax.swing.*;

/**
 *
 * @author carli
 */
public class Main {
    JFrame marco;
    JButton boton,boton2;
    JLabel etiqueta,etiqueta2;
    JPanel panel;
    JTextField texto,texto2;
    JTextArea area;
    
    public Main(){
        
        marco = new JFrame( "componentes: ");
        panel = new JPanel();
        etiqueta = new JLabel();
        etiqueta2 = new JLabel();
        texto = new JTextField();
        texto2 = new JTextField();
        boton = new JButton(" botón 1 ");
        boton2 = new JButton(" botón 2 ");
        area = new JTextArea(" text area ");
        marco.setSize(900,600);
        panel.setSize(900,600);
        etiqueta.setText("nombre: ");
        texto.setSize(300,300);
        texto.setText(" ");
        etiqueta2.setText("edad: ");
        
        texto2.setSize(300,300);
        texto2.setText(" ");
        
        area.setSize(300,600);
        
        panel.add(etiqueta);
        panel.add(texto);
        panel.add(etiqueta2);
        panel.add(texto2);
        panel.add(area);
        panel.add(boton);
        panel.add(boton2);
        
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
}