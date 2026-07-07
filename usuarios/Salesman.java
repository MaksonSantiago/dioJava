package exercicios.usuarios;

public non-sealed class Salesman extends Employee {

    //Set sales quantity attribute
    private double saleQuantity;

    //Salesman's constructor
    public Salesman(String name, String email, String password, double saleQuantity, boolean administrator) {
        //Inherits attributes from the superclass
        super(name, email, password, administrator);
        //Set administrator as false permanently
        this.setAdministrator(false);
        //Declare sales quantity variable
        this.saleQuantity = saleQuantity;
    }

    //getter of sales quantity
    public double getSaleQuantity() {
        return saleQuantity;
    }

    //Method for adding new sales to total sales quantity
    public void makeSale(double sale) {
        saleQuantity += sale;
    }

    //Method for check sales quantity
    public void checkSale() {
        System.out.println( getName() + "'s sales: " + getSaleQuantity() + "\n");
    }

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
