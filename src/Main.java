import com.workintech.company.JuniorDeveloper;
import com.workintech.company.MidDeveloper;
import com.workintech.company.SeniorDeveloper;
import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        double area = circle.getArea();
        System.out.println("Alan: "+ area);
        System.out.println("Yaricap: " +circle);

        System.out.println("-----------------------");

        Cylinder cylinder = new Cylinder(1, 3);
        System.out.println("volume: " + cylinder.getVolume());
        System.out.println("area: " +cylinder.getArea());

        System.out.println("------------------------");

        Rectangle rectangle = new Rectangle(3 ,5);

        int rArea = rectangle.getArea();
        System.out.println("Rectangle Area: "+ rArea);

        System.out.println("--------------------------");

        JuniorDeveloper junior1 = new JuniorDeveloper(1,"Ahmet");
        JuniorDeveloper junior2 = new JuniorDeveloper(2, "Mehmet");

        MidDeveloper mid1 = new MidDeveloper(3, "Beren");

        MidDeveloper mid2 = new MidDeveloper(4, "Deniz");

        SeniorDeveloper senior1 = new SeniorDeveloper(5, "Kursad");

        senior1.work();

        System.out.println(senior1);

    }
}