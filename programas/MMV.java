import java.util.Scanner;

public class MMV {
    public static void main(String[] args) {
        System.out.println("Digite o primeiro valor:");
        Scanner n= new Scanner(System.in);
        float n1= n.nextFloat();
        System.out.println("Digite o segundo valor: ");
        Scanner m=new Scanner(System.in);
        float n2=n.nextFloat();
        float menor=n1;
        float maior=n2;
        if(n2<n1){
            menor=n2;}
        if(n1>n2){
            maior=n1;}
        System.out.printf("O menor numero digitado é: %.2f\n e o maior numero digitado é: %.2f",menor,maior);
    }

}
