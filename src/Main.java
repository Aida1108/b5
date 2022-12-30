public class Main {
    public static void main(String[] args) {
        /** Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида:
         * «Название книги» И.О.Автора.
         */
        Author author1 = new Author("Александр", "Сергеевич");
        Author author2 = new Author("Антон", "Павлович");
        Book book1 = new Book("Капитанская дочка", author1);
        Book book2 = new Book("Вишневый сад", author2);
        System.out.println( "Название книги " + book1.getTitle() + " " + author1.getName() + " " + author1.getMiddleName() + " Автор " );
        System.out.println( "Название книги " + book2.getTitle() + " " + author2.getName() + " " + author2.getMiddleName() + " Автор " );

    }
}