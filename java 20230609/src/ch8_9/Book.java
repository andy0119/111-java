package ch8_9;

public enum Book {
    JHTP("Java How To Pragram", "2015"),
    CHTP("C How To Pragram", "2016");
    
    public final String title;
    public final String copyrightYear;

    Book(String title, String copyrightYear){
        this.title = title;
        this.copyrightYear = copyrightYear;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getCopyrightYear() {
        return this.copyrightYear;
    }
}
