package Part10.FilesAndStreams;


public class Book {

    private String name;
    private int publishingYear;
    private int pageCount;
    private String author;

    public Book(String name, int ReleaseYear, int pages, String author) {
        this.name = name;
        this.publishingYear = ReleaseYear;
        this.pageCount = pages;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagecount() {
        return pageCount;
    }

    @Override
    public String toString()
    {
        return "Book Title: " + this.name + "\n" +
                "Published Year: " + this.publishingYear + "\n" +
                "Author: " + this.author + "\n" +
                "Book Pages: " + this.pageCount;

    }
}
