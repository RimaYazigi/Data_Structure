

package MyPhoneBook;

public class PhoneTreeNode {

    private Person person;
    private String name;
    private PhoneTreeNode right;
    private PhoneTreeNode left;
    public PhoneTreeNode(){}
    public PhoneTreeNode(String name, Person person, PhoneTreeNode left, PhoneTreeNode right) {
        this.name= name;
        this.person = person;
        this.right = right;
        this.left = left;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getName() {
      return this.name;
    
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhoneTreeNode getLeft() {
        return left;
    }

    public void setLeft(PhoneTreeNode left) {
        this.left = left;
    }

    public PhoneTreeNode getRight() {
        return right;
    }

    public void setRight(PhoneTreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
	return (person == null ? "" : person.toString());
    }
}

