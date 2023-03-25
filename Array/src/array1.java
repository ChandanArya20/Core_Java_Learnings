import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int[] arr=new int[5];

        System.out.print("Enter five numbers : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
