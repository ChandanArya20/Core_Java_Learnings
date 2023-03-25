import java.util.Scanner;
public class array5 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int[][][] arr=new int[3][][];
        arr[0]=new int[4][];
        arr[1]=new int[3][];
        arr[2]=new int[5][];

        arr[0][0]=new int[2]; 
        arr[0][1]=new int[3]; 
        arr[0][2]=new int[4]; 
        arr[0][3]=new int[1]; 
        arr[1][0]=new int[3]; 
        arr[1][1]=new int[4]; 
        arr[1][2]=new int[5]; 
        arr[2][0]=new int[3]; 
        arr[2][1]=new int[4]; 
        arr[2][2]=new int[2]; 
        arr[2][3]=new int[6]; 
        arr[2][4]=new int[2]; 

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.print("Enter marks of college "+i +" class "+j +" student "+ k+" ");
                    arr[i][j][k]=scan.nextInt();
                }
            }
        }
        System.out.println("Marks of students as follows");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){

                    System.out.print(arr[i][j][k]+" ");
                }
            }
            System.out.println();
        }
    }
}
