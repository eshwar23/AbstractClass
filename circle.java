class circle extends Shape
{
    double radius;
    double calculateArea()
    {
        return(3.14 * radius * radius);
    }
    //super class method redifined
    public void display()
    {
        System.out.println("Radius= "+radius);
        System.out.println("Area= "+calculateArea());
    }
}