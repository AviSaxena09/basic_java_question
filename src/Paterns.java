public class Paterns {
    public static void main(String[] args) throws InterruptedException {
        ///////////////////////patern 1.///////////////
        System.out.println("Pattern 1 :");
        int col=1,row=5,space=10;
        for(int i=1;i<=row;i++){
            System.out.println("");
            for(int s=1;s<=space;s++){
                System.out.print(" ");
            }
            space--;
            for(int j=1;j<=col;j++){
                System.out.print("*");
            }
            col+=2;
        }
        ///////////////////////////////////////////////
        Thread.sleep(2000);
        //////////////////////patern 2////////////////////////
        System.out.println("\nPattern 2 :");
        col=1;
        space=10;
        for(int i=1;i<=row;i++){
            System.out.println("");
            for(int s=1;s<=space;s++){
                System.out.print(" ");
            }
            space--;
            for(int j=1;j<=col;j++){
                if(j==1 || j==col || i==row)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            col+=2;
        }
        ///////////////////////////////////////////////
        Thread.sleep(2000);
        //////////////////////patern 3////////////////////////
        System.out.println("\nPattern 3 :");
        col=1;
        space=10;
        row=10;
        for(int i=1;i<=row;i++){
            System.out.println("");
            for(int s=1;s<=space;s++){
                System.out.print(" ");
            }

            for(int j=1;j<=col;j++){
                if(j==1 || j==col || i==row)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            if(i<row/2){
                col+=2;
                space--;
            }
            else{
                col-=2;
                space++;
            }

        }
    }
}
