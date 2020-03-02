
package circle;

import circle.utils.*;


public class Circle
{
    public Point center;
    public double radius;

    public void enlarge(double f)
    {
        radius *= f;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public String toString()
    {
        return "(" + center.getX() + "," + center.getY() + "), r = " + radius;
    }
}
