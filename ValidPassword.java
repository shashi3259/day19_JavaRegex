import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {
    /*
      Rules for Valid Password:
      1. Minimum 8 Characters
      2. Should have atleast 1 Upper Case.
      3. Should have atleast 1 numeric number
      4. Should have 1 Special Character
       */
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@!#$])[a-zA-Z0-9!#$@]{8,}");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        String pass = sc.next();
        Matcher m = p.matcher(pass);
        if(m.find() && m.group().equals(pass)){
            System.out.println("Valid Password");
        }else{
            System.out.println("InValid Password");
        }
    }
}
