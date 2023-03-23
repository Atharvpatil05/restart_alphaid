public class solidRhombus_21032023 {
    public static void rhombus(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        rhombus(7);
    }
}
//Jay Shree Ram
//we print this pattern by logic running inner loop spaces(n-i)+stars(n)

/*
            *******
           *******
          *******
        *******
       *******
      *******
     *******
*/