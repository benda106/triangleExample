/**
 * SE320- Individual Assignment 5
 * 
 * Represents a Equilateral Triangle
 * @author Dr. Donyina
 * @author Amit Ben-David
 * @since 2016-04-18
 */
public class EquilateralTriangle extends Triangle {
    
	
    /**
     * Constructs an equaliteral triangle
     *
     * @param length double of a side of the triangle
     */
    EquilateralTriangle(double length)
            throws Exception {
        super(length, length, length);
    }

    /**
     * Checks to see if the inputed sides are all equal
     *
     * @param sideA double of the first side
     * @param sideB double of the second side
     * @param sideC double of the third side
     * @return boolean True if all sides are equal, False if not
     */
    public boolean validateInput(double sideA, double sideB, double sideC) {
        return sideA == sideB || sideB== sideC;
    }


    /**
     * Returns the area of the triangle
     *
     * @param sideA double of a side
     * @return Area of the triangle
     */
    public double getArea(double sideA) {
        return (Math.sqrt(3)/4) * sideA * sideA;
    }

}
