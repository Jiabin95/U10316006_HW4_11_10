import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {
 
  public boolean isEmpty() {
    return super.isEmpty();
  }

  public int getSize() {
    return super.size();
  }

  public Object peek() {
    return super.get(getSize() - 1);
  }

  public Object pop() {
    Object o = super.get(getSize() - 1);
    super.remove(getSize() - 1);
    return o;
  }

  public Object push(Object o) {
   return super.add(o);
  }

  @Override /** Override the toString in the Object class */
  public String toString() {
    return "stack: " + super.toString();
  }
}
