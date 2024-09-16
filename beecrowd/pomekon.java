import java.util.Scanner;

public class pomekon {

    static int pokemonsCap(String[] pokebola){
        int contador=0;
        String[] Nova;
        //troca por 0 os valores iguais
        for(int j=0; j<pokebola.length; j++){
            for(int i=j+1; i<pokebola.length; i++){
                if(pokebola[i].equals(pokebola[j])){
                    pokebola[i]="0";
                }
            }
        }
        //conta quantos valores sobraram
for(int i=0; i<pokebola.length; i++){
    if(pokebola[i]=="0"){
        contador++;
    }
}
contador=pokebola.length-contador;
//adc o valor dos valores que sobraram na nova String[] e depois os ad a ela
Nova= new String[contador];
for(int i=0; i<pokebola.length;i++){
    if(pokebola[i]!="0"){
        Nova[i]=pokebola[i];
    }
}
return 151-contador;
    }
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos pk já capturou? ");
        int capt = scanner.nextInt();
        String[] pokemons= new String[capt];
        for(int i=0; i<pokemons.length; i++){
            pokemons[i]=scanner.next();
        }
        System.out.println("capturados: "+pokemonsCap(pokemons));


    }
}
