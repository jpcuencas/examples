package everis.cad.platform.excelgenerator.test.excelGeneratorTest;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import com.everis.utils.excel.CadImplementation;

import everis.cad.platform.excelgenerator.test.excelGeneratorTest.dto.Person;
import javassist.CannotCompileException;
import javassist.CtClass;

/**
 * Hello world!
 *
 */
public class App
{
	// private static final Logger LOGGER = LoggerFactory.getLogger ( App.class );
	private static CadImplementation cad = new CadImplementation ( );
	private static List<Object> elements = null;
	private static CtClass element;
	private static Class<?> clazz;

	public static void main ( String[ ] args )
			throws CannotCompileException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException
	{
		elements = new ArrayList<Object> ( );
		StringBuilder json = new StringBuilder ( );
		Person p1 = new Person ( );
		p1.setId ( "1" );
		p1.setName ( "Juan" );
		p1.setSurname ( "Jimenez" );
		elements.add ( p1 );

		Person p2 = new Person ( );
		p2.setId ( "2" );
		p2.setName ( "Jose" );
		p2.setSurname ( "Lopez" );
		elements.add ( p2 );

		json.append ( "{" ).append ( "datos: [" ).append ( "1 : { " ).append ( "id : 1," ).append ( "name : Jose," )
				.append ( "surname : Jimenez," ).append ( "zipcode : 894576," ).append ( "phone : 678809343" )
				.append ( "}," ).append ( "2 : { " ).append ( "id : 1," ).append ( "name : Juan," )
				.append ( "surname : Herrero," ).append ( "zipcode : 34534," ).append ( "phone : 678853453" )
				.append ( "}" ).append ( "]" ).append ( "}" );
		/**
		 * 
		 * 
		 * // Create a Class ClassPool pool = ClassPool.getDefault ( ); // Representaciónes de: element = pool.makeClass ( "com.everis.utils.excel.integration.excel.dto.Person" ); // Clase // campo id element.addField ( CtField.make ( "public String id;", element ) ); // Añade el campo a la clase
		 * element.addMethod ( CtNewMethod.make ( "public void getId ( ) { return this.id; }", element ) ); // Añade el método a la clase element.addMethod ( CtNewMethod.make ( "public void setId ( String id ) { this.id = id; }", element ) ); // Añade el método a la clase
		 * 
		 * element.addField ( CtField.make ( "public String name;", element ) ); // Añade el campo a la clase element.addMethod ( CtNewMethod.make ( "public void getName ( ) { return this.name; }", element ) ); // Añade el método a la clase element.addMethod ( CtNewMethod.make ( "public void setName (
		 * String name ) { this.name = name; }", element ) ); // Añade el método a la clase
		 * 
		 * element.addField ( CtField.make ( "public String surname;", element ) ); // Añade el campo a la clase element.addMethod ( CtNewMethod.make ( "public void getSurname ( ) { return this.surname; }", element ) ); // Añade el método a la clase element.addMethod ( CtNewMethod.make ( "public void
		 * setSurname ( String surname ) { this.surname = surname; }", element ) ); // Añade el método a la clase
		 * 
		 * // constructor CtConstructor cons = CtNewConstructor.defaultConstructor ( element ); element.addConstructor ( cons ); // Añade el constructor a la clase // element.writeFile ( "bin/" ); // guarda el .class en disco
		 * 
		 * clazz = element.toClass ( ); Constructor<?> ctr = clazz.getDeclaredConstructor ( );
		 * 
		 * Object instance1 = ctr.newInstance ( ); instance1.getClass ( ).getDeclaredMethod ( "setId", String.class ).invoke ( instance1, "1" ); instance1.getClass ( ).getDeclaredMethod ( "setName", String.class ).invoke ( instance1, "Jose" ); instance1.getClass ( ).getDeclaredMethod ( "setSurname",
		 * String.class ).invoke ( instance1, "Jimenez" ); elements.add ( instance1 );
		 * 
		 * Object instance2 = ctr.newInstance ( ); instance2.getClass ( ).getDeclaredMethod ( "setId", String.class ).invoke ( instance2, "2" ); instance2.getClass ( ).getDeclaredMethod ( "setName", String.class ).invoke ( instance2, "Juan" ); instance2.getClass ( ).getDeclaredMethod ( "setSurname",
		 * String.class ).invoke ( instance2, "Lopez" ); elements.add ( instance2 ); /
		 **/
		// final CadImplementation cad = new CadImplementation ( );
		// final String[ ] arguments = new String[0]; // configure the Spring Boot app as needed
		// final ApplicationContext context = CadImplementation.initializeContext ( arguments ); // createSpring application context
		// final CadImplementation cad = ( CadImplementation ) context.getBean ( "CadImplementation" ); // get a reference of your bean from the application context
		// LOGGER.trace ( "Entring method %s ", "main" );
		String resultado = cad.helloWorld ( );
		// LOGGER.info ( "Resultado test: ", resultado );
		System.out.println ( "Resultado test: " + resultado );

		resultado = cad.helloWorldParameterized ( json.toString ( ) );
		// LOGGER.info ( "Resultado testParam: ", resultado );
		System.out.println ( "Resultado testParam: " + resultado );

		cad.createExcel ( "MiTabla", elements );
		System.out.println ( "Hello World! Test proyect" );
	}
}
