import java.util.Scanner;
public class array_q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
		int n=sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Enter numbers from range 0 to 100: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int temp;
        for (int i=0,j=(n/2)-1;i<n/4;i++,j--){
            temp=a[i];
            a[i]=a[j-i];
            a[j-i]=temp;
         }
        for(int i=0;i<n;i++) System.out.print(a[i]+ " ");
     }
}