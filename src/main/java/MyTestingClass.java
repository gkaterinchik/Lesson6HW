import java.util.Arrays;

public class MyTestingClass {
    public static int[] checkArr(int[] arr) {
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i] == 4) {

                return Arrays.copyOfRange(arr, i+1, arr.length );

            }
        }
        throw new RuntimeException();
    }


    public static boolean OneAndFourExist(int[]arr){
        boolean oneExist=false;
        boolean fourExist=false;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] != 4&&arr[i] != 1)
                return false;
            if (arr[i] == 1)
                oneExist = true;
            if (arr[i] == 4)
                fourExist = true;

        }
        return oneExist && fourExist;


        }

    public static void main(String[] args) {
        MyTestingClass.checkArr(new int[]{1,4,3,3,5});
    }
    }
