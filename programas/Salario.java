import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        System.out.println("Qual é o salario atual do funcionario?");
        Scanner s=new Scanner(System.in);
        float sa= s.nextFloat();
        double su=sa+(sa*10/100);
        double in=sa+(sa*15/100);
        if(sa<1.250){
            System.out.printf("Seu salário passa a custar R$%.2f",su);}
        else {
            System.out.printf("Seu salário passara a custar R$%.2f",in);}
    }
}

