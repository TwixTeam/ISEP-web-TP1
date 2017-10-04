package ex01E;

class C extends B {
	int x, a;

	void m() {
		System.out.println("Je suis dans la méthode m d'une instance de A");
	}

	void test() {
		a = super.x;
		a = ((B)this).x; 
		a = ((A)this).x; 
		super.m();
		((B)this).m(); // (1)
	}
	public static void main(String [] args) {
		C c = new C();
		c.test();
	}
}