package Patterns;

public class Palindromic_pattern {
    public static void main(String[] args) {
        int N = 5;
        //char ch = 'A';
        for(int i = 1;i<=N;i++){
            for(int j = 1;j<=i;j++){
                //System.out.print((char)('A'+(j-1))+" ");
                System.out.print(j);
            }
            for(int j=i-2;j>=0;j--){
                //System.out.print((char)('A'+j)+" ");
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
