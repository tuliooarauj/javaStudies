import java.util.Scanner;

public class App {

    public static int AddNumber(int n1, int n2){
        return n1 + n2;
    }
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Type number 1:");
        int n1 = in.nextInt();
        System.out.println("Now, type number 2:");
        int n2 = in.nextInt();
        
        int result = AddNumber(n1, n2);
        
        System.out.println("Sum's result: "+ result);
    }
}
