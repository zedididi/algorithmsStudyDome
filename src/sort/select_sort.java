package sort;

/**
 * @program: algorithmsStudyDome
 * @Author： LiuZedi
 * @Date： 2019/4/17 9:22
 */
public class select_sort {

    private int[] array;
    public select_sort(int[] array){
        this.array=array;
    }

    public void sort(){
        if (array==null){
            throw new RuntimeException("array is null!!");
        }
        int length=array.length;
        if (length>0){
            int index,min;
            for (int i=0;i<length-1;i++){
                min=array[i];
                index=i;
                for (int j=i;j<length;j++){
                    if (min>array[j]){
                        min=array[j];
                        index=j;
                    }
                }
                array[index]=array[i];
                array[i]=min;
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
class select_sort_test{
    public static void main(String[] args){
        int[] array={47,29,27,99,43,23,80,1,34,23,45,73,23};
        select_sort selectSort=new select_sort(array);
        selectSort.sort();
        selectSort.printAll();
    }
}
