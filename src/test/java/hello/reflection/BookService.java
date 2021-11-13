package hello.reflection;

import hello.reflection.di.Inject;

public class BookService {
	@Inject
	public BookRepository bookRepository;
}
