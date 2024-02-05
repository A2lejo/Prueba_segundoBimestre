import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class menu {
    JPanel Operaciones;
    private JRadioButton saldoRadioButton;
    private JRadioButton depositoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton salirRadioButton;
    private JButton relizarButton;
    private JButton salirButton;
    static double saldo = 1500000;
    public menu() {
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(saldoRadioButton);
        grupo.add(retiroRadioButton);
        grupo.add(depositoRadioButton);
        grupo.add(salirRadioButton);
        relizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonModel modelo= grupo.getSelection();
                if(modelo == null){
                    JOptionPane.showMessageDialog(null,"Seleccione una opción");
                }
                Enumeration<AbstractButton> elementos = grupo.getElements();
                JRadioButton seleccionado = null;
                while (elementos.hasMoreElements ()) {
                    JRadioButton elemento = (JRadioButton) elementos.nextElement ();
                    if (elemento.getModel () == modelo) {
                        seleccionado = elemento;
                        break;
                    }
                }
                assert seleccionado != null;

                String opcion = seleccionado.getText();
                switch (opcion) {
                    case "Saldo":
                        Main.framexd.setContentPane(new vistaSaldo().saldo);
                        Main.framexd.revalidate();
                        break;
                    case "Retiro":
                        Main.framexd.setContentPane(new retiros().retiro);
                        Main.framexd.revalidate();
                        break;
                    case "Deposito":
                        Main.framexd.setContentPane(new depositos().deposito);
                        Main.framexd.revalidate();
                        break;
                    case "Salir":
                        JOptionPane.showMessageDialog(null, "Muchas gracias");
                        //xd.dispose();
                        break;
                }
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
