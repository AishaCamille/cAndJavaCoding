import java.util.*;

public class Alienvogais {
    public static void contadorVogais(String vogais, String frase){
        int contador=0;

        for(int i=0; i<vogais.length(); i++){
            for(int j=0; j<frase.length(); j++){
                if(vogais.charAt(i)==frase.charAt(j)){
                    contador++;
                }
            }
        }
        System.out.println(contador);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){
        String vogais= sc.next();
        sc.nextLine();//captuura a quebra de linha
        String frase= sc.nextLine();
        contadorVogais(vogais, frase);
        }
        

        

    }
    
}
