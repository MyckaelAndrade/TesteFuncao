package testefuncao;

public class Operacao {
    
    //publico - pode ser acessado por qualquer pessoa\método
    //private - não pode ser chamado em outro método

    public static String contador(int i, int j) {
        String s = " ";
        for (int c = 0; c <= j; c++) {
            s += c + " ";
        }
        return s;
    }
}
