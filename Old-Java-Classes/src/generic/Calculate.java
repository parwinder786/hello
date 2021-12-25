package generic;

public class Calculate {
	public void isequal(int var1, int var2){
		if (var1 == var2 ){
			System.out.println("both are equal(int)");	
		}else{
			System.out.println("not equal(int)");
		}		
	}
	public <T extends Number> T isequalGeneric(T var1, T var2){
		if (var1 == var2 ){
			System.out.println("both are equal");	
		}else{
			System.out.println("not equal");			
}
		return var1;		
	}

    
public <T extends Comparable<T>> int isequalGenericone(T var1, T var2){
	if (var1.compareTo(var2) == 0){
		System.out.println("isequalgenericone -both are equal");
	}else if (var1.compareTo(var2)>0){
		System.out.println("is equalgenericone - var1 is greater");
		
	}else{
		System.out.println("is equalgenericone - var2 is greater");
	}
	return var1.compareTo(var2);
			
	
}
public <T,S> void  isequalgenericmulti(T var1, S var2){
	System.out.println(var1.getClass().getSimpleName());
	System.out.println(var2.getClass());
}
	
	
	
}
	