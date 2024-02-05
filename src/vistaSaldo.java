import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vistaSaldo extends JFrame {
    JPanel saldo;
    private JButton menuButton;
    private JLabel saldoJL;

    public vistaSaldo() {

        saldoJL.setText("Saldo: $" + String.valueOf(menu.saldo));
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.framexd.setContentPane(new menu().Operaciones);
                Main.framexd.revalidate();
            }
        });
    }
}
