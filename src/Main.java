import java.util.*;

public class Main extends Animal{
    public Main(String animalName, int age) {
        super(animalName, age);
    }
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add(0, "cat");
        list.add(1, "dog");
        List<String> list1 = new ArrayList<>();
        list1.add(0, "pig");
        list1.add(1, "fish");
        list.addAll(list1);
        list.get(3);
        list.indexOf("cat");
        list.lastIndexOf("cj");
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list.containsAll(list1));
        System.out.println(list.get(3));
        System.out.println(list.indexOf("fish"));
        System.out.println(list.lastIndexOf("cj"));
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        List<String> list2 = List.of("snake", "bear");
        System.out.println(list2);
        list.remove(1);
        System.out.println(list);
        list.set(0,"cats");
        System.out.println(list);
        System.out.println(list.subList(0, 2));
        List<Animal> list3= new ArrayList<>();
        list3.add(new Animal("snake",2));
        list3.add(new Animal("bear",15));
        list3.add(new Animal("cow",8));
        list3.add(new Animal("rabbit",1));

        list3.sort(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getAnimalName().compareTo(o2.getAnimalName());
            }
        });
        System.out.println(list3);

    }
}
