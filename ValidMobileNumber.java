import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobileNumber {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mobile number: ");
        String number = sc.next();
        Matcher m = p.matcher(number);
        if(m.find() && m.group().equals(number)){
            System.out.println("Valid mobile number.");
        }
        else{
            System.out.println("Mobile number is not valid.");
        }
    }
}
