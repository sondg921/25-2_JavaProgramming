package Homework;

import java.util.Scanner;

class Student{
    int id; // 학번
    String name; //이름
    String major; //전공
    Long phone; //전화번호

    void setId(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    void setMajor(String major){
        this.major = major;
    }
    void setPhone(Long phone){
        this.phone = phone;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getMajor(){
        return major;
    }
    String getPhone(){
        String s = Long.toString(phone);
        return "010-"+s.substring(2,6)+"-"+s.substring(6);
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] studentArray = new Student[3];

        for (int i = 0; i < 3; i++) {
            studentArray[i] = new Student();
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            studentArray[i].setId(sc.nextInt());
            studentArray[i].setName(sc.next());
            studentArray[i].setMajor(sc.next());
            studentArray[i].setPhone(sc.nextLong());
        }
        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");

        System.out.printf("첫번째 학생: %d %s %s %s", studentArray[0].getId(), studentArray[0].getName(), studentArray[0].getMajor(), studentArray[0].getPhone());
        System.out.println();

        System.out.printf("두번째 학생: %d %s %s %s", studentArray[1].getId(), studentArray[1].getName(), studentArray[1].getMajor(), studentArray[1].getPhone());
        System.out.println();

        System.out.printf("세번째 학생: %d %s %s %s", studentArray[2].getId(), studentArray[2].getName(), studentArray[2].getMajor(), studentArray[2].getPhone());
    }
}
