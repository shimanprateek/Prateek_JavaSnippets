
public class StringBuf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----String Class----");
		String s = new String("Prateek");
		//s.concat("Gupta");
		//s = s.concat("Gupta");
		String s1 = s.concat("Gupta");
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println("-----StringBuffer Class----");
		StringBuffer sb= new StringBuffer("Prateek");
		//StringBuffer sb1= new StringBuffer("Prateek");
		//sb.append(sb1);
		sb.append("Gupta");
		System.out.println(sb);
		//System.out.println(sb1);
	}

}
