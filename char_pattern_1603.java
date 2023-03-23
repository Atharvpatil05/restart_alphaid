public class char_pattern_1603 {
    public static void main(String[]args){
        char ch='A';
        for (int i=1;i<=4;i++){
            for (int lett=1;lett<=i;lett++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
       /* A
        B C
        D E F
        G H I J */