import java.io.*;

public class FileReaderExample {
    public static void main(String[] args)throws IOException {
        File f = new File("C:\\Users\\SANJEEV\\Desktop\\live wire\\ADVANCE JAVA\\FILE  STREAM\\text1.txt");
        FileReader reader = null;
        try{
            reader =new FileReader(f);
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        BufferedReader br = new BufferedReader(reader);
        int temp;
        StringBuffer sb = new StringBuffer();
        while ((temp = br.read()) != -1){
            System.out.println((char)temp);
            sb.append((char)temp);
        }
        sb.append("sanjeev !!!!! priyanka");
        System.out.println("String s " +sb.toString());

        FileWriter writer = new FileWriter("C:\\Users\\SANJEEV\\Desktop\\live wire\\ADVANCE JAVA\\FILE  STREAM\\text1.txt");
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write(sb.toString());

        bw.close();
        writer.close();
    }
}