//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Employee baseEmployee = new Employee();
    baseEmployee.setBaseSalary(50000);
    baseEmployee.setExtraHour(20);
    baseEmployee.setExtraHour(200);

    int salary = baseEmployee.calculateSalary();
    System.out.println(salary);

    Employee lecturer = new Employee();
    baseEmployee.setBaseSalary(50000);
    baseEmployee.setExtraHour(20);
    baseEmployee.setHourlyRate(200);

    int salaryLecturer = baseEmployee.calculateSalary();
    System.out.println(salaryLecturer);
    System.out.println(lecturer.getBaseSalary());
}
