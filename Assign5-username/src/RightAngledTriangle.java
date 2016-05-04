/**
 * SE320- Individual Assignment 5
 * 
 * Represents a Right Angled Triangle
 * @author Dr. Donyina
 * @author Amit Ben-David
 * @since 2016-04-18
 */
public class RightAngledTriangle extends Triangle {
    
    /**
     * Constructs an right triangle
     *
     * @param width double of the width of the triangle
     * @param height double of the height of the triangle
     * @param hypotenuse double of the hypotenuse of the triangle
     */
    RightAngledTriangle(double width, double height, double hypotenuse)
            throws Exception {
        super(width, height, hypotenuse);
    }
    

    /**
     * Checks to see if the inputed sides are correct
     *
     * @param sideA double of the first side
     * @param sideB double of the second side
     * @param sideC double of the third side
     * @return boolean True if all sides are equal, False if not
     */
    public boolean validateInput(double sideA, double sideB, double sideC) {
        
        
            if((sideC * sideC) == ((sideA * sideA) + (sideB * sideB))){
                return true;
            }
        
        
        return false;
    }

  
    public double getArea() {
        return ((sideA * sideB) / 2);
    }

}
