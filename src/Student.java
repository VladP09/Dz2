import java.sql.SQLOutput;

public class Student {

    public String fio;
    public String group;
    public String[] marks;

    public Student(String fio, String group, String[] marks) {
        this.fio = fio;
        this.group = group;
        this.marks = marks;

    }
    public void info(){
        int coun =1;
        System.out.println("Name: " + fio + ", group: "+ group);
        System.out.println("Marks: ");
        for(int i = 0; i< marks.length; i++ ){
            System.out.println(coun+". "+marks[i]);
            coun++;
        }
    }
    public double averageRating(){
        double average=0;
        int count = 0;
        for(int i = 0; i<marks.length; i++){
            average+= Integer.parseInt(marks[i]);
        }
        double averageRating = average / marks.length;
        return  averageRating;

    }


}
