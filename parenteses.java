/*
 * 1- tirar tudo que não é um parenteses= substitui por 0, retira os 0 diminuindo o tamanho da string ou mudando de lugar
 * ex: a(a b m)
 * se a posisão 0 é diferente de ( ou de ), a gente tira ela, coloca a proxima posição no lugar dela, realocando as posiçoes, até so sobrar os ()
 * 2- verificamaos quantos (, salvamos o numero da quantidade de parenteses, e depois verificamos quantos parenteses ) há, se o numero for diferente, devolvemos incorreto
 LAB03Q01 - Balanço Parênteses
 */
import java.util.Scanner;

public class parenteses {
    static String limparExpressao(String expressao) {
        StringBuilder expressaoLimpa = new StringBuilder();
    
        // atribiu um caracter a C
        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);
            // Adicionar somente caracteres que são '(' ou ')'
            if (c == '(' || c == ')') {
                expressaoLimpa.append(c);
            }
        }
        
        return expressaoLimpa.toString();
    }
    

    

   static boolean IncorretoCorreto(String expressao){
        int parentesesEsq=0, parentesesDir=0;
        char teste;
     //atribui cada caracter de expressao a teste para comprara se os parenteses são compatíveis
        for(int i=0; i<expressao.length(); i++){
            teste= expressao.charAt(i);
            if(teste=='('){
                parentesesEsq++;
            } else if(teste==')'){
                parentesesDir++;
            }
        }
        System.out.println("há "+parentesesEsq+ " ( e há "+parentesesDir+" )");
     //se a quantidade de parenteses for diferente, devolve falso e incorreto
        if(parentesesDir!=parentesesEsq){
            System.out.println("incorreto");
            return false;
        }else{//se for iguais, devolve true e correto
            System.out.println("correto");
            return true;
        }
    }


//main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expressao= new String();
        String expressao2= new String();

      //while infinito até não houver proxima linha
            while(sc.hasNext()){
            expressao=sc.next(); 
              //chamada de funções
               expressao2= limparExpressao(expressao);
              IncorretoCorreto(expressao2);
              if(expressao=="FIM"){
                break;
            }
            }

       //fechando scanner
      sc.close();
    }
}
