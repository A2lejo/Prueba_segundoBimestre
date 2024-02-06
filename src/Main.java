import javax.swing.*;

public class Main {
    static JFrame framebase = new JFrame("Banco del Búho"); // Sirve para usar el atributo desde otras clases sin instanciar el objeto, se puede considerar una variable global
    public static void main(String[] args) {
        //JFrame frame = new JFrame("Bienvenido al banco");
        framebase.setContentPane(new inicioSesion().inicio);
        framebase.setUndecorated(true);
        framebase.setLocationRelativeTo(null);
        framebase.pack();
        framebase.setSize(500,500);
        framebase.setVisible(true);
    }
}