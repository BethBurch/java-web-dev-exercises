package exercises.chap3;

import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String[] args) {
        public static int sumEven(ArrayList<Integer> ArrayListPractice) {
            int total = 0;
            for (int integer : ArrayListPractice) {
                if (integer % 2 == 0) {
                    total += integer;
                }
            }
            return total;
        }
    }
}
