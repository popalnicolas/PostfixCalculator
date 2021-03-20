import Calculator.*;;

import java.util.ArrayList;
import java.util.Arrays;

public class main
{
  public static void main(String[] args)
  {
    Client client = new Client();

    System.out.println(client.evaluateExpression(new ArrayList<Token>(Arrays.asList(
        new Operand(15),
        new Operand(5),
        new Operator(Operation.ADDITION)
    ))));
  }
}
