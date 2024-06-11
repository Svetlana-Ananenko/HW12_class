public class Autor {
    private String nameAutorBook;
    private String surnameAutorBook;
    private int yearBook;

    public Autor(String nameAutorBook, String surnameAutorBook) {
        this.nameAutorBook = nameAutorBook;
        this.surnameAutorBook = surnameAutorBook;
    }

    public String getNameAutorBook() {
        return this.nameAutorBook;
    }

    public String getSurnameAutorBook() {
        return this.surnameAutorBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
}
