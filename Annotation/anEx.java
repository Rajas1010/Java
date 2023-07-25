@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @ interface MyCustomAnnotation
{
	int value();
}