public class App {
    public static void main(String[] args) throws Exception {
        Factorial factorial = new Factorial();
        int result = factorial.calculateFact(Integer.valueOf(args[0]));
        System.out.println("Factorial of " + args[0] + ": " + result);
    }
}
class Factorial {
    public int calculateFact(int num) {
        if(num == 1) return 1;
        return num*calculateFact(num-1);
    }
}