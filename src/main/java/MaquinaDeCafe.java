public class MaquinaDeCafe {
    Cafetera cafetera;
    Vaso vasosPequeno;
    Vaso vasosMediano;
    Vaso vasosGrande;
    Azucarero azucarero;

    public void setCafetera(Cafetera cafetera) { this.cafetera = cafetera; }
    public void setVasosPequeno(Vaso v) { this.vasosPequeno = v; }
    public void setVasosMediano(Vaso v) { this.vasosMediano = v; }
    public void setVasosGrande(Vaso v) { this.vasosGrande = v; }
    public void setAzucarero(Azucarero azucarero) { this.azucarero = azucarero; }

    public Cafetera getCafetera() { return cafetera; }
    public Vaso getVasosPequeno() { return vasosPequeno; }
    public Vaso getVasosMediano() { return vasosMediano; }
    public Vaso getVasosGrande() { return vasosGrande; }
    public Azucarero getAzucarero() { return azucarero; }

    public Vaso getTipoDeVaso(String tipoDeVaso) {
        switch (tipoDeVaso.toLowerCase()) {
            case "pequeno": return vasosPequeno;
            case "mediano": return vasosMediano;
            case "grande":  return vasosGrande;
            default:        return null;
        }
    }

    public String getVasoDeCafe(Vaso vaso, int cantidadDeVasos, int cantidadDeAzucar) {
        if (vaso == null || !vaso.hasVasos(cantidadDeVasos)) {
            return "No hay Vasos";
        }
        int cafeNecesario = vaso.getContenido() * cantidadDeVasos;
        if (!cafetera.hasCafe(cafeNecesario)) {
            return "No hay Cafe";
        }
        if (!azucarero.hasAzucar(cantidadDeAzucar)) {
            return "No hay Azucar";
        }
        vaso.giveVasos(cantidadDeVasos);
        cafetera.giveCafe(cafeNecesario);
        azucarero.giveAzucar(cantidadDeAzucar);
        return "Felicitaciones";
    }
}
