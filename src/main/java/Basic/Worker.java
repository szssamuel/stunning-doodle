package basic;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Worker {
  private Numbers nums;

  Worker(Numbers nums) {
    this.nums = nums;
  }

  /** Javadoc: this is an important function.  */
  public boolean work(int dir) {
    try {
      if (dir == 1) {
        nums.counter1Up();
        nums.counter2Down();
      } else if (dir == -1) {
        nums.counter1Down();
        nums.counter2Up();
      }
    } catch (IllegalOperation e) {
      String msg = e.getMessage() + "\n" + Arrays.toString(e.getStackTrace());
      Logger.getGlobal().log(Level.SEVERE, msg);
    }
    return nums.getCounter1() == nums.getCounter2();
  }
}
