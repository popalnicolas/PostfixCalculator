package Calculator;

import Stack.EmptyStackException;

import java.util.ArrayList;

public class Client
{
  private CalculatorVisitor calculatorVisitor;

  public Client()
  {
    calculatorVisitor = new CalculatorVisitor();
  }

  public int evaluateExpression(ArrayList<Token> tokenList)
  {
    for (Token token : tokenList)
    {
      token.accept(calculatorVisitor);
    }

    try
    {
      return calculatorVisitor.getResult();
    }
    catch (MalformedExpressionException e)
    {
      e.printStackTrace();
    }
    return 0;
  }
}
