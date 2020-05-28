package firstAssignment;

interface Area
{
double calculate(double l, double b);
}

class Rectangle implements Area
{
public double calculate(double l, double b)
{
return(l * b);
}
}

class Triangle implements Area
{
public double calculate(double l,double b)
{
return(l * b)/2;
}
}

class InterfaceArea
{
public static void main(String args[])
{
Rectangle rect = new Rectangle();
Triangle tri = new Triangle();
Area area;
area = rect;
System.out.println("Area Of Rectangle = "+ area.calculate(2,40));

area = tri;
System.out.println("Area Of Triangle = "+ area.calculate(20,30));
}
}

