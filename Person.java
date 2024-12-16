class Person{
    private final String name;
    private final int age;

    // Constructor
    public Person(String viewerName, int age) {
        this.name = viewerName;
        this.age = age;
    }

    public String getName() {
        return name; 
    }

    public int getAge() {
        return age;
    }
}