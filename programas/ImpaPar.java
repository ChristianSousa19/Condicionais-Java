import java.util.Scanner;

public class ImpaPar {
    public static void main(String[] args) {
        System.out.println("Me diga um numero inteiro qualquer:");
        Scanner n=new Scanner(System.in);
        int num= n.nextInt();
        if (num%2==0){
            System.out.printf("O numero %d e Par",num);}
        else{
            System.out.printf("O numero %d e Impar",num);}
    }
}

