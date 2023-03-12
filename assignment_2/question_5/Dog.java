import java.util.ArrayList;
import java.util.List;

public class Dog {
    private String breed;
    private String name;
    private List<Paw> paws;

    public Dog() {
        breed = "";
        name = "";
        paws = new ArrayList();

        for (int i = 0; i < 4; i++) {
            paws.add(new Paw(i));
        }
    }
}
