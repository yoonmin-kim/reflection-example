package hello.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App
{
    // public static void main( String[] args ) throws ClassNotFoundException, NoSuchFieldException {
    //     Class<Book> bookClass = Book.class;
    //
    //     Arrays.stream(bookClass.getFields()).forEach(System.out::println);
    //     System.out.println("==============================================");
    //     Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println);
    //
    //     // 필드명을 알고 있을 경우
    //     System.out.println(bookClass.getField("d"));
    //     System.out.println(bookClass.getDeclaredField("d"));
    //     Book book = new Book();
    //
    //     // 필드와 필드값 접근
    //     Arrays.stream(bookClass.getDeclaredFields()).forEach(field -> {
    //         try {
    //             field.setAccessible(true);
    //             System.out.println(field + " " + field.get(book));
    //         } catch (IllegalAccessException e) {
    //             e.printStackTrace();
    //         }
    //     });
    //
    //     Arrays.stream(Book.class.getDeclaredFields()).forEach(f -> {
    //         int modifiers = f.getModifiers();
    //         System.out.println(f);
    //         System.out.println(Modifier.isPrivate(modifiers));
    //         System.out.println(Modifier.isStatic(modifiers));
    //     });
    //
    //     // 메소드 접근
    //     Arrays.stream(bookClass.getMethods()).forEach(System.out::println);
    //
    //     // 생성자 접근
    //     Arrays.stream(bookClass.getConstructors()).forEach(System.out::println);
    //
    //     // 슈퍼클래스 접근
    //     System.out.println(MyBook.class.getSuperclass());
    //
    //     // 인터페이스 접근
    //     Arrays.stream(MyBook.class.getInterfaces()).forEach(System.out::println);
    //
    // }

    // public static void main(String[] args) {
    //     Arrays.stream(Book.class.getAnnotations()).forEach(System.out::println);
    // }

    public static void main(String[] args) throws
        ClassNotFoundException,
        NoSuchMethodException,
        InvocationTargetException,
        InstantiationException,
        IllegalAccessException, NoSuchFieldException {
        Class<?> bookClass = Class.forName("hello.reflection.Book");
        Constructor<?> constructor = bookClass.getConstructor(String.class, String.class, String.class);
        Book book = (Book)constructor.newInstance("x", "y", "z");
        System.out.println(book);

        Field B = bookClass.getDeclaredField("B");
        System.out.println(B.get(null));
        Field d = bookClass.getDeclaredField("d");
        System.out.println(d.get(book));
        d.set(book, "test");
        System.out.println(book.d);

        Method f = bookClass.getDeclaredMethod("f");
        f.setAccessible(true);
        f.invoke(book);

        Method sum = bookClass.getDeclaredMethod("sum", int.class, int.class);
        System.out.println(sum.invoke(book, 2, 3));

    }
}
