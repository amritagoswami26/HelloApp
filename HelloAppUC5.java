public class HelloAppUC5{

    public static void main(String[] args) {

        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;

        // Build names from command-line arguments
        for (String name : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }

        // Default value if no arguments are passed
        String names;
        if (args.length == 0) {
            names = "World";
        } else {
            names = nameBuilder.toString();
        }

        // Final greeting message
        String message = "Hello, " + names + "!";
        System.out.println(message);
    }
}