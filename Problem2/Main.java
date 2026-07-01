class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double calculateAverage() {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Alice", new int[]{80, 90, 85});
        System.out.println(s.calculateAverage());
    }
}