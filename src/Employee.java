public class Employee {
    private int baseSalary;
    private int extraHour;
    private int hourlyRate;

    public void setBaseSalary(int baseSalary){
        if (baseSalary<=0){
            throw new IllegalArgumentException("Salary tik nai");
        }
        this.baseSalary = baseSalary;
    }

    public void setExtraHour(int extraHour) {
        this.extraHour = extraHour;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int calculateSalary(){
        return baseSalary + (extraHour*hourlyRate);
    }

    public int getBaseSalary() {
        System.out.println("base salary: "+baseSalary);
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getExtraHour() {
        return extraHour;
    }
}
