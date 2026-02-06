public class objvehiculo {
    private String Marca;
    private String Tipo;
    private int cilindraje;
    private Double PagoAnt;
    private Double PagoAct;
    private int NCelda;
    
    
    
    public objvehiculo(String marca, String tipo, int cilindraje, Double pagoAnt, Double pagoAct, int nCelda) {
        Marca = marca;
        Tipo = tipo;
        this.cilindraje = cilindraje;
        PagoAnt = pagoAnt;
        PagoAct = pagoAct;
        NCelda = nCelda;
    }

    
    public objvehiculo() {
    }


    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    public Double getPagoAnt() {
        return PagoAnt;
    }
    public void setPagoAnt(Double pagoAnt) {
        PagoAnt = pagoAnt;
    }
    public Double getPagoAct() {
        return PagoAct;
    }
    public void setPagoAct(Double pagoAct) {
        PagoAct = pagoAct;
    }
    public int getNCelda() {
        return NCelda;
    }
    public void setNCelda(int nCelda) {
        NCelda = nCelda;
    }
    
}
