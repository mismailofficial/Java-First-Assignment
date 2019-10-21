class Abc {
    private int id;
    private String name;
    Abc(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString();
    }
}

public class ToString {
    public static void main(String[] args) {
        Abc abc = new Abc(7, "Ali");
        System.out.println(abc.toString());
    }
}