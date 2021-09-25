package Question3;
class Rectangle extends Shape
{
     private double length,breadth;
      //provide parameterized constructor
        Rectangle(double l,double b)
        {
	        this.length=l;
	        this.breadth=b;
        }
     // override area() ;
        double area()
        {
            return (this.length*this.breadth);
        }
}
