import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Objects;

public class menu {

    JPanel Operaciones;
    private JRadioButton saldoRadioButton;
    private JRadioButton depositoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton salirRadioButton;
    private JButton relizarButton;
    public static double saldo=1500;
    public menu(JFrame xd) {

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
                String opcion = seleccionado.getText ();
                switch (opcion) {
                    case "Saldo":
                        JFrame frame3 = new JFrame("Saldo");
                        frame3.setContentPane(new vistaSaldo(frame3, saldo).saldo);
                        /*frame3.setUndecorated(true);*/ /*Se quita por comleto las opciones de cerrar y demás pero no se mueve la pantalla*/
                        frame3.setResizable(false);/*No deja maximizar*/
                        frame3.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE); /*No permite que cierre la ventana*/
                        /*frame3.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);*//*Ni minimiza, ni cierra (No valio xd SOLO NO CIERRA)*/
                        frame3.setSize(500, 500);
                        System.out.println(saldo);
                        frame3.setVisible(true);
                        xd.dispose();
                        break;
                    case "Retiro":
                        JFrame frame4 = new JFrame("Retiro");
                        frame4.setContentPane(new retiros(frame4, saldo).retiro);
                        frame4.setResizable(true);
                        frame4.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
                        frame4.setSize(500, 500);
                        frame4.setVisible(true);
                        xd.dispose();
                        break;
                    case "Deposito":
                        JFrame frame5 = new JFrame("Deposito");
                        frame5.setContentPane(new depositos(frame5, saldo).deposito);
                        frame5.setResizable(true);
                        frame5.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
                        frame5.setSize(500, 500);
                        frame5.setVisible(true);
                        xd.dispose();
                        break;
                    case "Salir":
                        JOptionPane.showMessageDialog(null, "Muchas gracias");
                        xd.dispose();
                        break;
                }
            }
        });
    }
}
