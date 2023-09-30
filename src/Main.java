import javax.swing.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Bem vindo ao jogo de adivinhação! Você terá 5 chances de adivinhar um número de 0 a 100. \n Boa sorte! ");
        Numero num = new Numero();
        int x = 1;
        while (x == 1){
            int valor = num.geracao();
            int pergunta = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja fazer: \n 1 - Jogar \n 2- Sair"));
            if (pergunta == 1) {
                int i = 0;
                while (i <= 5) {
                    if (i < 5) {
                        int valUsuario = Integer.parseInt(JOptionPane.showInputDialog("Qual seu chute:"));
                        switch (num.comparacao(valor, valUsuario)) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou.");
                                i = 6;
                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null, "O valor é maior");
                                break;

                            case 3:
                                JOptionPane.showMessageDialog(null, "O valor é menor");
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Valor invalido");

                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Suas chances acabaram, o número era " + valor);
                    }
                    i++;
                }
            }
            else if(pergunta == 2){
                x = 0;
            }
            else {
                JOptionPane.showMessageDialog(null,"Valor invalido");
            }

        }
    }
}
