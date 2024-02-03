import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vistaSaldo extends JFrame {
    JPanel saldo;
    private JButton menuButton;
    private JLabel saldoJL;

    public vistaSaldo(JFrame xd, double Nuevosaldo) {

        saldoJL.setText("Saldo: $" + String.valueOf(Nuevosaldo));
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame pantallaAnterior = new JFrame("Transaccion a realizar");
                pantallaAnterior.setContentPane(new menu(pantallaAnterior).Operaciones);
                pantallaAnterior.pack();
                pantallaAnterior.setSize(500,500);
                pantallaAnterior.setVisible(true);
                xd.dispose();
            }
        });
    }
}
