import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe os anos: ");
        int anos = sc.nextInt();
        
        System.out.print("Informe os meses: ");
        int meses = sc.nextInt();
        
        System.out.print("Informe os dias: ");
        int dias = sc.nextInt();
        
        int totalDias = (anos * 365) + (meses * 30) + dias;
        System.out.println("A idade em dias é: " + totalDias);
        
        sc.close();
    }
}
