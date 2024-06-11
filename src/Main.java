public class Main {
    public static void main(String[] args) {

        Autor tolstoy = new Autor("Лев ", "Толстой");
        Book warAndPeace = new Book("Война и мир", tolstoy, 1873);
        System.out.println("Книга:  " + warAndPeace.getNameBook() + ". Автор: " + tolstoy.getNameAutorBook() + tolstoy.getSurnameAutorBook() + ". Год выпуска: " + warAndPeace.getYearBook());


        Autor dostoevskiy = new Autor("Фёдор ", "Достоевский");
        Book crimeAndPunishment = new Book("Преступление и наказание", dostoevskiy, 1866);
        System.out.println("Книга:  " + crimeAndPunishment.getNameBook() + ". Автор: " + dostoevskiy.getNameAutorBook() + dostoevskiy.getSurnameAutorBook() + ". Год выпуска: " + crimeAndPunishment.getYearBook());

        crimeAndPunishment.setYearBook (2015);
        System.out.println("Книга:  " + crimeAndPunishment.getNameBook() + ". Автор: " + dostoevskiy.getNameAutorBook() + dostoevskiy.getSurnameAutorBook() + ". Год выпуска: " + crimeAndPunishment.getYearBook());

    }
}