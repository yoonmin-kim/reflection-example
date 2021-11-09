package hello.reflection;

import java.util.Arrays;

public class MyBook extends Book implements MyInterface{

	public static void main(String[] args) {
		Arrays.stream(MyBook.class.getMethods()).forEach(method -> {
			Arrays.stream(method.getAnnotations()).forEach(annotations -> {
				if (annotations instanceof MyAnnotation) {
					MyAnnotation myAnnotation = (MyAnnotation)annotations;
					System.out.println(myAnnotation.value());
					System.out.println(myAnnotation.number());
				}
			});

		});
	}

	@MyAnnotation("마이어노테이션")
	public void method() {

	}
}
