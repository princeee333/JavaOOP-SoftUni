package Encapsulation.exercise.ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
      setHeight(height);
      setLength(length);
      setWidth(width);
    }

    private void setLength(double length) {
       checkArgument(length, "Length");
        this.length = length;
    }

    private void setWidth(double width) {
        checkArgument(width,"Width");
        this.width = width;
    }

    private
    void setHeight(double height) {
        checkArgument(height,"Height");
        this.height = height;
    }

    private void checkArgument(double argument ,String argumentType){
        if (argument <= 0) {
            throw new IllegalArgumentException(argumentType+ " cannot be zero or negative.");
        }
    }

    public double calculateSurfaceArea(){
        return calculateLateralSurfaceArea() + 2 * length * width;
    }

    public double calculateLateralSurfaceArea(){
        return 2 * height * (length + width);
    }

    public double calculateVolume (){
        return width*height*length;
    }
}
