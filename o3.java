package pc1;


public class o3{
	static class parent {
		void summate(int m,int n) {
			System.out.println(m+n);
		}
	}
		 static class chil extends parent{
			//System.out.println("I am a child");
		}
	
	
	public static void main(String[] args) {
		parent obj1 = new parent();
		chil obj2 = new chil(); 
		
		obj2.summate(4, 5);
		obj1.summate(7,8);
	}

}
