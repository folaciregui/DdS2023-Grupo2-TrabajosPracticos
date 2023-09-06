package builder;

/** "Producto" */
public class Pizza {
    private String masa = "";
    private String salsa = "";
    private String relleno = "";

    public void setMasa(String masa) {
        this.masa = masa;
        System.out.println("La masa es " + masa);
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
        System.out.println("La salsa es " + salsa);
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
        System.out.println("El relleno es " + relleno);
    }
}
