import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUse {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
			Class<?> c = Class.forName("Reflectionclass");
			Object o = c.newInstance();
			  System.out.println("Fields........");  
			    Field f[]=c.getDeclaredFields();  
			    for(int i=0;i<f.length;i++)  
			        System.out.println(f[i]);  
			      
			    System.out.println("Constructors........");  
			    Constructor con[]=c.getDeclaredConstructors();  
			    for(int i=0;i<con.length;i++)  
			        System.out.println(con[i]);  
			      
			        System.out.println("Methods........");  
			    Method m[]=c.getDeclaredMethods();  
			    for(int i=0;i<m.length;i++)  
			        System.out.println(m[i]);  
			
			Class [] Parmspublicmethod =   new Class[]{int.class,int.class}; 
			Class [] Parmsprivatemethod =   new Class[]{int.class,int.class,String.class}; 
			
			Constructor c1 = o.getClass().getConstructor(String.class);
			 
			Object o1 = (Object)(c1.newInstance("StringParameter"));
			 
			Method m1 = o.getClass().getDeclaredMethod("display", Parmspublicmethod);
			Method m2= o.getClass().getDeclaredMethod("display1", Parmsprivatemethod);
			m2.setAccessible(true);
			
			m1.invoke(o, 1,2);
			System.out.println("----------------------");
			m2.invoke(o, 1,3,"Prateek");
			m2.invoke(o1,2,5,"Prateek1");    
			
	}

}
