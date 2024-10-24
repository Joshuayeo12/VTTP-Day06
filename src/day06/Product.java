package src.day06;

public class Product {
    private Long id;
    private String name;
    private String description;
    private String category;
    
    
    public Product(long l, String string, String string2) {
        //TODO Auto-generated constructor stub
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
   
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public String getCategory() {
        return category;
    }
    //@Override
    //public String toString() {
        //return "Product [getCategory()=" + getCategory() + "]";


        //csv format
        //return id + ", " + name + ", " + description + ", " + category;
    //}

    public void print(){
        System.out.println(toString());
    }
   
    }