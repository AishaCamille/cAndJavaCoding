import java.util.*;
public class Sorveteiro {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tamanhoTotal= sc.nextInt();
        int sorveteiros= sc.nextInt();
        int teste=1;

        while (tamanhoTotal!=0 && sorveteiros!=0){
           
            int[] praia= new int[tamanhoTotal+1];

            int tam= praia.length;
           // int rotas= sorveteiros*2;
           

            while(sorveteiros>0){
                 int inicio= sc.nextInt();
                 int fim=sc.nextInt();
                for(int i=inicio; i<=fim; i++){
                    praia[i]=1;
                }
                sorveteiros--;
            }

            int i=0;
          System.out.println("Teste "+ teste);
            while (i<= tamanhoTotal){
                if(praia[i] ==1){
                    int inicio=i;
                    while(i<= tamanhoTotal && praia[i]==1){
                        i++;
                    }
                    int fim=i-1;
                    System.out.println(inicio+" "+fim);
                }else{
                    i++;
                }
            }






            teste++;
            tamanhoTotal=sc.nextInt();
            sorveteiros= sc.nextInt();
        }
        sc.close();
    }
}
