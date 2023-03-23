public class hollowRect_1603 {
    public static void hollowrect(int totrows,int colms){
     for (int i=1;i<=totrows;i++){
         for (int j=1;j<=colms;j++){
             if (i==1 || i==totrows|| j==1 || j==colms){
                 System.out.print("*");
             }else {
                 System.out.print(" ");
             }
         }
         System.out.println();
     }
    }
    public static void main(String[]args){
        hollowrect(4,5);
    }
}
  /*    *****
        *   *
        *   *
        *****     */

//if condition is design as to match hollow rectangle pattern if anyone condition is true in if statement then * is printed..