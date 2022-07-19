import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 4, 5, 2, 34, 36, 5, 4, 23, 45, 6, 8, 56, 34, 37 };
        TreeSet<Integer> res = getNums(numbers);
        System.out.println(res); // [34, 36, 37, 45, 56]
    }

    public static TreeSet<Integer> getNums(int[] nums) {
       // Find all numbers greater than 25 (Tailset)

        TreeSet<Integer> quarterSet = new TreeSet<>();
        quarterSet.add(1);   quarterSet.add(5);     quarterSet.add(56);
        quarterSet.add(4);   quarterSet.add(4);     quarterSet.add(34);
        quarterSet.add(5);   quarterSet.add(23);    quarterSet.add(37);
        quarterSet.add(2);   quarterSet.add(45);
        quarterSet.add(34);   quarterSet.add(6);
        quarterSet.add(36);   quarterSet.add(8);

        quarterSet = (TreeSet<Integer>) (quarterSet.tailSet(25));

        return quarterSet;
    }
}