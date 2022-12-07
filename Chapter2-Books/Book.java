/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @yoyold
 * @v2 07-12-22
 */


class Book
{
    static int isbnCounter = 0;
    
    // The fields.
    private String author;
    private String title;
    private int pages;
    private int isbn;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int PageAmount)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = PageAmount;
        isbnCounter++;
        isbn = isbnCounter;
    }

    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()

    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public int getISBN()
    {
        return isbn;
    }
    
    public void printAuthor()
    {
        System.out.println(getAuthor());
    }
    
    public void printTitle()
    {
        System.out.print(getTitle());
    }
    
    public void printPages()
    {
        System.out.print(getPages());
    }
    
    public void printISBN()
    {
        System.out.print(getISBN());
    }
    
    public void printBook()
    {
        System.out.println("Title: ");
        printTitle();
        System.out.println("Author: ");
        printAuthor();
        System.out.println("Pages: ");
        printPages();
        System.out.println("ISBN: ");
        printISBN();
    }
    
}
