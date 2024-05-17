public abstract class Contract {

protected String contractDate;
protected String name;
protected String email;
protected int vehiclesold;
protected double totalprice;
protected int monthlypayment;

    public Contract(String contractDate, String name, String email, int vehiclesold) {
        this.contractDate = contractDate;
        this.name = name;
        this.email = email;
        this.vehiclesold = vehiclesold;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getVehiclesold() {
        return vehiclesold;
    }

    public void setVehiclesold(int vehiclesold) {
        this.vehiclesold = vehiclesold;
    }
}
  public int getTotalPrice() {
    return Price;

  }

  public int getMonthlyPayment() {
    return Payment;
  }