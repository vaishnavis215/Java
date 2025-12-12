//Super Keyword is use to
//2.Access parent Method in child class
//We can access parent method in child class using super keyword
class Parent
{
	String massage="Happy Diwali";
	void eat()
	{
		System.out.println("I'm Eating Diwali Sweets...");
	}
}
class SuperMethod extends Parent
{
	String massage="Everyone";
        @Override
void eat()
{
	super.eat();
	System.out.println("I like homemode sweets..");
}
void show()
{
	System.out.println(super.massage);
	System.out.println(massage);
}
public static void main(String args[])
{
	SuperMethod d1=new SuperMethod();
	d1.show();
	d1.eat();
}

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}
