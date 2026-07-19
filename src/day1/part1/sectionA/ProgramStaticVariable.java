package day1.part1.sectionA;

public class ProgramStaticVariable {
    static String name = "I am Iron Man";
    String armourVersion;
    void dialogue(){
        System.out.println("Tony Stark said "+name+" with "+armourVersion);
    }
    static void pepperPotts(ProgramStaticVariable psv)
    {

        System.out.println("Hi Tony, what's up ? is that "+psv.armourVersion);
    }
    static
    {
        System.out.println("Play marvel theme");
    }

    public static void main(String[] args) {
        ProgramStaticVariable psv = new ProgramStaticVariable();
        ProgramStaticVariable psv2 = new ProgramStaticVariable();
        psv.armourVersion = "Mark I";
        psv.dialogue();
        psv2.armourVersion = "Mark 51";
        ProgramStaticVariable.name = "I am actually Gold and Titanium man :D ";
        psv2.dialogue();
        pepperPotts(psv);
        pepperPotts(psv2);
    }
}
