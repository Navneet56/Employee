
public class Main {
	public static void main(String[] args) {
		Interface1 i1=new ConcreteClass1();
		AbstractDemo ad= (AbstractDemo) i1;
		ConcreteClass1 cc1= (ConcreteClass1) ad;
		cc1.method1();
		cc1.method2();
		cc1.method3();
		cc1.method4();
		cc1.method5();
		cc1.method6();
	}

}
