import java.util.Scanner;
public class finding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements: ");
        for(int i=0;i<size;i++){
            array[i] = scanner.nextInt();
        }
        int key;
        System.out.print("Enter the element you want to find: ");
        key  = scanner.nextInt();
        int count = 0;
        int l,r,m;
        l=0;
            r=size-1;
        while(l<=r){
            m=(l+r)/2;
            if(array[m]==key){
                count+=1;
                break;
            } 
            else if(m<key) r=m-1;
            else if(m>key) l=m+1;
        }
        if(count>0) System.out.println("Number exists.");
        else System.out.println("Number not exist");
        scanner.close();
    }
}
