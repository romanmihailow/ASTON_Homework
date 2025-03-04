public class Student {
    String name;    ///Имя класса
    int group;      ///Группа
    int course;     ///
    double[] avgScore;    ///

    public Student(String name, int group, int course, double[] avgScore) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.avgScore = avgScore;
    }

    public double getAvgScore() {
        double sum = 0;
        for(double avgScore:avgScore) {
            sum += avgScore;
        }
        return sum / avgScore.length;
    }

    public String getName() {
        return name;
    }
    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', group=" + group + ", course=" + course + ", averageScore=" + getAvgScore() + "}";
    }


    public void promoteToNextCourse() {
        if (getAvgScore() >= 3) {  // Переводим студента только если его средний балл >= 3
            course++;  // Переводим на следующий курс
        }
    }
}
