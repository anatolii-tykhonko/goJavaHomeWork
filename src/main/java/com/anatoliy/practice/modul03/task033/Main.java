package com.anatoliy.practice.modul03.task033;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Course courseJava = new Course(new Date(),"Java");
        Course courseC = new Course(100, "C", "Oksana");
        Course courseRuby = new Course(100, "Ruby", "Olga");
        Course courseSoftSkills = new Course(new Date(2017, 5, 31), "Soft Skills");
        Course courseTeamWork = new Course(50, "TeamWork", "Pavel");

        Course [] arrayCourse = new Course[5];
        arrayCourse[0] = courseJava;
        arrayCourse[1] = courseC;
        arrayCourse[2] = courseRuby;
        arrayCourse[3] = courseSoftSkills;
        arrayCourse[4] = courseTeamWork;

        Student studentKotov = new Student("Igor", "Kotov", 2);
        Student studentGromov = new Student("Gromov", arrayCourse );

        CollegeStudent collegeStudentPopov = new CollegeStudent("Vlad", "Popov", 3);
        CollegeStudent collegeStudentDudko = new CollegeStudent("Dudko", arrayCourse);
        CollegeStudent collegeName = new CollegeStudent("TNU", 19, 685231);

        SpecialStudent specialStudentZubko = new SpecialStudent("Artem", "Zubko", 1);
        SpecialStudent specialStudentKopko = new SpecialStudent("Kopko", arrayCourse);
        SpecialStudent specialStudentKey = new SpecialStudent(45215587);
    }
}
