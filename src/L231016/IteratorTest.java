package L231016;

import java.util.Iterator;
import java.util.LinkedList;

class Student {
    int stuNum;
    String name;
    
    public Student(int stuNum, String name) {
        this.stuNum = stuNum;
        this.name = name;
    }
}

public class IteratorTest {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<>();
        
        list.add(new Student(2300001, "A"));
        list.add(new Student(2300002, "B"));
        list.add(new Student(2300003, "C"));
        list.add(new Student(2300004, "D"));
        
        int toFind = 2001255;
        Student temp;
        
        Iterator<Student> e = list.iterator();
        
        while(e.hasNext()) {
            temp = e.next();
            if(temp.stuNum==toFind) {
                System.out.printf("찾았다! 학번: %d\t이름: %s%n", temp.stuNum, temp.name);
                break;
            }
        }
    }
}