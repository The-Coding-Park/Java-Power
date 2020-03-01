class Area{
    int length;
    int width;
    Area(){
        length=10;
        width=10;

    };
    Area(int x,int y){
        length=x;
        width=y;
    }
    Area(int x){
        length=x;
        width=x;
    }
    int area(){
        return length*width;
    }
}
class OverLoading{
    public static void main(String args[]){
        Area ar1=new Area();
        System.out.println(ar1.area());
    }
}