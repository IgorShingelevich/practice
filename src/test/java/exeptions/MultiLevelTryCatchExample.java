package exeptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class MultiLevelTryCatchExample {

    public static void main(String[] args) {
        File file = new File("somefile.txt");
        File unexistedFile = new File("unexistedfile.txt");
        List<File> files = List.of(file, unexistedFile);
        // cicle for
        for (File f : files) {
           try {
               processFile(f);
           }
              catch (IllegalArgumentException e) {
                System.out.println("File constraint violation: " + e.getMessage());
              }
              catch (IOException e) {
                System.out.println("An I/O error occurred: " + e.getMessage());
              }
              catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
              }
        }
    }

    public static void processFile(File file) throws IllegalArgumentException, IOException {
        BufferedReader reader = null;

        try {
            // Validate file name and size
            if (file.getName().equals("outdated.txt")) {
                throw new IllegalArgumentException("File name 'outdated.txt' is not allowed");
            }

            if (file.length() < 1024 || file.length() > 1048576) {
                throw new IllegalArgumentException("File size must be between 1KB and 1MB");
            }

            try {
                // Attempt to open the file
                reader = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e) {
                // Handle FileNotFoundException
                System.out.println("File not found: " + e.getMessage());
            }

            // Attempt to read from the file
            String line = reader.readLine();
            System.out.println("Read line from file: " + line);

        } catch (IllegalArgumentException e) {
            // Handle file name or file size issues
            System.out.println("File constraint violation: " + e.getMessage());

        } catch (IOException e) {
            // Handle IOException
            System.out.println("An I/O error occurred: " + e.getMessage());

        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());

        } finally {
            // Close the file reader in the finally block
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the reader: " + e.getMessage());
            }
        }
    }
}

