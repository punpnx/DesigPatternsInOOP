import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2_1 {
    public static final int MAX = 5;
    
    public static void main(String[] args) {
        Ex2_1 ex = new Ex2_1();
        ex.run();
    }

    public void run() {
        List<Integer> nums = receiveInput();
        Collections.sort(nums);
        display(nums);
    }

    private List<Integer> receiveInput() {
        System.out.println("Welcome to the Application!");
        System.out.println("Enter 5 valid integers in the range [0, 10]");
        
        Scanner inp = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        
        while(nums.size() < MAX) {
            String s = inp.nextLine();
            if (typeCheck(s) && rangeCheck(s)) {
                nums.add(Integer.parseInt(s));
            }
        }
        inp.close();
        return nums;
    }

    private boolean typeCheck(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }
    }

    private boolean rangeCheck(String s) {
        int num = Integer.parseInt(s);
        if(num<0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return false;
        }
        return true;
    }

    private void display(List<Integer> nums) {
        for(int num : nums)
            System.out.print(num+" ");
    }
}
