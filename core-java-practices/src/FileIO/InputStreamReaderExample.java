package FileIO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
public class InputStreamReaderExample {
    public static void main(String[] args) {
        try (InputStreamReader fr = new InputStreamReader(System.in)) {
            int letters=fr.read();
            while (fr.ready()) {
                System.out.println((char)letters);
                letters=fr.read();
            }
            fr.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //if we have to write System.in then we have to use InputStreamReader to convert  BufferedReader into  byte class.
    }
}
