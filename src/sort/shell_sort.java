package sort;

/**
 * @program: algorithmsStudyDome
 * @Author： LiuZedi
 * @Date： 2019/4/17 8:09
 */
public class shell_sort {
    private int[] array;

    public shell_sort(int[] array){
        this.array=array;
    }

    public void sort(){
        if (array==null){
            throw new RuntimeException("array is null!!");
        }
        int length=array.length;
        if (length>0){

            for (int i=length/2;i>0;i/=2){   //增量
                for (int j=i;j<2*i;j++){     //每组中第二个元素下标
                    for (int w=j;w<length;w+=i) {  //插入排序
                        int index = w;
                        int temp = array[w];
                        for (; index > j-i && array[index- i] >temp;index-=i){
                            array[index]=array[index-i];
                        }
                        array[index]=temp;
                    }
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
class shell_sort_test{

    public static void main(String[] args){
        int[] array={47,29,27,99,43,23,80,1,34,23,45,73,23};
        shell_sort shellSort=new shell_sort(array);
        shellSort.sort();
        shellSort.printAll();
    }
}