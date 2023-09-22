import java.util.Scanner;
import java.security.SecureRandom;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
    final int tam=6;
     int[] numeros=new int[tam];
     

     int n1,n2,n3,n4,n5,n6;

     int Acertos = 0;

    

     
     
    System.out.println("Digite seu primeiro numero");
    n1 = scan.nextInt();
    System.out.println("Digite seu primeiro segundo numero");
    n2 = scan.nextInt();
    System.out.println("Digite seu primeiro terceiro numero");
    n3 = scan.nextInt();
    System.out.println("Digite seu primeiro quarto numero");
    n4 = scan.nextInt();
    System.out.println("Digite seu primeiro quinto numero");
    n5 = scan.nextInt();
    System.out.println("Digite seu primeiro sexto numero");
    n6 = scan.nextInt();

   

   
    numeros[0]=n1;
    numeros[1]=n2;
    numeros[2]=n3;
    numeros[3]=n4;
    numeros[4]=n5;
    numeros[5]=n6;

    
    System.out.println("Seus numeros");
    for(int n:numeros){
        
        System.out.printf("%d  ",n);
        System.out.printf("%n");
    }

    final int linhas=1;
     final int colunas=6;

     int [][] sorteio=new int[linhas][colunas];

     for(int l=0;l<linhas;l++){
        for(int c=0;c<colunas;c++){
            sorteio[l][c]=new SecureRandom().nextInt(60);

    }
}

System.out.println("Numeros sorteados");

for (int[] linha : sorteio) {
    for (int numeroSorteado : linha) {
        System.out.printf("%2d | ", numeroSorteado);
        for (int numeroEscolhido : numeros) {
            if (numeroSorteado == numeroEscolhido) {
                Acertos++;
            }
        }
    }
    System.out.println();
}

System.out.println("Total de acertos: " + Acertos);
}
}

 


  

    


   

    

    

