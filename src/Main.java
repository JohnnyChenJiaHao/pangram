public class Main {
    public static void main(String[] args) {
        Pangram pangram = new Pangram();

        String input = "src/input3.txt";
        String output = "src/output.txt";

        Pangram.pangram(input,output);

    }
}
