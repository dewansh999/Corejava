import java.util.Stack;

class MinStack {
  private Stack<Integer> stack = new Stack<>();
  private Stack<Integer> minStack = new Stack<>();

  public void add(int val) {
    stack.push(val);
    if (minStack.isEmpty() || val <= minStack.peek()) {
      minStack.push(val);
    }
  }

  public int mini() {
    return minStack.peek();
  }

  public static void main(String[] args) {
    MinStack minStack = new MinStack();
    minStack.add(12);
    minStack.add(22);
    minStack.add(32);
    minStack.add(162);
    System.out.println(minStack.mini());
  }
}
