// -------------------Name:Sandeep Kaur------------------------------
//----------------------Number:a00245516-----------------------------

package program2;
import java.util.*;
public class UnitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the current unit of measurement");
      String current_unit= sc.nextLine();              //reads string   
      
      //this section will executed if entered unit is kilometer
      if(current_unit.compareTo("km")==0)
      {
    	  System.out.println("enter value you want to convert to miles");
    	  double km_value=Float.parseFloat(sc.next()); //reads numerical value from console
    	  double miles_value=1.6*km_value; //here we are converting the value
    	  System.out.println("after conversion from km to mi:"+miles_value);//we are printing final result
      }
    //this section will executed if entered unit is centimeter
      if(current_unit.compareTo("cm")==0)
      {
    	  System.out.println("enter value you want to convert to inches");
    	  double cm_value=Float.parseFloat(sc.next());
    	  double in_value=2.54*cm_value;
    	  System.out.println("after conversion from cm to in:" +in_value);
      }
      
      if(current_unit.compareTo("kg")==0)
      {
    	  System.out.println("enter value you want to convert to labs");
    	  double kg_value=Float.parseFloat(sc.next());
    	  double lb_value=.45*kg_value;
    	  System.out.println("after conversion from cm to in:" +lb_value);
      }
      if(current_unit.compareTo("g")==0)
      {
    	  System.out.println("enter value you want to convert to ounces");
    	  double g_value=Float.parseFloat(sc.next());
    	  double oz_value=28.35*g_value;
    	  System.out.println("after conversion from cm to in:" +oz_value);
      }
      if(current_unit.compareTo("mi")==0)
      {
    	  System.out.println("enter miles value you want to convert to kilometers");
    	  double mi_value=Float.parseFloat(sc.next());
    	  double km_value=.62*mi_value;
    	  System.out.println("after conversion from cm to in:" +km_value);
      }
      if(current_unit.compareTo("in")==0)
      {
    	  System.out.println("enter inches value you want to convert to centimeters");
    	  double in_value=Float.parseFloat(sc.next());
    	  double cm_value=.39*in_value;
    	  System.out.println("after conversion from cm to in:" +cm_value);
      }
    	  
         		  
	}

}
