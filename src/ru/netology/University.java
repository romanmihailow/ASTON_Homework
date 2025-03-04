package ru.netology;

import java.util.HashSet;
import java.util.Set;

class University {

    // Метод для удаления студентов с низким средним баллом
    public static void removeStudents(Set<Student> students) {
        students.removeIf(student -> student.getAvgScore() < 3);  // Удаляем студентов с низким средним баллом
    }

    // Метод для перевода студентов на следующий курс
    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            student.promoteToNextCourse();  // Переводим всех студентов на следующий курс
        }
    }

    // Метод для печати студентов, обучающихся на заданном курсе
    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {  // Проверяем курс студента
                System.out.println(student.getName());
            }
        }
    }


    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        // Создание объектов студентов
        students.add(new Student("Иван", 101, 1, new double[]{3.5, 4.0, 3.0, 5.0}));
        students.add(new Student("Анна", 102, 1, new double[]{2.5, 3.0, 2.0, 3.5}));
        students.add(new Student("Петр", 103, 2, new double[]{4.0, 5.0, 4.5, 4.0}));
        students.add(new Student("Елена", 104, 2, new double[]{2.0, 2.5, 3.0, 2.0}));

        // Печать студентов на 1 курсе до удаления
        System.out.println("Студенты первого курса:");
        printStudents(students, 1);

        // Удаление студентов с средним баллом < 3
        removeStudents(students);

        // Печать студентов на 1 курсе после удаления
        System.out.println("\nСтуденты первого курса после отчисления:");
        printStudents(students, 1);

        // Перевод студентов на следующий курс
        promoteStudents(students);

        // Печать студентов на 2 курсе после перевода
        System.out.println("\nСтуденты которые перешли на второй курс:");
        printStudents(students, 2);
    }

}