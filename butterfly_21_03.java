public class butterfly_21_03 {
    public static void butterfly(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        butterfly(4);
    }
}
//Jay Shree Ram
//we can make pattern for this for upper part and simply reverse outer loop for lower part of butterfly...21-03-2023

/*
        *      *
        **    **
        ***  ***
        ********
        ********
        ***  ***
        **    **
        *      *
                          */