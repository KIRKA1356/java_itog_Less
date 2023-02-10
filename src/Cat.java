import java.util.HashSet;
import java.util.Objects;

public class Cat {
    private String name;
    private String owner;
    private int age;
    private String breed;
    private int id;
    private HashSet<String> vaccinated;

    public Cat(String name, String owner, int age, String breed, int id, HashSet<String> vaccinated) {
        this.name = name;
        this.owner = owner;
        this.age = age;
        this.breed = breed;
        this.id = id;
        this.vaccinated = vaccinated;
    }
    public Cat() {

    }
    public Boolean isVacc(String vacc){
        if (vaccinated.contains(vacc)) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", id=" + id +
                ", vaccinated=" + vaccinated +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && id == cat.id && Objects.equals(name, cat.name) && Objects.equals(owner, cat.owner) && Objects.equals(breed, cat.breed) && Objects.equals(vaccinated, cat.vaccinated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, owner, age, breed, id, vaccinated);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashSet<String> getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(HashSet<String> vaccinated) {
        this.vaccinated = vaccinated;
    }

}
