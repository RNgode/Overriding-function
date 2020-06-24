
package overridingfunction;
public class OverridingFunction {
    public static void main(String[] args) {
        
        superr vh = new sub();
        vh.move(); // prints MotorBike can move and accelerate too!!
        
         vh=new superr();
        vh.move(); // prints Vehicles can move!!
        
    }
    
}
