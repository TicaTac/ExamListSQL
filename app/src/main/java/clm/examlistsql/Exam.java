package clm.examlistsql;

/**
 * Created by jbt on 7/18/2016.
 */
public class Exam {
    String examName;
    int examGrade;
    String studentName;
    int ID;

    public Exam(String examName, int examGrade, String studentName) {
        this.examName = examName;
        this.examGrade = examGrade;
        this.studentName = studentName;
    }
}
