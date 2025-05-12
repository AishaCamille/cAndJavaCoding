import java.util.*;

public class MensagemOculta {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numTeste=sc.nextInt();
        sc.nextLine();


        for(int i=0; i<numTeste; i++){
            String s= sc.nextLine();
            String code="";
            int j=0;

            for ( j = 0; j < s.length(); j++) {
                if(j==0 && s.charAt(j)!=' '){

                    code+=s.charAt(j);//verifica se a primeira posicao não é um espaço

                    } else if (j > 0 && s.charAt(j) != ' '
                     && s.charAt(j - 1) == ' ') {
                    // Primeira letra depois de um espaço
                    code += s.charAt(j);
                }
                
            }
            System.out.println(code);
        }
        
    }
}
