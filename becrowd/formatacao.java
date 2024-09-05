/*
justificador II
Nós temos alguns textos e queremos formatá-los e justificá-los à direita, ou seja, alinhar suas linhas à margem direita de cada um. Crie um programa que, após ler um texto, reimprima esse texto com apenas um espaço entre as palavras e suas linhas justificadas à direita em todo o texto.

Entrada
A entrada contém diversos casos de teste. A primeira linha de cada caso de teste contém um inteiro N (1 ≤ N ≤ 100) que indica o número de linhas de texto que virão a seguir. Cada uma destas N linhas de texto contém de 1 a 50 letras maiúsculas (‘A’-‘Z’) ou espaços (‘ ’). Todas as linhas de texto contém no mínimo uma letra. Poderá haver mais de um espaço entre as palavras. É também possível haver espaços no início e no final da linha. O fim da entrada é indicado por N = 0.

Saída
Para cada caso de teste imprima o texto com apenas um espaço entre as palavras, e inserindo tantos espaços quanto forem necessários à esquerda de cada linha do texto, para que elas apareçam alinhadas à margem direita daquele texto, e na mesma ordem da entrada. Deixe uma linha em branco entre os casos de testes. Não imprima espaços no final de cada linha, nem espaços desnecessários à esquerda, de modo que pelo menos uma das linhas impressa em cada texto inicie com uma letra.


*/
package orgulho;

import java.util.Scanner;

public class formatacao {
    // Método para remover espaços desnecessários
    private static String removerEspacosDesnecessarios(String texto) {
        return texto.trim().replaceAll("\\s+", " "); // Remove espaços extras e normaliza para um espaço entre palavras
    }
    public static boolean isUpperCaseString(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // Pega o caractere da posição 'i'
            if (!Character.isUpperCase(c) && !Character.isWhitespace(c)) {
                return false; // Retorna false se algum caractere não for maiúsculo ou espaço
            }
        }
        return true; // Retorna true se todos os caracteres forem maiúsculos ou espaços
    }


    public static void main(String[] args) {
      //  System.out.println("digite a quantidade de linhas");
        Scanner sc = new Scanner(System.in);
        int linhas = sc.nextInt();// le a quantidade de linhas
        if(linhas==0){
            System.exit(0);
        }
        String[] texto = new String[linhas];// declaração do vetor de strings
        sc.nextLine();// para retirar o buffer de entrada deixando pelo nextInt

        // ler o texto e verifica se é maiúscula
        String reserva = new String();
        for (int i = 0; i < linhas; i++) {
           reserva=sc.nextLine();
           if(isUpperCaseString(reserva)==true){
            texto[i]=reserva;
           }else{
            System.out.println("error");
            i--;
            
           }

            }
        

        // retirar espaços
        for (int i = 0; i < linhas; i++) {
            texto[i] = removerEspacosDesnecessarios(texto[i]);
        }
        int maiorTam = 0, temp = 0;

        for (int i = 0; i < linhas; i++) {
            // verifica qual string tem o maior tamanho
            if (maiorTam < texto[i].length()) {
                temp = maiorTam;
                maiorTam = texto[i].length();
            }
        }

        // verificar quantos espaços vao ser adcionados antes da string
        for (int j = 0; j < linhas; j++) {// percore o vetor
            for (int i = maiorTam; i > texto[j].length(); i--) {// percorre a string

                System.out.print(" ");

            }
            System.out.println(texto[j]);//printa o resultado
            sc.nextLine();
        }

    }
}
