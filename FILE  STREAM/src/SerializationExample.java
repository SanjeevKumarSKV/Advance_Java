import java.io.*;

class demo implements java.io.Serializable{
    public int a;
    public String b;
    public transient int c;
    static int test;

    public demo(int a, String b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
public class SerializationExample {
    public static void main(String[] args)throws Exception {
        demo d = new demo(1,"sanjeev",3);

        FileOutputStream file = new FileOutputStream("C:\\Users\\SANJEEV\\Desktop\\live wire\\ADVANCE JAVA\\FILE  STREAM\\text1.txt");
        BufferedOutputStream bos = new BufferedOutputStream(file);
        ObjectOutputStream os = new ObjectOutputStream(bos);
        os.writeObject(d);

        os.close();
        file.close();
        System.out.println(d);
        System.out.println("Object has been serialized");

        FileInputStream f1 = new FileInputStream("C:\\Users\\SANJEEV\\Desktop\\live wire\\ADVANCE JAVA\\FILE  STREAM\\text1.txt");
        BufferedInputStream bis = new BufferedInputStream(f1);
        ObjectInputStream so = new ObjectInputStream(bis);
        System.out.println("Deserialized");
        demo d1 =(demo) so.readObject();
        System.out.println(d1);
    }
    static void test(demo d){
    }
}