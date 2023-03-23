public class diamond_21032023 {
    public static void diamond(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=(n-i);j++){
                System.out.print("   "); //triple space
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print(" * ");//one space in left and another in right
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print("   ");//triple space
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print(" * ");//one space in left and another in right
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        diamond(6);

    }
}
//Jay Shree Ram

/*
                      *
                   *  *  *
                *  *  *  *  *
             *  *  *  *  *  *  *
          *  *  *  *  *  *  *  *  *
             *  *  *  *  *  *  *
                *  *  *  *  *
                   *  *  *
                      *
 */

//easy logic just we just know common snese and our observing power is strong we can identifying pattern and we made mathematical relationship--
//--according to that relation.