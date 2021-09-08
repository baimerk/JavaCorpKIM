package lesson_7;

public class Book {
    private String type;
    private String anotherName;

    public Book(){}

    public Book(String type){
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public String getAnotherName() {
        return anotherName;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setAnotherName(String anotherName) {
        this.anotherName = anotherName;
    }

    //public boolean equals(Object o){
    //   Book book = new Book();
    //}
}
