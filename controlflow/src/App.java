public class App {
    public static void main(String[] args) throws Exception {
        if(args.length == 0) {
            System.out.println("Hello, World!");
        }
        if(args.length == 1) {
            System.out.println("Hello, " + args[0] + "!");
        }
    }
}
