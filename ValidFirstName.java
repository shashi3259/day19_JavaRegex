import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidFirstName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First name: ");
        String name = sc.next();
        Pattern p = Pattern.compile("[A-Z][A-Za-z][A-Za-z][A-Za-z]*");
        Matcher m = p.matcher(name);
        if(m.find() && m.group().equals(name)){
            System.out.println("Valid First name");
        }
        else{
            System.out.println("InValid First name");
        }
    }
}
