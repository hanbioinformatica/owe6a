package bracketchecker;
/**
 * @author Martijn van der Bruggen
 * @version 22 november 2018
 * (c) HAN University 
 * Instituut Toegepaste Biologie en Chemie
 * Bio-informatica
 * Voorbeeld van een Stack implementatie
 */
class Stack {
  private int maxSize;

  private char[] stackArray;

  private int top;

  public Stack(int max) {
    maxSize = max;
    stackArray = new char[maxSize];
    top = -1;
  }

  public void push(char j) {
    stackArray[++top] = j;
  }

  public char pop() {
    return stackArray[top--];
  }

  public char peek() {
    return stackArray[top];
  }

  public boolean isEmpty() {
    return (top == -1);
  }
}
