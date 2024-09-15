public class patterns2 {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        int x=5;
        for(int i=5;i<=x;i--){
           for(int j=1;j<=i;j++){
            System.out.print("#");
           }
           System.out.println();
        }
    }
}
