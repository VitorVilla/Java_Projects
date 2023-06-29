import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0, 500);

        // UPCASTING

        Account acc1 = bacc; // Como uma conta empresarial (bacc) é uma conta normal (acc1) podemos fazer a atribuição 
        Account acc2 = new BusinessAccount(10033, "Bob", 0, 200); // O mesmo vale para essa linha
        Account acc3 =  new SavingsAccount(1004, "Ana", 0, 0.01); // O mesmo para essa

        // DOWNCASTING

        BusinessAccount acc4 = acc2; // Não podemos fazer isso pois o compilador identifica a variavel como ACCOUNT então temos que fazer um casting
        BusinessAccount acc5 = (BusinessAccount) acc2; // Desse modo, mas temos que ter cuidado para não usar o casting errado como abaixo
        BusinessAccount acc6 = (BusinessAccount) acc3; // acc3 é do tipo Savings Account então na hora de converter vai dar erro

        //verificando o tipo de varivel para evitar esse erro
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc7 = (BusinessAccount) acc3;
            acc7.loan(200);
            System.out.println("Loan!");
        } // FALHA POIS ACC3 É DO TIPO SavingsAccount

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc7 = (SavingsAccount) acc3;
            acc7.updateBalance();
            System.out.println("Update!");
        } // SUCESSO 

    }
}
