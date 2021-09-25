package Question3;
class Circle extends Shape
{
       private double radius;
       Circle(double r){
		this.radius=r;
      }
      double area(){
		return (3.14*this.radius*this.radius);
      }

}
