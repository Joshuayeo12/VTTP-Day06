package src.day06;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.sound.sampled.SourceDataLine;




public class App {

    public static void main(String[] args) {
       
     MyImplementation my1 = new MyImplementation();
     MyImplementation my2 = new MyImplementation();
     MyImplementation my3 = new MyImplementation();
     MyImplementation my4 = new MyImplementation();
     MyImplementation my5 = new MyImplementation();
    
    //execute the task using a single thread
    ExecutorService es = Executors.newSingleThreadExecutor();
    //es.execute(my1);
    //es.shutdown();

    // execute the task using fixed thread pool
    //ExecutorService esl = Executors.newFixedThreadPool(5);
    //es.execute(my1);
    //es.execute(my2);
    //esl.execute(my3);
    //esl.execute(my4);
    //esl.execute(my5);
    //esl.shutdown();

    //List<Product> proudct = new ArrayList<Product>();
    //List<Product> products;
    //products.add(new Product(1L, "Apple Ipad", "Apple tablet"));
    //products.add(new Product(3L "Logitec Mouse", "Mouse", "Computer"));
    //products.add(new Product(4L "Apple Macbook Pro", "Apple Laptop", "Computer"));
    //products.add(new Product(5L "32 inch monitor", "Samsung Monitor", "Computer"));
    //products.add(new Product(6L "Logitec Mouse", "Mouse", "Computer"));
    //products.add(new Product(7L "M1", "C1", "mobile"));
    //products.add(new Product(8L "M2", "C2", "mobile"));
    //products.add(new Product(9L "M3", "C3", "mobile"));

    //products.forEach(prod ->{
        //System.out.println(prod);
    //});

   // products.forEach(Product::toString);

    //only retrieve products with category 'mobile'
    //using stream and lambda functions
    //List<Product> filteProducts = new ArrayList<>();
    //filteProducts = products
    //    .stream()
    //    .filter(p->p.getCategory().equals("mobile"))
    //    .collect(Collectors.toList());

    //filteredProducts.forEach(Product::print);

    LocalDate id = LocalDate.of(1990, 1, 12);
    Date currentDate = Date.from(id.atStartOfDay(ZoneId.systemDefault()).toInstant());
    List<Person> persons = new LinkedList<>();
    persons.add(new Person(1L, "John", "Tan", 3000.0, currentDate));
    persons.add(new Person(2L, "Chris", "Lew", 3000.0, currentDate));
    persons.add(new Person(3L, "Thomas", "Tan", 3000.0, currentDate));
    persons.add(new Person(4L, "Tom", "Lim", 3000.0, currentDate));
    persons.add(new Person(5L, "Brandon", "Wong", 6000.0, currentDate));
    persons.add(new Person(6L, "Bryan", "Tan", 5000.0, currentDate));
    persons.add(new Person(7L, "May", "Tan", 35000.0, currentDate));
    
    Comparator<Person> compare = Comparator.comparing(p -> p.getFirstName());
        persons.sort(compare.reversed());
        persons.forEach(p -> {
            System.out.println(p.toString());
        });

        Comparator<Person> compareMutilple = Comparator.comparing(Person::getFirstName)
            .thenComparing(Person::getLastName);
        persons.sort(compareMutilple);
        persons.forEach(p ->{
            System.out.println(p.toString());
        });

        //MyInterface<Integer> addOperation = (a, b) -> {
          //  return a + b;
        //};


     }

    }
