class Rectangle extends Shape
{
    double length , breadth;
    double calculateArea()
    {
        return(length*breadth);
    }
    //redifined abstract function display present in superclass
    void display()
    {
        System.out.println("length "+length);
        System.out.println("breadth "+breadth);
        System.out.println("Area=" +calculateArea());
    }
}