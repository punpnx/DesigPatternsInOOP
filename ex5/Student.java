public class Student {
    private String name;
    private String university;
    private int age;

    private Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.university = studentBuilder.university;
        this.age = studentBuilder.age;
    }

    public static class StudentBuilder {
        private final String name;
        private final String university;
        private int age = 0;

        public StudentBuilder(String name, String university) {
            this.name = name;
            this.university = university;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("University: ").append(university).append("\n");
        if (age != 0) {
            sb.append("Age: ").append(age).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Student student1 = new Student.StudentBuilder("Puntawan", "KMITL").age(21).build();
        System.out.println("Student 1:\n" + student1);

        Student student2 = new Student.StudentBuilder("Sarun", "KMITL").build();
        System.out.println("Student 2:\n" + student2);
    }
}
