public class Author {
    private String name;
    private String middleName;

    public Author(String name, String middleName){
        this.name = name;
        this.middleName = middleName;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getMiddleName(){
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
