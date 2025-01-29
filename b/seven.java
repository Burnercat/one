import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class seven {
    public static void main(String args[]){
        List<String> names = Arrays.asList("Amaan", "Aarav","Nikil","Ravi","Megha","Akshay","Abhay");

        List<String> filteredNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());

        System.out.println("Names with 'A'"+filteredNames);
    }
}