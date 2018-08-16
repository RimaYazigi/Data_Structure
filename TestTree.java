
package MyPhoneBook;

public class TestTree{

public static void main(String[] args) {
    PhoneTree PT = new PhoneTree();
    
 
         PT.insert("Bob Smith", new Person("Bob", "Smith", "555-235-1111", "bsmith@somewhere.com")); 
         PT.insert("Jane Williams", new Person("Jane", "Williams","555-235-1112","jw@something.com" )); 
         PT.insert("Mohammed al-Salam", new Person("Mohammed", "al-Salam", "555-235-1113", "mas@someplace.com")); 
         PT.insert("Pat Jones", new Person("Pat", "Jones", "555-235-1114", "pjones@homesweethome.com")); 
         PT.insert("Billy Kidd", new Person("Billy", "Kidd", "555-235-1115", "billy_the_kid@nowhere.com")); 
         PT.insert("H. Houdini", new Person("H.", "Houdini", "555-235-1116", "houdini@noplace.com")); 
         PT.insert("Jack Jones", new Person("Jack", "Jones"  , "555-235-1117", "jjones@hill.com")); 
         PT.insert("Jill Jones", new Person("Jill", "Jones", "555-235-1118", "jillj@hill.com")); 
         PT.insert("John Doe", new Person("John", "Doe", "555-235-1119", "jdoe@somedomain.com")); 
         PT.insert("Jane Doe", new Person("Jane", "Doe", "555-235-1120", "jdoe@somedomain.com")); 
 
 
        PT.find("Pat", "Jones"); 
        PT.find("Billy", "Kidd"); 
 
 
         PT.delete("John","Doe"); 
 
 
         PT.insert("Test Case", new Person("Test", "Case", "555-235-1121", "Test_Case@testcase.com")); 
         PT.insert("Nadezhda Kanachekhovskaya", new Person("Nadezhda", "Kanachekhovskaya", "555-235-1122", "dr.nadezhda.kanacheckovskaya@somehospital.moscow.ci.ru" )); 
         PT.insert("Jo Wu", new Person("Jo", "Wu", "555-235-1123", "wu@h.com")); 
         PT.insert("Millard Fillmore", new Person("Millard", "Fillmore", "555-235-1124", "millard@theactualwhitehouse.us")); 
         PT.insert("Bob vanDyke", new Person("Bob", "vanDyke", "555-235-1125", "vandyke@nodomain.com")); 
         PT.insert("Upside Down", new Person("Upside", "Down", "555-235-1126", "upsidedown@rightsideup.com")); 
 
         PT.find("Nadezhda", "Kanachekhovskaya"); 
         PT.find("Jack", "Jones"); 
         PT.find("Nadezhda", "Kanachekhovskaya"); 
  
         PT.delete("Jill","Jones"); 
         PT.find("John", "Doe"); 
 
 
         PT.find("Jill", "Jones"); 
         PT.find("John", "Doe"); 
         PT.find("Nadezhda", "Kanachekhovskaya");    
         PT.find("Mallard", "Fillmore");
        
} 


 } 



