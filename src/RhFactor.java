public enum RhFactor {
    POS("+"), NEG("-");
    private String symbol;
    RhFactor(String symbol) {
        this.symbol = symbol;
    }
    public String getSymbol() {
        return symbol;
    }
}