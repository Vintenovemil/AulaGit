package trabalhovetores;

 import java.util.Scanner;
 import java.util.Random;
 

public class Menudeopções {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
Random ale = new Random();
int menu ;
int x [] = new int [10];
while (true) {
       
System.out.println("Opção 1: Coleta dados do vetor");

System.out.println("Opção 2: Gera valores randomicos para o vetor");

System.out.println("Opção 3: Imprime dados do vetor");

System.out.println("Opção 4: Imprime o vetor invertido");

System.out.println("Aperte 0 para sair ");
char opção = teclado.nextLine().charAt(0);
        while(menu <= 2) {
        menu = ale.nextInt();
        menu++;
        }
if (menu == 1) {
coletaVetor(x);
}

else if (menu == 2) {
int y [] = popularVetor();

System.out.println("qual o valor maximo para os valores do vetor ?");
int valormax = teclado.nextInt();
System.out.println ("valores randômicos gerados" + y);

}
else if (menu == 3) {
int y [] = popularVetor();
imprimeVetor(y);
}
else if (menu == 4) {
imprimeVetorinvertido(y);
}
else if (menu == 0) {
System.out.println(" Fim do algoritmo");
break;
}
}
}


public static int [] coletaVetor(int[]vetor) {
Scanner t = new Scanner(System.in);
for(int i = 1;i < vetor.length; i++) {
System.out.print("informe o " +i+ "º valor do vetor:");
vetor[i]= t.nextInt();
}
return vetor;
}

public static int aleVetores(int valormax ) {
Scanner teclado = new Scanner(System.in);
int y [] = popularVetor();
System.out.print("Qual o valor maximo para os valores do vetor ");

valormax = teclado.nextInt();
System.out.println ("valores randômicos gerados" + y);
return valormax;

}



public static int[] popularVetor() {
Random r = new Random();

int[] x = new  int[4];

for (int i = 0 ; i < x.length;i++) {

//System.out.print("informe o valor: ");

x[i] = r.nextInt(100) + 1;

}

return x;
}

   
    public static void imprimeVetor(int [] y) {
    for (int i = 0; i < y.length; i++) {
    if (i == 0 ) {
    System.out.print("Vetor: "+ y [i]);
    }else {
    System.out.print(","+ y[i]);
    }
    }
    System.out.println();
   
    }
    public static void imprimeVetorinvertido(int[] y) {
    for
   
    }
}