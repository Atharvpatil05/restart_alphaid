public class zeronetriangle_21_03 {
    public static void main(String[]args){
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
               if ((i+j)%2==0){
                   System.out.print("1");
               }else {
                   System.out.print("0");
               }
            }
            System.out.println();
        }
    }
}
// 0-1 triangle in this gwt observe or get a pattern of number printing that when sum of row and column is even then we print 1 or if sum is odd we print 0
/*
        1
        01
        101
        0101
        10101
*/