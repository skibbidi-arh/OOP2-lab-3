public class Book {

    String name;
    String author;
    int pages;
    String isbn;
    String type;
    String date;
    public Book(String name, String author,String type ,int pages, String date) {

        this.name = name;
        this.author = author;
        this.pages = pages;

        this.type = type;
        this.date = date;

    }
    String getName() {
        return name;
    }
    String getAuthor() {
        return author;
    }
    String getType() {
        return type;
    }
    int getPages() {
        return pages;
    }
    String getDate()
    {
        return date;
    }

}
