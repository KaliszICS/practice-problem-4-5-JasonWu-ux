public class PracticeProblem {
    public static void main(String args[]) {

    }
}

class Student {
    private String name;
    private int age;
    private String studentNumber;
    
    // Constructor
    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getStudentNumber() {
        return studentNumber;
    }
    
    // Override toString
    @Override
    public String toString() {
        return name + ", " + age + " - " + studentNumber;
    }
    
    // Override equals - compares studentNumber
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return studentNumber.equals(student.studentNumber);
    }
    
    @Override
    public int hashCode() {
        return studentNumber.hashCode();
    }
}

class Cow {
    private String name;
    private int age;
    private double weight;
    
    // Constructor
    public Cow(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getWeight() {
        return weight;
    }
    
    // Override toString
    @Override
    public String toString() {
        return name + ", " + age + " - " + weight;
    }
    
    // Override equals - compares name, age, and weight
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cow cow = (Cow) obj;
        return age == cow.age && 
               Double.compare(cow.weight, weight) == 0 && 
               name.equals(cow.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, age, weight);
    }
}
