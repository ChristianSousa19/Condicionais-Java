import java.util.Scanner;

public class viagem {
    public static void main(String[] args) {
        System.out.println("Qual e a distância da sua viagem?");
        Scanner n=new Scanner(System.in);
        float num= n.nextFloat();
        double m=num*0.5;
        double ma=num*0.45;
        System.out.printf("Você esta prestes a começar uma viagem de %.2f km\n",num);
        if(num<=200){
            System.out.printf("Sua viagem custará R$%.2f",m);}
        else {
            System.out.printf("Sua vigem custará R$%.2f",ma);}
    }
}

