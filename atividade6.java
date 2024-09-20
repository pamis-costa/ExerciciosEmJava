import javax.swing.JOptionPane;

public class atividade6 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
        JOptionPane.showMessageDialog(null, "Seu nome é: " + nome);
    }
}
