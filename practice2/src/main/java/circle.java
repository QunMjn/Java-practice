
class circle extends Shape{
    double r;
    public circle (double rr){
         r=rr;
    }
    public double circumstance(){
       return 2*Math.PI*r*r;
    }
    public double area(){
        return Math.PI*r*r;
    }
}
