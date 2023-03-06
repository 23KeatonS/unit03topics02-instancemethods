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
        double xLeft = other.position.getX()-other.r;
        double xRight = other.position.getX()+other.r;
        double yTop = other.position.getY()+other.r;
        double yBot = other.position.getY()-other.r;
        double selfLeft = this.position.getX()-r;
        double selfRight = this.position.getX()+r;
        double selfTop = this.position.getY()+r;
        double selfBot = this.position.getY()-r;
        if (selfLeft<xRight&& selfLeft>xLeft){
            return true;
        }
        if(selfRight>xLeft&&selfRight<xRight){
            return true;
        }
        return false;
        
    }



}
