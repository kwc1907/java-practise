package fivefuxi;

public class baozi {
    private String pi;
    private String xian;
    public baozi(){}

    public baozi(String pi, String xian) {
        this.pi = pi;
        this.xian = xian;
    }

    @Override
    public String toString() {
        return "baozi{" +
                "pi='" + pi + '\'' +
                ", xian='" + xian + '\'' +
                '}';
    }
}
