package funcionario;

public class funcionario {

    private int cracha;
    private float salario;
    private String cargo;
    

    public funcionario(int c, float s, String car) {
        this.cracha = c;
        this.salario = s;
        this.cargo = car;
        
    }

    public void calculaAumento(float porcentagem) {
        float total=((porcentagem / 100) *this.getSalario())+this.getSalario();
        System.out.println("Salario aumentado baseado pela porcentagem: " + "R$"+total);
    }
    
    public void calculaAumento(int tempo) {
        float total = (tempo * 150) + this.getSalario();

        System.out.println("Salário aumentado 150 por ano é: ..........." + "R$" +total);
        
    }

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
