public class Circle {
    private Point2D position;
    private double r;

    public Circle(Point2D position, double r){
        this.position = position;
        this.r = r;
    }

    public double getArea(){
        return (Math.PI*Math.pow(r,2));
    }
    public double getCircumference(){
        return(2*Math.PI*r);
    }
    public boolean intersectWith(Circle other){

        if(this.position.distanceTo(other.position)<=this.r+other.r){
            return(this.position.distanceTo(other.position)>=Math.abs(this.r-other.r));
        }
        return false;
        
    }


     
    public boolean contains(Circle other){

        if(this.intersectWith(other)){
            return false;
        }else{
           if(other.r+this.position.distanceTo(other.position)<this.r){
            return true;
           } 
           return false;
        }

    }
    

    
    public static void main(String[] args) {
        Point2D bruh1 = new Point2D(0, 0);
        Point2D bruh2 = new Point2D(-.9, 0);

        Circle circle = new Circle(bruh1,5);
        Circle circle2 = new Circle(bruh2,4);
        System.out.println(circle.intersectWith(circle2));
        System.out.println(circle2.intersectWith(circle));
        System.out.println(circle.contains(circle2));
    }



}
