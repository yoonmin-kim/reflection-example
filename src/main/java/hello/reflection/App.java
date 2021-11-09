package hello.reflection;

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

    public static void main(String[] args) {
        Arrays.stream(Book.class.getAnnotations()).forEach(System.out::println);
    }
}
