//9) Write a Java Program to Print Name, Emp Id, Designation and Company name using get and set method
class Encap{
String Name;
int emp_id;
String Designation;
String Company;
String get(){
	return Name;
	}
void set(String f){
	this.Name=f;
	}
	public static void main(String[] args){
	Encap o = new Encap();
	o.set("India");
	System.out.println(o.get());
	}
	}
	
