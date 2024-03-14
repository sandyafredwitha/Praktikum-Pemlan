package TugasPraktikum02;

public class Books {
    private String title;
    private String writers;
    private String pages;
    private String publisher;
    private String year;
    private String synopsis;

    public Books(){
    }
    public Books (String title, String writers, String pages, String publisher, String year, String synopsis){
        this.title = title;
        this.writers = writers;
        this.pages = pages;
        this.publisher = publisher;
        this.year = year;
        this.synopsis = synopsis;
    }
    public void displayInfo(){
        System.out.println("1. Title                : " + title);
        System.out.println("2. Writer's name        : " + writers);
        System.out.println("3. Number of pages      : " + pages);
        System.out.println("4. Publisher name       : " + publisher);
        System.out.println("5. Year publication     : " + year);
        System.out.println("6. Synopsis             : " + synopsis);
    }
}
