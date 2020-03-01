class Rectangle{
    int length; 
    int width;
    int getArea(){
        return length*width;
    }
}

class Area{
    public static void main(String args[]){
        Rectangle rec1=new Rectangle();
        rec1.length=100;
        rec1.width=50;
        System.out.println("area is "+rec1.length*rec1.width);

    }
}