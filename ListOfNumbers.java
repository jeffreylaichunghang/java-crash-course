import java.io.*;

public class ListOfNumbers {

    private int[] list = { 5, 7, 3, 6, 2 };

    public static void findFile() throws IOException {
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

    public void writeList() {
        // PrintWriter out = null;

        try (PrintWriter out = new PrintWriter(new FileWriter("OutputFile.txt"))) {
            System.out.println("Entering try statement");

            // out = new PrintWriter(new FileWriter("OutputFile.txt"));

            for (int i = 0; i < 7; i++) {
                out.println("Value at: " + i + " = " + list[i]);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception => " + e.getMessage());
        }
        // finally {
        // // check if printer has been opened
        // if (out != null) {
        // System.out.println("Closing PrintWriter");
        // out.close();
        // } else {
        // System.out.println("Printer is not opened");
        // }
        // }
    }

    public static void main(String[] args) {
        // ListOfNumbers list = new ListOfNumbers();
        // list.writeList();
        try {
            findFile();
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
