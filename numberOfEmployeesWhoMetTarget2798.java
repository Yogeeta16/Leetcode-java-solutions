import java.util.*;

public class numberOfEmployeesWhoMetTarget2798 {
    public static void main(String[] args) {

    }

        public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
            return (int) Arrays.stream(hours).filter(hour -> hour >= target).count();
        }
  

}
