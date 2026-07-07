package exercicios.usuarios;

public class Main {
    public static void main(String[] args) {
        //User's instances
        Manager manager = new Manager("João", "joao@gmail.com", "4578", false);
        Salesman salesman = new Salesman("Leticia", "let@gmail.com", "2424", 750.55, true);
        Receptionist receptionist = new Receptionist("Carlos", "carlos@gmail.com", "C475", 1350.25, true);

        //Manager's methods
        manager.login();
        manager.logoff();
        manager.changeData("j0a0@gmail.com");
        manager.changePassword("J123");
        manager.login();
        manager.checkSales();
        manager.generateFinanceReport();
        manager.logoff();

        //Salesman's methods
        salesman.login();
        salesman.logoff();
        salesman.changeData("leticia@outlook.com");
        salesman.changePassword("L457");
        salesman.login();
        salesman.checkSale();
        salesman.makeSale(47.50);
        salesman.checkSale();

        //Receptionist's methods
        receptionist.login();
        receptionist.logoff();
        receptionist.changeData("crl@gmail.com");
        receptionist.changePassword("2349");
        receptionist.login();
        receptionist.receivePayment(47.50);
        receptionist.closeCashRegister();
    }
}
