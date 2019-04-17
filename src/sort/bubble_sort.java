package sort;

/**
 * @program: algorithmsStudyDome
 * @Author： LiuZedi
 * @Date： 2019/4/16 12:37
 */
public class bubble_sort {

    private int[] array;

    public bubble_sort(int[] array){
        this.array=array;
    }

    public void sort(){
        int temp;
       for (int j=1;j<array.length;j++){
            for (int i=0;i<array.length-j;i++){
                if (array[i]>array[i+1]){
                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }
        }
    }
    public void printAll(){

        int time=1;
        for (int i:array
             ) {
            System.out.print(i+"   ");
            if (time%10==0)
                System.out.println();
            time++;
        }
    }
}

class bubble_sort_test{
    public static void main(String[] args){
        int[] array={47,29,27,99,43,23,80,1,34,23,45,73,23};
        bubble_sort bubbleSort=new bubble_sort(array);
        bubbleSort.sort();
        bubbleSort.printAll();
    }
}