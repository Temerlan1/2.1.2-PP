import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Cat {

    private String name;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
