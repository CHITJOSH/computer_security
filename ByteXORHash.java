import java.io.*;
public class ByteXORHash {
    public static void main(String[] args) {
        try {
            // Read input string from standard input stream
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the input string: ");
            String input = reader.readLine();

            // Convert input string to bytes
            byte[] bytes = input.getBytes();

            // Perform XOR operation on all bytes
            byte result = 0;
            for (byte b : bytes) {
                result ^= b; // XOR operation
            }

            // Print the one-byte hash result
            System.out.println("One-byte hash: " + result);
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }
}
