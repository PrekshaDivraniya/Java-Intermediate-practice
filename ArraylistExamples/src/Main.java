public class Main {
    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();
        list.add("Preksha");
        list.add("Java");
        list.add("TDD");
        list.add("Rocks");
        list.add("Kata");

        System.out.println(list);
        System.out.println(list.getItem(2));
        list.removeItem(3);
        System.out.println(list);
        System.out.println("SIze is : "+ list.getSize());
    }
}