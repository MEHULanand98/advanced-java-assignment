/**
 * 
 */
package practice;

public class SpeedChecking {

    
    public static int checkSpeed(int speed, int birthday) {

        if (birthday == 1) {
            speed = speed - 5;   
        }

        if (speed <= 60) {
            return 0;
        } else if (speed <= 80) {
            return 1;
        } else {
            return 2;
        }
    }

    
    public static void main(String[] args) {

        System.out.println(checkSpeed(60, 0)); 
        System.out.println(checkSpeed(65, 1)); 
        System.out.println(checkSpeed(75, 0)); 
        System.out.println(checkSpeed(85, 1)); 
        System.out.println(checkSpeed(90, 0)); 
    }
}
