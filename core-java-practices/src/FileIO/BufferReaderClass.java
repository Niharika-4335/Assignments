package FileIO;

import java.io.*;

public class BufferReaderClass {
    public static void main(String[] args) throws IOException {
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\FL_LPT-361\\Documents\\input.txt"))) {
//            while(bufferedReader.ready())
//                  System.out.println(bufferedReader.readLine());
//        }
//        try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out)) {
//            outputStreamWriter.write("hello");
//            outputStreamWriter.write("\n");
//            outputStreamWriter.write(0);
//            outputStreamWriter.write(97);
//            char a[]="hi".toCharArray();
//            outputStreamWriter.write(a);
//        }
        try (FileWriter outputStreamWriter = new FileWriter("C:\\Users\\FL_LPT-361\\Documents\\output.txt",true)) {
            outputStreamWriter.write("hello");
        }


    }

}
