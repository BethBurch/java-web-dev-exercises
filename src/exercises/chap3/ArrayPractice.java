package exercises.chap3;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
//        create and initalize an array
        int[] someNums = {1,1,2,3,5,8};

    for (int i = 0;i < someNums.length; i++) {
        // print if the number is odd
        if(someNums[i] % 2 != 0) {
            System.out.println(someNums[i]);
        }
    }
    }
    public void splitString() {
        String suessString = ("I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.");
String[] splitString = suessString.split(" ");
        System.out.println(Arrays.toString(splitString));

    }

public void splitString2() {
    String suessString = ("I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.");
    String[] splitString2 = suessString.split("//.");
            System.out.println(Arrays.toString(splitString2));
}
}