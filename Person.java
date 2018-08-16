
package MyPhoneBook;
public class Person  {
    private final Name name;
    private String email;
    private String phoneNumber;
     
    
    public Person(String firstName,String lastName,String phoneNumber, String email){
        this.name = new Name(firstName, lastName);
        this.email = email;
        this.phoneNumber = phoneNumber;
       }


    public String getLastName() {
        return this.name.getLastName();
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.name.setLastName(lastName);
    }

    public String getFirstName() {
        return this.name.getFirstName();
    }

    public void setFirstName(String firstName) {
        this.name.setFirstName(firstName);
    }

    public void setemail(String email)
	{
		this.email = email;
        }
    public String getemail()
	{
		return email;
	}
	public String getphoneNumber()
	{
		return phoneNumber;
	}
	
	public void setphoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

    @Override
    public String toString() {
        return name.toString() + email + phoneNumber;
    }

}