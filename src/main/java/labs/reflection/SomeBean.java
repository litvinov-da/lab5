package labs.reflection;

public class SomeBean {
	@AutoInjectable
	SomeInterface interface1;
	@AutoInjectable
	SomeOtherInterface interface2;
	
	public void f() {
		interface1.doSomething();
		interface2.doOtherSomething();
	}
}
