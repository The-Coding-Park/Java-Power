
public class Loop {
    public static void main(String[] args) {
        int value=10;
        boolean loop=true;
        System.out.print(loop);
        int i=0;
        int sum=0;
        // while loop
        while (i<value){
            System.out.printf("Index: %d",i);
            sum=sum+i;
            System.out.println(" sum: "+sum);
            i +=1;
        }
        //for loop
        for (int j=0;j<10;j++){
            for (int k=0;k<j;k++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}