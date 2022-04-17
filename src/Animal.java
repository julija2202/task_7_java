import java.util.Comparator;

public class Animal implements Comparator<Animal> {
    private String animalName;
    private int age;
    public Animal(String animalName, int age) {
        this.animalName = animalName;
        this.age = age;
    }
    public String getAnimalName() {
        return animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAnimalName().compareTo(o2.getAnimalName());
    }
}
