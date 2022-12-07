import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WorkingFiles {
    public static void main(String[] args) {

        List<Produtos> produtos = new ArrayList<Produtos>();
        produtos.add(new Produtos("Banana", 20d));
        produtos.add(new Produtos("Banana", 20d));
        produtos.add(new Produtos("Banana", 20d));
        produtos.add(new Produtos("Banana", 20d));
        produtos.add(new Produtos("Banana", 20d));

        produtos.clear();
    }
}

class Produtos{

    private String name;
    private Double price;


    public Produtos(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
