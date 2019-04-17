package sort;

/**
 * @program: algorithmsStudyDome
 * @Author： LiuZedi
 * @Date： 2019/4/16 23:55
 */
public class insert_sort {
    private int[] array;

    public insert_sort(int[] array){
        this.array=array;
    }

    //被备注的是自己写的
   /* public void sort(){
        int temp,key;
        for(int i=1;i<array.length;i++){
            for (int j=i-1;j>=0;j--){
                key=array[i];
                if (j==i-1&&key>=array[j]){
                   break;
                }
                if (j==0&&key<array[0]){
                    move(0,i-1,array);
                    array[j]=key;
                    break;
                }
                if(key<array[j]&&key>=array[j-1]){
                    move(j,i-1,array);
                    array[j]=key;
                    break;
                }
            }
        }
    }

    public void move(int start,int end,int[] array){
        for (int i=end;i>=start;i--){
            array[i+1]=array[i];
        }
    }*/

   //来自书本的
   public void sort(){
       if (array==null){
           throw  new RuntimeException("array is null!!");
       }
       int length=array.length;
       if (length>0){
           int temp;
           for(int i=1;i<length;i++){

               temp=array[i];
               int j=i;
               for(;j>0&&array[j-1]>temp;j--){
                   array[j]=array[j-1];
               }
               array[j]=temp;
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

class insert_sort_test{

    public static void main(String[] args){
        int[] array={47,29,27,99,43,23,80,1,34,23,45,73,23};
        insert_sort insertSort=new insert_sort(array);
        insertSort.sort();
        insertSort.printAll();
    }
}
