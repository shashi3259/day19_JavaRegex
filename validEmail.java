import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// [a-zA-Z0-9][A-Za-z0-9_.]*@[a-zA-Z0-9]+([.][A-Za-z]+)+
/*
E.g. abc.xyz@bl.co.in
-- Email has 3 mandatory parts(abc,bl&co) and
2 optional(xyz & in) with precise @ and . positions.
 */
public class validEmail {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a][b][c][x-z.]@[b][l]+([.][c][o])+([.][i][n])+");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        String num = sc.next();
        Matcher m = p.matcher(num);
        if(m.find() && m.group().equals(num)){
            System.out.println("Valid Mobile Number");
        }else{
            System.out.println("InValid Mobile Number");
        }
    }
}
