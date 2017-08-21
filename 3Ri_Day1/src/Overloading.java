class overload
{
	void add(int i,int j)
	{
		System.out.println(i + j);
	}
	void add(int i,int j,int k)
	{
		System.out.println(i + j + k);
	}
	void add(String s1,String s2)
	{
		System.out.println(s1 +" "+ s2);
	}

}

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload a = new overload();
		a.add(2, 3);
		a.add(1, 2, 3);
		a.add("Prateek", "Gupta");
	}

}
