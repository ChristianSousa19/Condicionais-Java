import java.util.Scanner;

public class Radar {
    public static void main(String[] args) {
        System.out.println("Qual e a velocidade atual  do carro? :");
        Scanner v = new Scanner(System.in);
        float ve = v.nextFloat();
        float m = (ve - 80) * 7;
        if (ve>80){
            System.out.printf("Você foi multado!!!!!\n no valor de R$ %.2f\n",m);
        }
        System.out.println("Tenha um bom dia");
    }

}
