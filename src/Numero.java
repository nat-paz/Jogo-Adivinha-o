import java.util.Random;

public class Numero {

    public Numero(){

    }
    Random ger = new Random();
    public int geracao(){
        return ger.nextInt(101);
    }

    public int comparacao(int valor, int pergunta){
        if (valor == pergunta){
            return 1;
        }
        else if (valor > pergunta) {
            return 2;
        }
        else{
            return 3;
        }
    }
}
