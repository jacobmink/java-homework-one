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
        System.out.println(insertionSort(numArr));
        System.out.println(numArr);
    }
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> numArr){

        for(int i = 0; i < numArr.size() - 1; i++){
            for(int j = 0; j < numArr.size() - i - 1; j++){
                if(numArr.get(j) > numArr.get(j + 1)){
                    int temp = numArr.get(j);
                    numArr.set(j, numArr.get(j + 1));
                    numArr.set(j + 1, temp);
                }
            }
        }
        return numArr;
    }
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> numArr){

        for(int i = 1; i < numArr.size(); i++){
            int j = i;
            while(numArr.get(j) < numArr.get(j - 1) && j > 0){
                int temp = numArr.get(j - 1);
                numArr.set(j - 1, j);
                numArr.set(j, temp);
                j--;
            }
        }
        return numArr;
    }
}