import java.util.Scanner;

public class linearsearch1
{
    public static void main(String[] args) {
        
        int arr[] = {2,4,56,8,9,42};
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number=");
        int integerl = sc.nextInt();
        int indexno = linearsearch(arr, integerl);
        
        
        if(indexno !=0){
            System.out.println("Element is found and its index is "+indexno+".");
        }else{
            System.out.println("Element not found.");
        }
    }
    private static int linearsearch(int array[], int number){
        for(int i=0;i<array.length;i++){
            if(array[i] == number){
                return i;
            }
        }
        return 0;
}
}