package basic;

public class Numbers {
  private int counter1;
  private int counter2;

  Numbers() {
    this.counter1 = 0;
    this.counter2 = 100;
  }

  /** Javadoc: . */
  private boolean isOperationOk(int counter, int op) {
    return (op == -1) && (counter > 0) || (op == 1) && (counter < 100);
  }

  /** Javadoc: . */
  public void counter1Up() throws IllegalOperation {
    if (isOperationOk(counter1,1)) {
      this.counter1++;
    } else {
      throw new IllegalOperation("Counter1: cannot be bigger than 100!");
    }
  }

  /** Javadoc: . */
  public void counter2Up() throws IllegalOperation {
    if (isOperationOk(counter2,1)) {
      this.counter2++;
    } else {
      throw new IllegalOperation("Counter2: cannot be bigger than 100!");
    }
  }

  /** Javadoc: . */
  public void counter1Down() throws IllegalOperation {
    if (isOperationOk(counter1,-1)) {
      this.counter1--;
    } else {
      throw new IllegalOperation("Counter1: cannot be less than 0!");
    }
  }

  /** Javadoc: . */
  public void counter2Down() throws IllegalOperation {
    if (isOperationOk(counter2,-1)) {
      this.counter2--;
    } else {
      throw new IllegalOperation("Counter2: cannot be less than 0!");
    }
  }

  public int getCounter1() {
    return counter1;
  }

  public int getCounter2() {
    return counter2;
  }
}
