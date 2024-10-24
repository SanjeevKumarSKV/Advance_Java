import java.util.function.Predicate;


    public class checkstring1
    {
        public static void main(String[] args)
        {
            Predicate<String> empty = str -> str.isEmpty();
            String str1 = "";
            String str2 = "hello" ;
            System.out.println("string is empty"+empty.test(str1));
            System.out.println("notempty"+empty.test(str2));


        }
    }
