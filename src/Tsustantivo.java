
public class Tsustantivo implements Isustantivo{
    public Tsustantivo(){}

    @Override
    public String[] Expandir(String lexema) {
        String Vec[];
        Vec = new String [4];
        Vec[0] = singular(Masculino(lexema));
        Vec[1] = singular (Femenino(lexema));
        Vec[2] = plural (Masculino(lexema));
        Vec[3] = plural (Femenino(lexema));
        return Vec;
    }

    @Override
    public String Masculino(String lexema) {
        return lexema + "o";
    }

    @Override
    public String Femenino(String lexema) {
        return lexema + "a";
    }

    @Override
    public String singular(String lexema) {
        return lexema;
    }

    @Override
    public String plural(String lexema) {
        return lexema + "s";
    }
}