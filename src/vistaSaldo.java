import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vistaSaldo extends JFrame {
    JPanel saldo;
    private JButton menuButton;
    private JLabel saldoJL;

    public vistaSaldo(JFrame xd) {

        saldoJL.setText("Saldo: $" + String.valueOf(menu.saldo));
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.framexd.setContentPane(new menu(Main.framexd).Operaciones);
                Main.framexd.revalidate();
            }
        });
    }
}
