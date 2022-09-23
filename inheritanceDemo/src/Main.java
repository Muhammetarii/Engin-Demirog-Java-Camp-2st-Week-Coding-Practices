public class Main {
    public static void main(String[] args) {
        // Yazılan programın değişime direnmeyen program olması en önemli olgudur.
        LoanUI loanUI = new LoanUI();
        loanUI.LoanCalculate(new SoldierLoanManager());
    }
}