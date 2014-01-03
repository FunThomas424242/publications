package idiome.localizedinstance;

import java.util.Locale;

public class MyBusinessClass {

	protected MyBusinessClass(){}
	
	public static MyBusinessClass localizedInstance(){
		
		// Diese wird sich beim Server in US und DE unterscheiden
		final String locale = Locale.getDefault().getCountry();
		
		Class<?> myClass=MyBusinessClass.class;
		final String myClassName=myClass.getName()+"_"+locale;
		Class<?> myLocalizedClass;
		try{
			myLocalizedClass=Class.forName(myClassName);
		}catch(ClassNotFoundException e){
			myLocalizedClass=myClass;
		}
		MyBusinessClass myInstance;
		try{
			myInstance=(MyBusinessClass)myLocalizedClass.newInstance();
		}catch(InstantiationException e){
			myInstance= new MyBusinessClass();
		}catch(IllegalAccessException e){
			myInstance=new MyBusinessClass();
		}
		return myInstance;
	}
	
	public void doBusinessLogic(){
		// Hier wird das Standardverhalten implementiert
	}
	
	public class MyBusinessClass_DE extends MyBusinessClass {
		@Override
		public void doBusinessLogic() {
			// spezifische Implementierung
		}
	}
}
