public class Book {
    private String nameBook;
    private Autor autorBook;
    private int yearBook;


    public Book(String nameBook, Autor autorBook, int yearBook) {
        this.nameBook = nameBook;
        this.autorBook = autorBook;
        this.yearBook = yearBook;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Autor getAutorBook() {
        return this.autorBook;
    }

    public int getYearBook() {
        return this.yearBook;
    }

    public void setYearBook (int yearBook) {
        this.yearBook = yearBook;
    }


}
