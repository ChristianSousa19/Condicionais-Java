import java.util.Scanner;

public class Bissexto {
    public static void main(String[] args) {
        System.out.println("Que ano deseja analisar?");
        Scanner a=new Scanner(System.in);
        int an= a.nextInt();
        if(an%4==0){
            System.out.printf("O ano %d é BISSEXTO ",an);}
        else {
            System.out.printf("O ano %d não é BISSEXTO",an);}
    }
}

