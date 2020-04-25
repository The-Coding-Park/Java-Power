
public class Decision {
    public static void main(final String[] args) {
        boolean cnd=1<6;
        //System.out.println(cnd);
        if (cnd){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        //using while loop
        int c=0;
        while(c<10){
            System.out.println("using loop\n");
            c=c+1;
            if (c==5){
                break;
            }
        }
    }
}