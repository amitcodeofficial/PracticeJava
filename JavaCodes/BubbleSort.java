public class BubbleSort{
    public static void main(String[] args){
        int array1[] = {5,9,45,87,85,72,69,8,2,4};

        System.out.print("The Array is: ");
        for(int i : array1){
            System.out.print(i+" ");
        }
        System.out.println();
        bubblesrt(array1);

        System.out.print("The BS Array is: ");
        for(int i : array1){
            System.out.print(i+"  ");
        }
        System.out.println();
    }
    public static void bubblesrt(int array1[]){
        for(int i=0;i<array1.length-1;i++){
            for(int j=0;j<array1.length-i-1;j++){
                if(array1[j]>array1[j+1]){
                int temp = array1[j+1];
                array1[j+1]=array1[j];
                array1[j]=temp;
            }
            }
        }
    }
}