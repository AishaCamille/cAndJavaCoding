import java.util.*;

class ArredondamentoPorValordeCorte {

    public static void main(String[] args) {
        /*duas entradas string, a primeira sendo o numero em si
        a segunda o valor do corte, se o numero após a virgula for
    /maior que o numero de corte, arendodamos o valor antes da
    virgula para cima, se for menor, mantemos o valor
       */ 

        Scanner sc= new Scanner(System.in);
        String NumeroNormal= sc.next();
        String ValorDeCorte= sc.next();
        sc.nextLine();
        String numSemVi="";
        int i=0, num=0;
        while(NumeroNormal.charAt(i)!='.'){
            numSemVi+=NumeroNormal.charAt(i);
            i++;
       }
        num=Integer.parseInt(numSemVi);//numero a ser somado ou não

       String numDepoisVi="";
       i++;
       while(i<NumeroNormal.length()){
        numDepoisVi+=NumeroNormal.charAt(i);
        i++;
       }
       int numDepois=Integer.parseInt(numDepoisVi);

        int j=0;
       while(ValorDeCorte.charAt(j)!='.'){
        j++;
       }
       j++;
       String numDeCorte= "";
       while(j<ValorDeCorte.length()){
            numDeCorte+=ValorDeCorte.charAt(j);
            j++;
       }

       int verificador=Integer.parseInt(numDeCorte);

       if(verificador<numDepois){
            num++;
       }

       System.out.println(num);
    }
}