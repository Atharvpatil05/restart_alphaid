public class invertedNDrotatedhalfpyramid_200323 {
    public static void halfpyramid(int n){
        for (int i=1;i<=n;i++){
            for (int sp=1;sp<=n-i;sp++){
                System.out.print(" ");
            }
            for (int sp=1;sp<=i;sp++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
     halfpyramid(4);
    }
}

 /*              *
                **
               ***
              ****        */