import java.io.*;

public class ByteXORHash {
    public static void main(String[] args) {
        try {
            // Read input bytes from standard input stream
            InputStream inputStream = System.in;
            int nextByte;
            byte result = 0;

            // Perform XOR operation on all bytes
            while ((nextByte = inputStream.read()) != -1) {
                result ^= (byte) nextByte; // XOR operation
            }

            // Print the one-byte hash result
            System.out.println("One-byte hash: " + result);
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }
}
