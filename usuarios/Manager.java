package exercicios.usuarios;

public non-sealed class Manager extends Employee {
    //Manager's constructor
    public Manager(String name, String email, String password, boolean administrator) {
        //Inherits attributes from the superclass
        super(name, email, password, administrator);
        //Set administrator as true permanently
        this.setAdministrator(true);
    }

    //Method for manager finance
    public void generateFinanceReport() {
        System.out.println("Monthly Sold: R$25,000");
        System.out.println("Monthly expenses: R$5,000\n");
    }

    //Method for check value sales
    public void checkSales() {
        System.out.println("Monthly Sold: R$25,000\n");
    }

    //Inherits methods for the superclass
    @Override
    //Screen login simulation
    public void login() {
        System.out.println("Email: " + getEmail());
        System.out.println("Password: " + getPassword());
        System.out.println("Welcome, " + getClass().getSimpleName()+ " " + getName() + "\n");
    }

    @Override
    //Screen logoff simulation
    public void logoff() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " logged out.\n");
    }

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
