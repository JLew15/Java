import java.util.Calendar;

public class StringTheory
{
  public static void main(String[] args) {
    String str1 = "Bibbety";
    String str2 = "Bobbety";
    String str3 = "Boo";
    String str4 = "BIBBETY";
    String str5 = "5";

    System.out.println("str1 equals str4: " + str1.equals(str4));
    System.out.println("str1 equals str4 (ignore case): "  + str1.equalsIgnoreCase(str4));

    String replace1 = str1.replace("b", "p");

    System.out.println("str1 replacing 'b' with 'p': " + replace1);
    System.out.println("first three characters in str2: " + str2.substring(0, 3));
    System.out.println("uppercase str3: " + str3.toUpperCase());
    System.out.println("the current time is: " + String.format("%tr", Calendar.getInstance()));
    System.out.println("str1 + str2: " + str1 + " " + str2);
    System.out.println("parseInt results: " + Integer.parseInt(str5));
    System.out.println("location of 'e' in str1: " + str1.indexOf("e"));
  }
}
