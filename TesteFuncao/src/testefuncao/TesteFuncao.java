package testefuncao;

/**
 * @since 15/11/2023
 * @author myckazs
 */
public class TesteFuncao {

    //Procedimento
//    static void soma(int a, int b) { //Para funcionar tem que ser estático - Add Static antes de void
//        int s = a + b;
//        System.out.print(s);
//    }
//
//    public static void main(String[] args) {
//        soma(2, 3);
//    }

    //função
//    static int soma(int a, int b) { //Para chamar o método no main tem que ser estático - Add Static antes de int
//        int s = a + b;
//        return s;
//    }
    
    //static - Não precisa transforma-lo em Objeto para poder utiliza-lo
    
    //void - Não retorna valor

    public static void main(String[] args) { //String[] args - Vetor de String
        System.out.println(Operacao.contador(2,3));
    }

}
