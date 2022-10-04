package lab;

import java.util.Arrays;

public class ClassroomMain {
    public static void main(String[] args) {
        // : Given
        int maxNumberOfStudents = 2;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Double[] examScoress = { 108.0, 157.0, 257.0, 0.0 };
        Double[] examScoresss = { 198.0, 199.0, 257.0, 0.0 };

        Student student = new Student("Leon", "Hunter", examScores);

        Student student1 = new Student("John", "Bob", examScoress);

        Student student2 = new Student("Shawn", "B", examScoresss);

        classroom.addStudent(student);
        classroom.addStudent(student1);

        classroom.getAverageExamScore();
        System.out.println(classroom);
        classroom.removeStudent("Leon", "Hunter");
        System.out.println(classroom);
        System.out.println(Arrays.toString(classroom.getStudentbyScore()));
        System.out.println(classroom.getGradeBook());

    }
}
