import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder text = new StringBuilder();

    final String info = "Enter 3 lines of text";
    System.out.println(info);

    for(int i = 0;i<3;i++) {
        text.append(scanner.nextLine());
      if(i!=2) text.append("\\");
    }
    String changed = text.toString().replace('\'', '\"');
    System.out.println("From " + text + " To " + changed);

    scanner.nextLine();
  }
}