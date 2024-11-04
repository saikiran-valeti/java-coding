public class array_building {
    public static void main(String[] args) {
        int a[]={3,5,1,2,6,4,7};
        int x=a[0];
        int total=1;

        for(int i : a){
            if(x<i){
                total=total+1;
                x=i;
            }
        }
        System.out.println(total);
    }
}