package ua.fesvlast.tim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	    System.out.println("This programme is counting the rectangle square.");

        double a=inputDoubleValue("WIDTH");
        double b=inputDoubleValue("HEIGHT");
        Rectangle rect =new Rectangle();
        rect.setHeight(b);
        rect.setWidth(a);
       System.out.println("WIDTH: "+rect.getWidth());
       System.out.println("HEIGHT: "+rect.getHeight());
       System.out.println("SQUARE: "+rect.countSquare());
    }

    public static double inputDoubleValue(String nameOfParam) throws IOException {
        double a=0.D;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader reader =new BufferedReader(isr);

        while(true){
            System.out.print("Enter the value "+nameOfParam+": ");
            String str=reader.readLine();
            if(str.equalsIgnoreCase("exit")){
                a=-1D;
                break;
            }
            try{
                a=Double.parseDouble(str);
                if(a<=0) throw new NumberLessZeroException();
                break;
            }catch (NumberFormatException e){
                System.out.println("You doesn't input a number!. Please, try again.");
            }catch (NumberLessZeroException e){
                System.out.println("The "+nameOfParam+" of the square should be greater than zero!");
                System.out.println("The "+nameOfParam+" of the square shouldn't equal zero!. Please, try again.");
            }
        }
        if(a==-1.0)
            System.exit(0);
        return a;
    }
}
