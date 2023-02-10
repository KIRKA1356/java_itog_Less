import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.setName("Tom");
        tom.setAge(5);
        tom.setOwner("Kristian Bale");
        tom.setBreed("Chihir");
        tom.setId(012);
        tom.setVaccinated(new HashSet<String>(Arrays.asList("qwe", "tur")));
        System.out.printf("Name: %s \nAge: %d\nVacc: %s\n", tom.getName(), tom.getAge(), tom.getVaccinated());
        System.out.println(tom.isVacc("sputnik5"));

        Cat barsik = new Cat();
        barsik.setName("Barsik");
        barsik.setAge(2);
        barsik.setId(022);
        barsik.setBreed("Tunic");
        barsik.setVaccinated(new HashSet<String>(Arrays.asList("sputnik69","adres")));

        Cat marta = new Cat("Marta", "Rich Jhons", 3, "Chernya", 34,
                    new HashSet<String>(Arrays.asList("sad","adadf")));

        System.out.println(barsik.toString());
        System.out.println(tom);
        System.out.println(marta);

    }
}