package QuickSort;

public class Sort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
        quickSort(arr, 0, arr.length - 1);
        String out = "";
        for (int digit : arr) {
            out += (digit + ",");
        }
        System.out.println(out);
    }


    private static void quickSort(int[] arr ,int low, int heigh){

        if (low >= heigh || arr == null || arr.length <= 1) {    //  判断数组是否符合排序需求
            return ;
        }

        int i = low , j = heigh , comparison = arr[(low+heigh)/2];   //  将数组的中间元素设置为比较数

        while(i <= j) {
            while(arr[i] < comparison) {
                i++;                        //  若比较数左边的元素都小，i 继续向左移动
            }
            while(arr[j] > comparison) {
                j--;                        //  若比较数左边的元素都大，j 继续向左移动
            }

            if(i < j ) {                    //  此处的arr[i] 比 comparison大 ，arr[j] 比comparison小
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j--;
            } else if(i == j){
                    i++;                    //  退出while循环
            }
        }

        quickSort(arr,low,j);               //  退出循环后 j 小于 i ，所以使用 j 放入递归函数中
        quickSort(arr,i,heigh);

    }


}
