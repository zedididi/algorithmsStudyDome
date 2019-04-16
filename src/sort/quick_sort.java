package sort;

/**
 * @program: algorithmsStudyDome
 * @Author： LiuZedi
 * @Date： 2019/4/16 20:41
 */
public class quick_sort {

    private int[] array;

    public quick_sort(int[] array){
        this.array=array;
    }

    public void sort(){
        quickSort(0,array.length-1,array);
    }
    public void quickSort(int start,int end,int[] array){
        int indexNum=array[start],index=start,temp,mid=start;
        int i=start;
        int j=end;
        if (start<end){
            while (i<j){
                while(i<j&&indexNum<array[j]){
                    j--;
                }
                if (i<j) {
                    array[i] = array[j];
                    i++;
                }
                while (i<j&&indexNum>array[i]){
                    i++;
                }
                if (i<j){
                    array[j]=array[i];
                    j--;
                }
            }
            array[i]=indexNum;
            quickSort(start,i-1,array);
            quickSort(i+1,end,array);
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

class quick_sort_test{

    public static void main(String[]ages){
        int[] array={47,29,27,99,43,23,80,1,34};
        quick_sort quickSort=new quick_sort(array);
        quickSort.sort();
        quickSort.printAll();
    }


}
