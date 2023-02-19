package Testrail_client;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


public class Testrails {
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD) //on method level
	public @interface TestRails {

		String id() default "none";
	}
}
