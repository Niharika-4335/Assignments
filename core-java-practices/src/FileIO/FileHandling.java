package FileIO;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\FL_LPT-361\\Documents\\input.txt");
        FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\FL_LPT-361\\Documents\\output.txt");
        int c;
        while((c=fileInputStream.read())!=-1){
             fileOutputStream.write(c);
        }
        if(fileInputStream!=null){
            fileInputStream.close();
        }
        if(fileOutputStream!=null){
            fileOutputStream.close();
        }
        //creating a new file
        try{
        File fo=new File("new_file.txt");
        fo.createNewFile();
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
        //writing into a file
        try(FileWriter fileWriter=new FileWriter("new_file.txt")){
            fileWriter.write("niharika");
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
        //reading from a file
        try(FileReader fileReader=new FileReader("new_file.txt")){
            int d=0;
            while((d=fileReader.read())!=-1) {
                System.out.print((char)d);
            }
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }//we can aslo read using buffer reader




    }
}
