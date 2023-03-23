public class floydsTriangle_20_03_23 {
    public static void main(String[]args){
        int digi=1;
        int n=5;
        for (int i=1;i<=n;i++){
            for (int num=1;num<=i;num++){
                System.out.print(digi+" ");
                digi++;
            }
            System.out.println();
        }
    }
}
//we increase digi value after each internation of inner loop
/*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
*/