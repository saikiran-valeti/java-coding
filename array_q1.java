import java.util.Scanner;
public class array_q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
		int n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter numbers from range 0 to 100: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int i=n-1;i>=0;i--){
            System.out.print(a[i] + " ");
        }
        
    }
}