public class Main {
    public static void separation() {
        System.out.println("====================================================================================");
    }
    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        separation();
        employees[0] = new Employee("Иванов Иван Иванович", 100,1);
        employees[1] = new Employee("Иванов Петр Иванович", 200,2);
        employees[2] = new Employee("Иванов Артем Иванович", 300,3);
        employees[3] = new Employee("Иванов Марат Иванович", 400,4);
        employees[4] = new Employee("Иванов Даниил Иванович", 500,5);
        employees[5] = new Employee("Иванов Артур Иванович", 600,1);
        employees[6] = new Employee("Иванов Артем Иванович", 700,2);
        employees[7] = new Employee("Иванов Роман Иванович", 800,3);
        employees[8] = new Employee("Иванов Семен Иванович", 900,4);
        employees[9] = new Employee("Иванов Глеб Иванович", 10000,5);
        System.out.println("Сумма всех зарплат " + calculeteSumSalary());
        separation();
        Employee employeeMaxSalary = getEmployeeMaxSalary();
        if (employeeMaxSalary == null) {
            System.out.println("Нет сотрудника с максимальной зарплатой");
        } else {
            System.out.println("Максимальная зарплата сотрудника " + employeeMaxSalary);
        }
        separation();
        Employee employeeMinSalary = getEmaloyeeMinSalary();
        if (employeeMinSalary == null) {
            System.out.println("нет сотрудника с минимальной зарплатой");
        } else {
            System.out.println("Минимальная зарплата сотрудника " + employeeMinSalary);
        }
        separation();
        System.out.println("Среднее значение зарплат " + averageSalary());
        separation();
        printAllNames();
        separation();


    }

    public static int calculeteSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }

        }
        return sum;
    }

    public static Employee getEmployeeMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    public static Employee getEmaloyeeMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }
    public static void printAllNames() {
        for (Employee employee : employees) {

            System.out.println(employee.getFullname());

        }
    }
    public static int averageSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return (sum/employees.length);
    }

}