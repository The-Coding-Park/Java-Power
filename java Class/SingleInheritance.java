class Room{
    int length;
    int width;
    Room(int x,int y){
        length=x;
        width=y;
    }
    int area(){
        return length*width;
    }
}
class RoomVal extends Room{
    int height;
    RoomVal( int x,int y,int z){
        super(x,y);
        height=z;
    }
    int volume(){
        return length*height*width;
    }

}
class SingleInheritance{
    public static void main(String args[]){
        RoomVal rc=new RoomVal(45, 45, 34);
        System.out.println(rc.area());
    }
}