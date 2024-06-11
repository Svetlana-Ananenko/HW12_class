public class Main {
    public static void main(String[] args) {

        Author tolstoy = new Author("Лев ", "Толстой");
        Book warAndPeace = new Book("Война и мир", tolstoy, 1873);
        System.out.println("Книга:  " + warAndPeace.getNameBook() + ". Автор: " + tolstoy.getAuthorName() + tolstoy.getAuthorSurname() + ". Год выпуска: " + warAndPeace.getYearBook());


        Author dostoevskiy = new Author("Фёдор ", "Достоевский");
        Book crimeAndPunishment = new Book("Преступление и наказание", dostoevskiy, 1866);
        System.out.println("Книга:  " + crimeAndPunishment.getNameBook() + ". Автор: " + dostoevskiy.getAuthorName() + dostoevskiy.getAuthorSurname() + ". Год выпуска: " + crimeAndPunishment.getYearBook());

        crimeAndPunishment.setYearBook (2015);
        System.out.println("Книга:  " + crimeAndPunishment.getNameBook() + ". Автор: " + dostoevskiy.getAuthorName() + dostoevskiy.getAuthorSurname() + ". Год выпуска: " + crimeAndPunishment.getYearBook());

    }
}