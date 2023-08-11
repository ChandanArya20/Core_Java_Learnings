import java.security.PublicKey;

public class forEachLoop {
    public static void main(String[] args){
    	
        int[] arr={23,56,78,90,12,32,65};
        
         for(int a:arr)
         {
             System.out.print(a+" ");
         }
         System.out.println();

         System.out.println("2D array:-");
         int[][] arr2={{23,56,78},{90,12},{32,65,45,70}};
         for(int[] a:arr2){
             for(int x:a){
                 System.out.print(x+" ");
             }
             System.out.println();
         }

         int n1[]={1,2,3};
         int n2[]={5,7,8,9,4,3};
         n1=n2;
         for(int x:n1) {
             System.out.print(x+" ");
         }
         System.out.println();

        int[] numbers;
        numbers=new int[2];
        numbers[0]=12;
        numbers[1]=13;
        numbers=new int[4];
        numbers[2]=14;
        numbers[3]=15;
        
        for(int x:numbers) {
            System.out.print(x+" ");
        }

        // String str1="Chandan";
        // String str2="Arya";
        // str2=str1;
        // System.out.println(str2);
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    } 
}
