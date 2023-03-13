public class Command_line_print {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("The command line name is " + args[i]);
        }
    }
}
