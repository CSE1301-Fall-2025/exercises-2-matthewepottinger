package module6._2exercises;

public class CountOdd {

    public static int countOddR(int[] values) {
        int i = 0;
        int result = countOddHelper(values, i);
        return result;

    }

    public static int countOddHelper(int[] values, int i){
        if(i>= values.length){
            return 0;
        } else {
            int oddValues = 0;
            if(values[i] % 2 ==1){
                oddValues = 1; 
            }
            return oddValues + countOddHelper(values, i+1); 
        }
    }

    public static void main(String[] args) {
        int valueList[] = {4,7, 13, 2, 11, 98};
        System.out.println(countOddR(valueList));

    }
}
