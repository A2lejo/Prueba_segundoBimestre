import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class retiros{
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
    private JButton corregirButton;

    public retiros() {

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
                double cantidad = Double.parseDouble(cantidadRE.getText());
                if (cantidad%10!=0){
                    JOptionPane.showMessageDialog(null, "Ingrese valores mayores o multiplos de $10");
                }
                else{
                    if (cantidad<=menu.saldo){
                        menu.saldo-=cantidad;
                        JOptionPane.showMessageDialog(null,"Retiro exitoso");
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"ERROR, " +
                                "cantidad de dinero insuficiente\n Cantidad disponible: "+ menu.saldo);
                    }
                }
            }
        });
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Transacción cancelada");
                Main.framebase.setContentPane(new menu().Operaciones);
                Main.framebase.revalidate();
            }
        });
        corregirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidadRE.setText("");
            }
        });
    }

}
