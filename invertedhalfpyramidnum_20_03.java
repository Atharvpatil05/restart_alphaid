public class invertedhalfpyramidnum_20_03 {
    public static void invertnum(int n){
    for (int i=1;i<=n;i++){
        for (int num=1;num<=n-i+1;num++){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    }
    public static void main(String[]args){
        invertnum(5);
    }
}
/*
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1            */