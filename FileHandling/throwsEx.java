import java.io.*;

public class throwsEx {
    public static void readFile() throws IOException {
        FileReader file = new FileReader("abc.txt");
    }

    public static void main(String[] args) {
        readFile();

    }

}

// user defined exception created by programmer is called custom exception
// how to create custom exception that extend exception
// create constructer with message
//use throw keyword exception
