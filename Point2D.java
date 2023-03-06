public class Point2D {
    
    private double x;
    private double y;

    public Point2D(double x,double y){
        this.x = x;
        this.y = y;
    }


    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }


    public double distanceTo(Point2D other){
        return (Math.sqrt(Math.pow(this.x-other.x,2)+Math.pow(this.y-other.y,2)));
    }


    public static void main(String[] args) {
        Point2D bruh = new Point2D(0,0);
        Point2D bruh2 = new Point2D(3,4);
        System.out.println(bruh.distanceTo(bruh2));
    }




    



}
