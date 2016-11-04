class BookBean {
	String title
}

def groovyBook = new BookBean()
groovyBook.setTitle('aaa')
assert groovyBook.getTitle() == 'aaa'
groovyBook.title = 'bbb'
assert groovyBook.title == 'bbb'

