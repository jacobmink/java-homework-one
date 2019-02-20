import java.util.ArrayList;

public class JavaArrays{
    public static void main(String[] args){
        ArrayList<Integer> numArr = new ArrayList<Integer>();
        numArr.add(2);
        numArr.add(5);
        numArr.add(1);
        numArr.add(10);
        numArr.add(50);
        numArr.add(6);
        numArr.add(4);
        System.out.println(bubbleSort(numArr));
    }
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> numArr){
        // int i = 0;
        // int temp = numArr.get(i);
        // while(temp > numArr.get(i + 1) && i + 1 < numArr.size()){
        //     numArr.set(i, numArr.get(i + 1));
        //     numArr.set(i + 1, temp);
        //     i++;
        // }
        // return numArr;

        for(int i = 0; i < numArr.size() - 1; i++){
            for(int j = 0; j < numArr.size() - i - 1; j++){

            }
            int temp = numArr.get(i);
            while(temp > numArr.get(i + 1)){
                numArr.set(i, numArr.get(i + 1));
                numArr.set(i + 1, temp);
            }

        }
        return numArr;
    }
}