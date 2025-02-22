package ReferenceMethods;

public class Main {
	public static void main(String[] args) {
		//Static method reference
		String in = "jitendra";
		StringStaticWithInstance s = new StringStaticWithInstance()
;		String stroOps = stroOps(StringOpsStatic::strOpss, in);
		System.out.println(stroOps);
		
		
		//instance method reference
		String stroOps1 = stroOps(s::strOpss, in);
		System.out.println(stroOps1);
		
		//Constructor method reference
		MyFun str22 = ConstructorReferenceeMethod::new;
		ConstructorReferenceeMethod str = str22.str("Jitendrakr");
		System.out.println(str.getStr());
		
		
		
	}
	public static String stroOps(StringOp ops , String input) {
		return ops.str(input);
	}

}
