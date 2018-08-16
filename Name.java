
package MyPhoneBook;

import java.util.Objects;

/**
 *
 * @author Rima yazigi
 */
public class Name implements Comparable<Name> {
    private String firstName, lastName;

 
    

    public Name(String firstName, String lastName) {
        if (firstName == null || lastName == null)
            throw new NullPointerException();

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName(){
        return(this.firstName +this.lastName);
    }

    public void setName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName ;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Name))
            return false;
        Name n = (Name) o;
        return n.firstName.equals(firstName) && n.lastName.equals(lastName);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.firstName);
        hash = 97 * hash + Objects.hashCode(this.lastName);
        return hash;
    }

    @Override
    public int compareTo(Name n){
        int lastCmp = lastName.compareTo(n.lastName);
        return (lastCmp != 0 ? lastCmp: firstName.compareTo(n.firstName));
     } 
}


