class Course {
    private Faculty teacher;
    private String coursename;
    private String courseNo;
    private Student[] StudentList;
    private int studentcnt=0;
    public Course(String name){
        this.coursename=name;
        StudentList=new Student[60];
        studentcnt=0;
    }
    public String getCourseName(){
        return coursename;
    }
    public void setTeacher(Faculty teacher) {
        this.teacher = teacher;
    }
    public void addStudent(Student student){
        StudentList[studentcnt++]=student;
    }
    public String getTeacher(){
        return teacher.getName();
    }
    public void getStudent(){
        for(int i=0;i<studentcnt;i++){
            System.out.println(StudentList[i].getName());
        }
    }
}
class Faculty{
    private String tNo;
    private String name;
    private Course[] courselist;
    private int coursecnt=0;
    public Faculty(String name){
        this.name=name;
        courselist=new Course[3];
        coursecnt=0;
    }
    public String getName() {
        return name;
    }
    public void addCourse(Course course){
        courselist[coursecnt++]=course;
    }
    public void getCourse(){
        for(int i=0;i<coursecnt;i++){
            System.out.println(courselist[i].getCourseName());
        }
    }
}
class Student{
    private String name;
    private String stuNo;
    public Student(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class testClass{
    public static void main(String[] args) {
        Student s1 = new Student("Tom");
        Student s2 = new Student("Jack");
        Course c1 = new Course("java");
        Course c2 = new Course("c");
        Faculty f1 = new Faculty("hyy");
        f1.addCourse(c1);
        f1.addCourse(c2);
        c1.setTeacher(f1);
        c2.setTeacher(f1);
        c1.addStudent(s1);
        c1.addStudent(s2);
        c2.addStudent(s1);
        c2.addStudent(s2);
        c1.getStudent();
        c2.getStudent();
        f1.getCourse();
        System.out.println(c1.getTeacher());
        System.out.println(c2.getTeacher());
    }
}