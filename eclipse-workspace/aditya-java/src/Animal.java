

import java.util.*;

public class Animal {
	
	public static final double FAVNUMBER = 1.16180;

	private String name;
	private int weight;
	private boolean haas0wner = false;
	private byte age;
	private long uniqueID;
	private char favoritechar;
	private double speed;
	private float height;
	
	protected static int number0fAnimal;
	 
	static Scanner userinput = new Scanner(System.in);
	  
			 
	
	
	public Animal() {
		number0fAnimal++;
		
		int sumOfNumbers = 5 + 1;
		System.out.println("5 + 1 =" + sumOfNumbers);
		
		int subOfNumbers = 5 -1;
		System.out.println("5 - 1 =" + subOfNumbers);
		
		int mulOfNumbers = 5 *1;
		System.out.println("5 * 1 =" + mulOfNumbers);
		
		int divOfNumbers = 5 /1;
		System.out.println("5 / 1 =" + divOfNumbers);
		
		int modOfNumbers = 5 %  1;
		System.out.println("5 % 1 =" + modOfNumbers);
		
		System.out.println("enter the name: \n");
		
		
		
		if(userinput.hasNextLine()) {
			
			this.setName(userinput.nextLine());
			
		}
		
	}


this.serFavorireColor();
this.setUniqueID();
       
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getWeight() {
		return weight;
	}




	public void setWeight(int weight) {
		this.weight = weight;
	}




	public boolean isHaas0wner() {
		return haas0wner;
	}




	public void setHaas0wner(boolean haas0wner) {
		this.haas0wner = haas0wner;
	}




	public byte getAge() {
		return age;
	}




	public void setAge(byte age) {
		this.age = age;
	}




	public long getUniqueID() {
		return uniqueID;
	}




	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("unique id set to" + this.uniqueID);
		long minNumber = 1;
		long maxNumber = 1000000;
		
		this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber) + 1));
			String stringNumber = Long.toString(maxNumber);
			
		int numberString - Integer.parseInt(stringNumber);
		System.out.println(Unique ID set to: " + this.uniqueID);
	}




	public char getFavoritechar() {
		int randomNumber = (int) (Math.random() * 126) +1;
		
		this.favoritechar= (char) randomNumber;
		
		if(randomNumber == 32) {
			
			System.out.println("fav char set to space");
			
		} else if(randomNumber=10) 
		{
			System.out.println("fav char is new line");
			
		} else 
		{
			System.out.println("fav char set to =" + this.favoritechar);
		}
		
		if((randomNumber > 97) && (randomNumber < 122) )
		{
			System.out.println("favoriate char is a lower case char");
		}
		
		if(((randomNumber > 97) && (randomNumber < 122) || ((randomNumber > 64) && (randomNumber < 91))))
		{
			System.out.println("favoriate char is a letter");
		}
	}




	public void setFavoritechar(char favoritechar) {
		this.favoritechar = favoritechar;
	}




	public double getSpeed() {
		return speed;
	}




	public void setSpeed(double speed) {
		this.speed = speed;
	}




	public float getHeight() {
		return height;
	}




	public void setHeight(float height) {
		this.height = height;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 Animal theAnimal = new Animal();

	}

}
