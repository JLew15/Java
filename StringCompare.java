public class StringCompare
{
  public static void main(String[] args) {
    String storedUsername = "captainbob";
    String storedPassword = "ahoy";
    String inputUsername = "CAPTAINBOB";
    String inputPassword = "Ahoy";

    boolean usernameMatch = inputUsername.equalsIgnoreCase(storedUsername);
    boolean passwordMatch = inputPassword.equals(storedPassword);

    System.out.println("Username match: " + usernameMatch);
    System.out.println("Username match: " + passwordMatch);
  }
}
