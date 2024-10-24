import javax.print.DocFlavor;
import java.io.*;

public class ByteStreamExample{
    public static void main(String[] args) throws IOException{
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        System.out.println();
        try{
            File file = new File("C:\\Users\\SANJEEV\\Desktop\\live wire\\ADVANCE JAVA\\FILE  STREAM\\HEROSCREEN Luffy.png");
            FileInputStream in = new FileInputStream(file);
            bis = new BufferedInputStream(in);
            long size = file.length();
            byte[] temp = new byte[(int)size];
            bis.read(temp);

            File outputFile = new File("C:\\Users\\SANJEEV\\Desktop\\live wire\\ADVANCE JAVA\\FILE  STREAM\\OutPut.jpg");
             fos = new FileOutputStream(outputFile);
             bos = new BufferedOutputStream(fos);
             bos.write(temp);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            bis.close();
            bos.close();
            fos.close();
        }
    }
}