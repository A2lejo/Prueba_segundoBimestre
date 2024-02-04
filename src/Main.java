import javax.swing.*;

public class Main {
    public static JFrame framexd = new JFrame("Pantallas");
    public static void main(String[] args) {
        //JFrame frame = new JFrame("Bienvenido al banco");
        framexd.setContentPane(new inicioSesion(framexd).inicio);
        framexd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framexd.pack();
        framexd.setSize(500,500);
        framexd.setVisible(true);
    }
}