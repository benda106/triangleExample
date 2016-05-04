
/**
 * SE320- Individual Assignment 5
 * 
 * Represents a Triangle
 * @author Dr. Donyina
 * @author Amit Ben-David
 * @since 2016-04-18
 */
public class Triangle {
    
 
    protected double sideA;
    
   
    protected double sideB;
    
    
    protected double sideC;
    
 
    
 
    Triangle(double sideA, double sideB, double sideC) throws Exception {
        
        if (!validateInput(sideA, sideB, sideC)) {
            throw new Exception("Invalid Inputs");
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
   
    public boolean validateInput(double sideA, double sideB, double sideC) {
       if( sideA > 0 && sideB > 0 && sideC > 0){
           return true;
       }
       else return false;
    }
   
    public double getSideA() {
        return this.sideA;
    }
    
 
    public double getSideB() {
        return this.sideB;
    }
    
   
    public double getSideC() {
        return this.sideC;
    }
    
 
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
    
  
    public double getArea() {
        double p = getPerimeter()/2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

}
