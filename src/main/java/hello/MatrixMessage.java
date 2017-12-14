package hello;

public class MatrixMessage {

    private String formula;
    private double betta;
    private double gamma;
    private int order;

    public MatrixMessage() {
    }

    public MatrixMessage(String formula, double betta, double gamma, int order) {
        this.formula = formula;
        this.betta = betta;
        this.gamma = gamma;
        this.order = order;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public double getBetta() {
        return betta;
    }

    public void setBetta(double betta) {
        this.betta = betta;
    }

    public double getGamma() {
        return gamma;
    }

    public void setGamma(double gamma) {
        this.gamma = gamma;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
