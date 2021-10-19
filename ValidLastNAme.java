import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidLastNAme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Last name: ");
        String name = sc.next();
        Pattern p = Pattern.compile("[A-Za-z]*[A-Za-z][A-Za-z][A-Z]");
        Matcher m = p.matcher(name);
        if(m.find() && m.group().equals(name)){
            System.out.println("Valid Last name");
        }
        else{
            System.out.println("InValid Last name");
        }
    }
}
