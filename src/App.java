import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, World!");
        System.out.println("Digite algo");
        String resultado = in.nextLine();

        System.out.println(resultado);
    }
}
