package exercicios.usuarios;

public sealed abstract class Employee permits Manager, Salesman, Receptionist {
    // Universal objects attributes
    private String name;
    private String email;
    private String password;
    private boolean administrator;

    //Employee object
    public Employee(String name, String email, String password, boolean administrator) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.administrator = administrator;
    }

    //Getters and Setters of Employee's attributes
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdministrator(boolean administrator) {
        this.administrator = administrator;
    }

    //Universal methods for subclasses
    public abstract void login();
    public abstract void logoff();
    public abstract void changeData(String email);
    public abstract void changePassword(String password);
}
