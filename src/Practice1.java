import java.util.InputMismatchException;
import java.util.Scanner;

class FailException extends Exception {
    FailException(){
        super("Fail");
    }
}
interface Subjects {
    float total();
    float percentage();
    String grade() throws FailException;
    String remarks();
}

abstract class Result {
    // Object Counter
    static int count = 0;
    static { count++; }

    // Constructor
    public Result(int idNo, String sName, String fName) {
        this.idNo = this.idNo;
        this.sName = this.sName;
        this.fName = this.fName;
    }

    // Instance Variables
    protected int idNo;
    protected String sName, fName;

    // Getters and Setters
    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }
}
class Class5Result extends Result implements Subjects {
    // Subjects
    private int math, comp, sci, sst, islamiat, nq, mq;

    static Scanner input = new Scanner(System.in);

    Class5Result(int idNo, String sName, String fName){
        super(idNo, sName, fName);
        System.out.print("Math = ");
        math = input.nextInt();

        System.out.print("Computer = ");
        comp = input.nextInt();

        System.out.print("Science = ");
        sci = input.nextInt();

        System.out.print("Social Studies = ");
        sst = input.nextInt();

        System.out.print("Islamiat = ");
        islamiat = input.nextInt();

        System.out.print("Nazra Quran = ");
        nq = input.nextInt();

        System.out.print("Mutala Quran = ");
        mq = input.nextInt();
    }

    @Override
    public float total() {
        return math+comp+sci+sst+islamiat+nq+mq;
    }

    @Override
    public float percentage() {
        if (math < 40 || sci < 40 || comp < 40 || sst < 40 || islamiat < 40 || mq < 40 || nq < 40) return 0;
        else return total()*100/700;
    }

    @Override
    public String grade() throws FailException {
        if (math < 40 || sci < 40 || comp < 40 || sst < 40 || islamiat < 40 || mq < 40 || nq < 40) throw new FailException();
        else if (percentage() >= 80) return "A+";
        else if (percentage() < 80 && percentage() >= 70) return "A";
        else if (percentage() < 70 && percentage() >= 60) return "B";
        else if (percentage() < 60 && percentage() >= 50) return "C";
        else if (percentage() < 50 && percentage() >= 40) return "D";
        else throw new FailException();
    }

    @Override
    public String remarks() {
        String s;
        try{s = grade();} catch (FailException e){ s = e.getMessage();}
        switch (s) {
            case "A+": return "Fantastic";
            case "A": return "Excellent";
            case "B": return "Good";
            case "C": return "Fair";
            case "D": return "Not good";
            default: return "Need hard word";
        }
    }
}
public class Practice1 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int idNo = 0;
        String sName, fName;
        Boolean isTrue = false;

        System.out.println("Enter Student id no: ");
        while (isTrue == false){
            try{
                idNo = input.nextInt();
                isTrue = true;
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Incorrect ID. Please again enter id");}
        }
        input.nextLine();
        System.out.println("Enter Student Name: ");
        sName = input.nextLine();
        System.out.println("Enter Student's father name: ");
        fName = input.nextLine();
        Subjects s1 = new Class5Result(idNo, sName, fName);
        System.out.println("Total marks = " + s1.total());
        System.out.println("Percentage = " + s1.percentage());
        try{
            System.out.println("Grade = " + s1.grade());
        } catch (FailException e) {
            System.out.println("Grade = " + e.getMessage());
        }
        System.out.println("Remarks = " + s1.remarks());
    }
}
