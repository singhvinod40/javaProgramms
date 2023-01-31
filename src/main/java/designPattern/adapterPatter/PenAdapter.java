package designPattern.adapterPatter;

public class PenAdapter implements Pen{

    PilotPen pp = new PilotPen();
    @Override
    public void write(String s  ) {
        pp.mark(s);
    }

    
}
