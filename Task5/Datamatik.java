

public class Datamatik {
    public static Student[] students = new Student[10];


    public static void main(String[] args) {
	    students [0] = new Student("kris1",1,true,'b');
        students [1] = new Student("kris2",2,true,'b');
        students [2] = new Student("kris3",3,true,'b');
        students [3] = new Student("kris4",4,true,'b');
        students [4] = new Student("kris5",5,true,'b');
        students [5] = new Student("kris6",6,true,'b');
        students [6] = new Student("kris7",7,true,'b');
        students [7] = new Student("kris8",8,true,'b');
        students [8] = new Student("kris9",9,true,'b');
        students [9] = new Student("kris10",10,true,'b');

        printStudentName(students,5);
    }

    public static void printStudentName(Student[] students, int index ){
        if (index< students.length)
        System.out.println(students[index].name);
        else{
            System.out.println("Index error");
        }
    }

    public static int findStudent(Student[] students, String names){
        int index =0;
        for(int i =0; i < students.length; i++) {
            if (students[i].name==names)
        index = i;

        }

        return  index;
    }

}



