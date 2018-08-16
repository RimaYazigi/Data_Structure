
//Author Rima yazigi
package MyPhoneBook;
class PhoneTree{
    private PhoneTreeNode root;
    public PhoneTree(){
        root = null;
    }
    public PhoneTreeNode find(String firstName, String lastName){
        String name = firstName + " " + lastName;
        name = name.toUpperCase();
        PhoneTreeNode current = root;
        
        while(current.getName() != name){
            if (name.compareTo(current.getName()) < 0) 
                current = current.getLeft();
            
            else
                current = current.getRight();
              
            if (current == null){
                 System.out.println(name + " is  NOT in the Tree.");
                return null;}
            else if(current.getName().equals(name)){
                System.out.println(current.getPerson().toString()+ " is in the Tree." );
                return current;
            }
        
        }

        return current;
        
    }
    public void insert(String name, Person person){
           PhoneTreeNode newNode = new PhoneTreeNode(name, person,null, null);    // make new node
      newNode.setName(name.toUpperCase());       // R.Y.insert data
      newNode.setPerson(person);
      if(root==null){                // R.Y.no node in root
         root = newNode;
         System.out.println(person.toString());}
      else                          // R.Y.root occupied
         {
         PhoneTreeNode current = root;       // R.Y.start at root
         PhoneTreeNode parent;
         while(true)                // R.Y.(exits internally)
            {
            parent = current;
            if(name.compareTo(current.getName()) < 0)  // R.Y.go left?
               {
               current = current.getLeft();
               if(current == null)  // R.Y.if end of the line,
                  {                 // R.Y.insert on left
                  parent.setLeft(newNode); 
                  System.out.println(person.toString() + " was inserted in the Tree");
                  return;
                  }
               }  // R.Y.end if go left
            else                    // R.Y.or go right?
               {
               current = current.getRight();
               if(current == null)  // R.Y.if end of the line
                  {                 // R.Y.insert on right
                  parent.setRight(newNode);
               System.out.println(person.toString() + " was inserted in the Tree.");
                  return;
                  
                  }
               
               }  // R.Y.end else go right
            }  // R.Y.end while
         }  // R.Y.end else not root
      
      }  // R.Y.end insert()

public void delete(String firstName,String lastName) {
   String name = firstName + " " + lastName;
   name = name.toUpperCase();
    root = delete(root, name);
}
private static PhoneTreeNode delete(PhoneTreeNode T, String k) {
    
    if (T == null) return null;
    if (k.equals(T.getName())) {
       // R.Y.T is the node to be removed
       if (T.getLeft() == null && T.getRight() == null) return null;
       if (T.getLeft() == null) return T.getRight();
       if (T.getRight() == null) return T.getLeft();
       
       // R.Y.here if T has 2 children
       PhoneTreeNode temp = smallestTreeNode(T.getRight());
       // R.Y.copy key field from temp to T
       T.setName( temp.getName() );

       //R.Y. now delete temp from T's right subtree and return
       T.setRight( delete(T.getRight(), temp.getName()) );
       return T;
    }
    else if (k.compareTo(T.getName()) < 0) {
        T.setLeft( delete(T.getLeft(), k) );
	return T;
    }
    else {
        T.setRight( delete(T.getRight(), k) );
	return T;
    }
}
private static PhoneTreeNode smallestTreeNode(PhoneTreeNode T)
// precondition: T is not null
// postcondition: return the node in the subtree rooted at T that
//                has the smallest value
{
    if (T.getLeft() == null) return T;
    else return smallestTreeNode(T.getLeft());
}



}

