package basic;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

  /** Javadoc: . */
  public static void main(String[] args) {
    Worker wrk = new Worker(new Numbers());
    int dir = 1;
    for (int i = 0; i < 100; i++) {
      if (wrk.work(dir)) {
        Logger.getGlobal().log(Level.INFO, "Numbers are equal!");
      }
    }
  }
}
