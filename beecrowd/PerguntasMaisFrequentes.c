#include <stdio.h>

int main (){
int n=0, k=0, verifica=0;
scanf("%i %i", &n, &k);
int perguntas[n];
int contado[n];
//1 true 0 false
for(int i=0; i<n; i++){
    scanf("%i", &perguntas[i]);

}

for(int i=0; i<n;i++){
    if(contado[i]!=1){
        int cont=1;
        for(int j=i+1; j<n;j++){
            if(perguntas[i]==perguntas[j]){
                cont++;
                contado[j]=1;
                if(cont==k){
                    verifica++;
                    j=n;
                }
            }
        }
    }
}
printf("%i\n", verifica);
    return 0;
}
