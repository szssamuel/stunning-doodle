package Basic;

public class Worker {
    private Numbers nums;

    Worker(Numbers nums) {
        this.nums = nums;
    }

    public boolean work(int dir) {
        try {
            if (dir == 1) {
                nums.counter1Up();
                nums.counter2Down();
            }
            else if (dir == -1) {
                nums.counter1Down();
                nums.counter2Up();
            }
        } catch (IllegalOperationException e) {
            e.printStackTrace();
        }
        return nums.getCounter1() == nums.getCounter2();
    }
}
