class mobilebattery
{
	public static void main(String[]args)
	{
		
	 int battery = 20;
	 
	 if (battery>=80)
	 {System.out.println("full");}
	  else if ((battery>30)&&(battery <79))
	  { System.out.println("battery normal");}
	 
      else if(battery<30)
	  { System.out.println("low battery");}
      else 
	 { System.out.println("thankyou");}
        System.out.println("charge now" );
	 
	 
	 
		
	}
}