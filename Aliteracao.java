import java.util.*;

public class Aliteracao {
    public static void contaAliteacoes(String[] texto){
        int cont=0;
        for(int i=0; i<texto.length; i++){
            String palavra= texto[i];
            char letra= palavra.charAt(0);
            String palavra2= texto[i++];
            char letra2= palavra.charAt(0);
            if(letra == letra2){
                cont++;
            }


        }
        System.out.println(cont);


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int contador=0;
        while(sc.hasNext()){
            String frase= sc.nextLine();
            String[] fraseSeparada= frase.split(" ");
            contaAliteacoes(fraseSeparada);
         }
    }
}
