package lesson_7;

public class Reader {
    private String name;
    private int NumberCheck;
    private String faculty;
    private String MyBurn;
    private String phonenumber;

    public Reader(){}

    public Reader(String name){
        this.name = name;
    }

    public Reader(String name, int numberCheck,String faculty,String myBurn,String phonenumber){
        this.name = name;
        this.NumberCheck = numberCheck;
        this.faculty = faculty;
        this.MyBurn = myBurn;
        this.phonenumber = phonenumber;
    }

    public void takeBook(int countbooks){
        System.out.printf("%s взял %d книги:\n",this.name,countbooks);
    }

    public void takeBook(Book... Books){
        System.out.print(name+"взял книги\n");
        for (Book s:Books){
            System.out.println(s.getType()+", "); //проходим массив берем каждую книгу
        }
    }
}
