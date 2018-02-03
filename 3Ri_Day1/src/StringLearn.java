
public class StringLearn {

//	String s1 = new String("Prateek");
String s1= "Prateek";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringLearn s = new  StringLearn();
		
		char a = s.s1.charAt(5);
		System.out.println(a);
		
		int b = s.s1.indexOf('e');
		System.out.println(b);
		
		int c = s.s1.length();
		System.out.println(c);
		
		String d = s.s1.substring(2);
		System.out.println(d);
		
		String e = s.s1.substring(2, 6);
		System.out.println(e);
		
		Boolean f = s.s1.contains("ra");
		System.out.println(f);
		
		String g = s.s1.concat("Gupta");
		System.out.println(g);
		
		Boolean h = s.s1.equals("Prateek");
		System.out.println(h);
		
		String i = s.s1.replace("e", "E");
		System.out.println(i);
		
		String j = s.s1.toLowerCase();
		System.out.println(j);
		
		String k = s.s1.toUpperCase();
		System.out.println(k);
		
		String p = s.s1.substring(0, 2).substring(0, 1)	;
		System.out.println(p);
		
		
		String l = s.s1.replaceAll("Pratek", "Jamal");
		System.out.println(l);
		System.out.println(s.s1.lastIndexOf('e'));
		//6System.out.println(s.s1.re(s.s1.charAt(5), 'E'));
		
		char [] w = s.s1.toCharArray();
		w[5] = '$';
		System.out.println(w.length);
		s.s1 = String.valueOf(w);
		
		System.out.println(s.s1);
		
		StringBuilder str = new StringBuilder(s.s1);
		str.setCharAt(5,'^');
		System.out.println(str);
		
	    
		
	}
}
