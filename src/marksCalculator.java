import java.util.*;
public class marksCalculator {
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);


    System.out.println("Press 1 and hit enter for TODAY'S GOALS :\n Press 2 and hit enter for OTHERS :");
int  x = sc.nextInt();

switch(x)
    {
        case 1:
            System.out.println("Press 1 and hit enter for STUDY SCHEDULE :\n Press 2 and hit enter for PHYSICAL EXERCISE:");
            int y  = sc.nextInt();
            switch(y)
            {
                case 1:
                    System.out.println("Enter The subjects :");


            }

            break;
        case 2:
    System.out.println("Press 1 and hit enter for MARKS CALCULATOR :\n Press 2 and hit enter for CALCULATOR:");
    int o  = sc.nextInt();

    switch(o) {
 case 1:

        System.out.println("Enter The no.of subjects (MAXIMUM 10):");
        int ns = sc.nextInt();
        double m, p, ch, b, eg, el, g, h, c, nd2, nd3, e, ca, pe, a;
        System.out.println("Enter the marks in Maths(TYPE 0 & Hit ENTER SKIP):");
        m = sc.nextDouble();
        System.out.println("Enter the marks in Physics(TYPE 0 & Hit ENTER SKIP):");
        p = sc.nextDouble();
        System.out.println("Enter the marks in chemistry(TYPE 0 & Hit ENTER SKIP):");
        ch = sc.nextDouble();
        System.out.println("Enter the marks in Biology(TYPE 0 & Hit ENTER SKIP):");
        b = sc.nextDouble();
        System.out.println("Enter the marks in English Language(TYPE 0 & Hit ENTER SKIP):");
        eg = sc.nextDouble();
        System.out.println("Enter the marks in English Literature(TYPE 0 & Hit ENTER SKIP):");
        el = sc.nextDouble();
        System.out.println("Enter the marks in Geography(TYPE 0 & Hit ENTER SKIP):");
        g = sc.nextDouble();
        System.out.println("Enter the marks in History& Civics(TYPE 0 & Hit ENTER SKIP):");
        h = sc.nextDouble();
        System.out.println("Enter the marks in Computer Science(TYPE 0 & Hit ENTER SKIP):");
        c = sc.nextDouble();
        System.out.println("Enter the marks in 2nd Language(TYPE 0 & Hit ENTER SKIP):");
        nd2 = sc.nextDouble();
        System.out.println("Enter the marks in Economics(TYPE 0 & Hit ENTER SKIP):");
        e = sc.nextDouble();
        System.out.println("Enter the marks in Commercial Applications(TYPE 0 & Hit ENTER SKIP):");
        ca = sc.nextDouble();
        System.out.println("Enter the marks in Physical Education(TYPE 0 & Hit ENTER SKIP):");
        pe = sc.nextDouble();
        System.out.println("Enter the marks in Art(TYPE 0 & Hit ENTER SKIP):");
        a = sc.nextDouble();
        System.out.println("Enter the marks in 3rd language(TYPE 0 & Hit ENTER SKIP):");
        nd3 = sc.nextDouble();
        System.out.println("Enter the Total marks per subject(TYPE 0 & Hit ENTER SKIP):");
        int t = sc.nextInt();
        System.out.println("Enter the marks obtained in project total(TYPE 0 & Hit ENTER SKIP):");
        double op = sc.nextDouble();
        System.out.println("Enter the Total marks of project(TYPE 0 & Hit ENTER SKIP):");
        double op2 = sc.nextDouble();
        System.out.println("Enter the obtained internal or any sort of disciplinary marks marks(TYPE 0 & Hit ENTER SKIP):");
        double oi = sc.nextDouble();
        System.out.println("Enter the Total internal or any sort of disciplinary marks marks(TYPE 0 & Hit ENTER SKIP):");
        double i = sc.nextDouble();

        double total_marks_obtained = m + p + ch + b + eg + el + g + h + c + nd2 + nd3 + e + ca + pe + a + op + oi;
        double total_marks = ns * t + op2 + i;

        double percentage = (total_marks_obtained / total_marks) * 100;

        System.out.println("The total percentage of your examinations is " + percentage + "%");
        if (percentage <= 40) {
            System.out.println("Try to improve you dumb kid");
        } else if (percentage > 40 && percentage < 70) {
            System.out.println("FINE but try to improve");
        } else if (percentage >= 70 && percentage < 80) {
            System.out.println("good!!");
        } else if (percentage >= 80 && percentage < 90) {
            System.out.println("very good!!");
        } else if (percentage >= 90 && percentage <= 100) {
            System.out.println("You really GOATED KID");
        }
    break;
    case 2:
        break;

        default:
            System.out.println("You have entered a wrong choose, TRY AGAIN");
    }
break;
        default:
            System.out.println("You have entered a wrong choose, TRY AGAIN");

    }
}
}


