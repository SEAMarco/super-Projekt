package de.telekom.sea7.javaLangObjectQuest;

public class Person {
	
	private String firstname;
	private String lastname;
	private int dayOfBirth;
	private int monthOfBirth;
	private int yearOfBirth;
	public int hashCode;
	public static int counter = 1;

	
	// My own Constructor
	public Person(String firstname, String lastname, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.dayOfBirth = dayOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.yearOfBirth = yearOfBirth;
		
		System.out.println( this.getClass() + " -- you created Person " + counter);
		counter ++;
		
	}
	
	
	// MyOwn toString Method 
	public String toString() {
		return  "Birthday: " + this.dayOfBirth + "." + this.monthOfBirth + "." + this.yearOfBirth +
				": " + this.firstname + " " + this.lastname;
	}
	
	// Example for a own equals-Method that check differences between firstname of 2 people
    public boolean equals(Person newPerson) {
        
    	if (this.firstname.equals(newPerson.firstname)) {
    		System.out.println("Person with same firstname is already existing!");
    		return true;
    	} else {
    		System.out.println("It is a person like a different firstname");
    		return false;
    	}
    	
    }
	
    // My own hashCode Method
    public int myHashCode(int dayOfBirth, int monthOfBirth, int yearOfBirth, int hashCode) {
    	this.hashCode = hashCode;
    	this.dayOfBirth = dayOfBirth;
    	this.monthOfBirth = monthOfBirth;
    	this.yearOfBirth = yearOfBirth;
    	hashCode = 1;
    	hashCode = this.hashCode * this.dayOfBirth * this.monthOfBirth * this.yearOfBirth;
    	return hashCode;
    }
	
	
	// Get-/Set-Methods to read and set the private Variables
	public String getFirstname() { return firstname;    }
	public String getLastname()  { return lastname;     }
	public int getDayOfBirth()   { return dayOfBirth;   }
	public int getMonthOfBirth() { return monthOfBirth;	}
	public int getYearOfBirth()  { return yearOfBirth;	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname; }
	public void setLastname(String lastname) {
		this.lastname = lastname;   }
	public void setDayOfBirth(int dayOfBirth) {
		this.dayOfBirth = dayOfBirth; }
	public void setMonthOfBirth(int monthOfBirth) {
		this.monthOfBirth = monthOfBirth; }
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth; }
	
	
	
	
	
}
