package designPattern.adapterPatter;

public class School {
    public static void main(String[] args) {

        Pen p = new PenAdapter();

        Assignment assignment = new Assignment();
        assignment.setPen(p);
        assignment.writeAsignment("I am bit tired to write Assignment"  );
    }
}
