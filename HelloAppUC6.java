public class HelloAppUC6{
    public static void main(String[] args) {
        // StringBuilder is used for efficient string concatenation
        StringBuilder nameBuilder = new StringBuilder();

        // 1. Enhanced For Loop: Iterating over command-line arguments
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // 2. Trailing Character Removal: Checking if anything was added
        if (nameBuilder.length() > 0) {
            // 3. String Manipulation: Using substring() to remove the last ", "
            // We subtract 2 from the length to account for the comma and space
            String result = nameBuilder.substring(0, nameBuilder.length() - 2);
            
            // Output the final formatted string
            System.out.println(result);
        }
    }
}