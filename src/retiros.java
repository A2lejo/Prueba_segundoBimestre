import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class retiros extends JFrame{
    private JTextField cantidadRE;
    JPanel retiro;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton enterButton;
    private JButton menuButton;

    public retiros(JFrame xd) {
        cantidadRE.setText("$");
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidadRE.setText(cantidadRE.getText()+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidadRE.setText(cantidadRE.getText()+"2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidadRE.setText(cantidadRE.getText()+"3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidadRE.setText(cantidadRE.getText()+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidadRE.setText(cantidadRE.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidadRE.setText(cantidadRE.getText()+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidadRE.setText(cantidadRE.getText()+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidadRE.setText(cantidadRE.getText()+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidadRE.setText(cantidadRE.getText()+"9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidadRE.setText(cantidadRE.getText()+"0");
            }
        });
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Operacion realizada");
            }
        });
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xd.dispose();
                JFrame pantallaAnterior = new JFrame("Transaccion a realizar");
                pantallaAnterior.setContentPane(new menu(pantallaAnterior).Operaciones);
                pantallaAnterior.pack();
                pantallaAnterior.setSize(500,500);
                pantallaAnterior.setVisible(true);
            }
        });
    }
}
