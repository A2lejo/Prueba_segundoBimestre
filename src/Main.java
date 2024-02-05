import javax.swing.*;

public class Main {
    static JFrame framexd = new JFrame("Banco del Búho"); // Sirve para usar el atributo desde otras clases sin instanciar el objeto, se puede considerar una variable global
    public static void main(String[] args) {
        //JFrame frame = new JFrame("Bienvenido al banco");
        framexd.setContentPane(new inicioSesion().inicio);
        framexd.setUndecorated(true);
        framexd.setLocationRelativeTo(null);
        framexd.pack();
        framexd.setSize(500,500);
        framexd.setVisible(true);
    }
}