package Assignment_1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class Read {
    
    public static URL Reader(int urlnum) throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader("urls.txt"));
            for (int i = 1; i < urlnum; i++) {
                if (reader.readLine() == null) {
                    throw new IOException();
                }
            }
            String newurl = reader.readLine();
            URL url = new URL(newurl);
            return url;
    }

    public static void readOutput() throws IOException {
        BufferedReader op = new BufferedReader(new FileReader("urls.txt"));
        int n = 1;
        String url;
        while ((url = op.readLine()) != null) {
            System.out.println(n + ". " + url);
            n++;
        }
    }
}
    

