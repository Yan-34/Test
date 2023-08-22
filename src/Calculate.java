import java.util.Scanner;
public class Calculate {
    public static void main(String [] args)throws Exception{
    Scanner scanner = new Scanner(System.in);

     int a = scanner.nextInt();
     String operation = scanner.next();
      int b = scanner.nextInt();

      if (a<1||a>10||b<1||b>10){
          throw new IllegalArgumentException("Введите  числа от 1 до 10");

      }
      int result;
      switch (operation){
          case "+":
              result = a + b;
              break;
          case "-":
              result = a - b;
              break;
          case "*":
              result = a * b;
              break;
          case "/":
              result = a / b;
              break;
          default:
              throw new IllegalArgumentException("Операция неправильная");
      }
        System.out.println(result);




    }

}


