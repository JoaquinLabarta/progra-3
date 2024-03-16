package Ej5;

public class Funciones {
    private int max = -1;
    private int min = 9999;
    private int cant = 0;
    private float prom = 0;
    private int dimf;

    public static Funciones asReturn(int[] v) { 
        Funciones f = new Funciones();

        f.setDimf(v.length);
        for (int i : v) {
            if (i > f.getMax()) {
                f.setMax(i);
            }

            if (i < f.getMin()) {
                f.setMin(i);
            }

            f.setCant();
            f.setProm(f.getProm() + i);
        }
        f.setProm(f.getProm() / f.getDimf());
        return f;
    }

    public void asParameter(Funciones f, int n){
        if (n > f.getMax()) {
            f.setMax(n);
        }
        if (n < f.getMin()) {
            f.setMin(n);
        }
        f.setCant();
        f.setProm(f.getProm() + n);
    }

    public void calcularPromedio() {
        setProm(getProm() / getDimf());
    }
    

    public void setDimf(int dimf) {
        this.dimf = dimf;
    }

    public int getDimf() {
        return dimf;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public float getProm() {
        return prom;
    }

    public void setProm(float prom) {
        this.prom = prom;
    }

    public int getCant() {
        return cant;
    }

    public void setCant() {
        cant++;
    }
}

