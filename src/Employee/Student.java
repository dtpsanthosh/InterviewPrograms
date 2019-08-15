package Employee;
class Student {
   String name; 
   int age; 
   int id; 
   Student(String n, int a, int i){ 
	      this.name = n; 
	      this.age = a; 
	      this.id = i; 
	   } 
   public String getName() {
      return name; 
   } 
   public int getAge() { 
      return age; 
   } 
   public int getId() { 
      return id; 
   } 
   
   @Override public String toString() {     
      return ("Student[ "+"Name:"+this.getName()+             
              " Age: "+ this.getAge() +                     
              " Id: "+ this.getId()+"]"); 
   }
}