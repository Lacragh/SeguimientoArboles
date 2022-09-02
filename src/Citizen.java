public class Citizen {

    private int cedula;
    private String name;
    private String nacimiento;

    public Citizen(int cedula, String name, String nacimiento, String cityNaci) {
        this.cedula = cedula;
        this.name = name;
        this.nacimiento = nacimiento;
        this.cityNaci = cityNaci;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCityNaci() {
        return cityNaci;
    }

    public void setCityNaci(String cityNaci) {
        this.cityNaci = cityNaci;
    }

    private String cityNaci;

    public String info(){
        String info = "\n"+this.name;
        info += "\n"+this.nacimiento;
        info += "\n"+this.cedula;
        info += "\n"+this.cityNaci;
        return info;
    }





}