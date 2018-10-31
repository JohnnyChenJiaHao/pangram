import java.io.*;
// Course: Introduction to Programming Langueages
public class Pangram {

    public static void pangram(String inFile, String outFile) {

        final int total_letters = 26;

        String line = null;

        try {
            // Read and write file, inspired from: https://www.caveofprogramming.com/java/java-file-reading-and-writing-files-in-java.html
            FileReader inputFile = new FileReader(inFile);
            FileWriter outputFile = new FileWriter(outFile);

            BufferedReader br = new BufferedReader(inputFile);
            BufferedWriter bw = new BufferedWriter(outputFile);

            mainLoop: while ((line = br.readLine()) != null ) {
                // Good to have, if input contains uppercase letters.
                line = line.toLowerCase();

                // Checks if sentence is a pangram by checking total letter or using indexOf method.
                for (char c = 'a'; c <= 'z'; c++) {
                    if ((line.indexOf(c) < 0 || line.length() < total_letters)) {
                        bw.write("false");
                        bw.newLine();
                        continue mainLoop;
                    }
                }
                bw.write("true");
                bw.newLine();
            }
        br.close();
        bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("No files detected");

        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
