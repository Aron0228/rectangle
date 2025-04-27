public class Rectangle {
    // --- Privát adattagok (oldalak hosszai) ---
    private int sideA;
    private int sideB;
    private int sideC;

    // --- Konstruktorok ---
    public Rectangle() {
        sideA = 1;
        sideB = 1;
        sideC = 1;
    }
    public Rectangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // --- Getterek ---

    public int getSideA() {
        return sideA;
    }
    public int getSideB() {
        return sideB;
    }
    public int getSideC() {
        return sideC;
    }

    // --- Setterek ---
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    // --- Téglatest felülete ---
    public int surfaceArea() {
        return 2 * (sideA * sideB + sideB * sideC + sideC * sideA);
    }
    // --- Téglatest térfogata ---
    public int volume() {
        return sideA * sideB * sideC;
    }

}
