import ru.courses.birds.SingAble;
import ru.courses.geometry.AreaAble;
import ru.courses.geometry.Figure;
import ru.courses.geometry.LengthAble;
import ru.courses.student.RuleChet;
import ru.courses.student.Student;

public class Main {
    public static void main(String[] args) {
    Student st1 = new Student("Petya",new RuleChet());
    Student st2 = new Student("Borya", x->x>=1&&x<=100000);
    Student st3 = new Student("Kolya",x->x%2==0&&x>=1&&x<=100000);
    st1.addGrade(4);
        System.out.println(st1);
        st3.addGrade(50000);
        System.out.println(st3);
    }

    public static double sumAllAreas(Figure...figures){
        double sum = 0;
        for(Figure f:figures){
            sum += f.getArea();
        }
        return sum;
    }
    public static double anotherSumAllAreas(Figure...figures){
        double sum = 0;
        for(Figure f:figures){
            sum += mainGetArea(f);
        }
        return sum;
    }


    public static double mainGetArea(AreaAble object) {
        return object.getArea();
    }

    public static double sum(Number... nums) {
        double res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i].doubleValue();
        }
        return res;
    }

    public static double mainGetLength(LengthAble object) {
        double res = 0;
        res = object.getLength();
        return res;
    }

    public static void letsSing(SingAble object) {
        object.sing();
    }

}