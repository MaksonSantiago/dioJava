package exercicios.usuarios;

public non-sealed class Receptionist extends Employee {

    //Set cash register attribute
    private double amountCashRegister;

    //Receptionist's constructor
    public Receptionist(String name, String email, String password, double amountCashRegister, boolean administrator) {
        //Inherits attributes from the superclass
        super(name, email, password, administrator);
        //Set administrator as false permanently
        this.setAdministrator(false);
        //Declare cash register variable
        this.amountCashRegister = amountCashRegister;
    }

    //Getter of cash register
    public double getAmountCashRegister() {
        return amountCashRegister;
    }

    //Method for receive payment to cash register
    public void receivePayment(double payment) {
        this.amountCashRegister += payment;
    }

    //Simulation method for close cash register
    public void closeCashRegister() {
        System.out.println("Total amount in cash register: " + getAmountCashRegister());
        System.out.println("Close cash register!\n");
    }

    @Override
    //Screen login simulation
    public void login() {
        System.out.println("Email: " + getEmail());
        System.out.println("Password: " + getPassword());
        System.out.println("Welcome, " + getClass().getSimpleName()+ " " + getName() +"\n");
    }

    @Override
    //Screen logoff simulation
    public void logoff() { System.out.println(getClass().getSimpleName() + " logged out.\n"); }

    @Override
    //Method for change user's mutable data
    public void changeData(String email) {
        setEmail(email);
    }

    @Override
    //Method for change user's password
    public void changePassword(String password) {
        setPassword(password);
    }
}
