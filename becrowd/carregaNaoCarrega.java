/*
6+9=15 parece ok. Mas como pode estar certo 4+6=2?

Veja só. Mofiz trabalhou duro durante seu curso de Eletrônica Digital, mas quando lhe foi solicitado que implementasse um somador de 32 bits como exame no laboratório, ele acabou fazendo algum erro na parte de projeto. Depois de vasculhar seu projeto por uma hora e meia, ele encontrou seu erro. Ele estava fazendo soma de bits, mas seu carregador de bit (carry) sempre apresentava como saída o valor zero. Portanto,

4  = 00000000 00000000 00000000 00000100
+6 = 00000000 00000000 00000000 00000110
----------------------------------------
2  = 00000000 00000000 00000000 00000010


Claro que já é uma boa coisa ele finalmente ter encontrado o seu erro, mas isso foi muito tarde. Considerando seu esforço durante o curso, o instrutor deu a ele mais uma chance: Mofiz teria que escrever um programa eficiente que pegaria 2 valores decimais de 32 bits sem sinal como entrada e deveria produzir um número de 32 bits sem sinal como saída, ou seja, somando do mesmo modo como o circuito faz.

Entrada
Em cada linha de entrada haverá um par de inteiros separado por um único espaço. A entrada termina com EOF.

Saída
Para cada linha de entrada, o programa deverá fornecer uma linha de saída, que é o valor após somar dois números no modo “Mofiz”.
*/

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in); // Declare the Scanner
    // Lê os dois números
    int n1,n2;

    int rese=0;
    int[] vn1 = { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
 };
    int[] vn2 = { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
 };
    int[] v3 = { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
 };
    // System.out.println(n1);
    while (scanner.hasNextInt()) {
      // Lê os dois números
       n1 = scanner.nextInt();
       n2 = scanner.nextInt();
      if(n1<0||n2<0){
        System.out.println("Numero negativo!");
      }else{
    for (int i = vn1.length; n1 > 0 && i > 0; i--) {
      vn1[i - 1] = n1 % 2;
      n1 = n1 / 2;
      if (n1 / 2 < 0) {
        vn1[i - 1] = n1;
      }
    }
    for (int i = vn2.length; n2 > 0 && i > 0; i--) {
      vn2[i - 1] = n2 % 2;
      n2 = n2 / 2;
      if (n2 / 2 < 0) {
        vn2[i - 1] = n2;
      }
    }

    for (int i = 0; i < v3.length; i++) {
      if (vn1[i] == vn2[i]) {
        v3[i] = 0;
      } else {
        v3[i] = 1;
      }
    }

    for (int i = v3.length, j = 0; j < i; j++, i--) {
      rese+= v3[i-1]*Math.pow(2, j);
    }
    System.out.println(rese);

  }}
    scanner.close();  
}

}
