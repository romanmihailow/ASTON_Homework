public class Main {
    public static void main(String[] args) {
        //Lessons5_1
        Employee employee = new Employee(1, "Roman", "Mihailow", "QA", "rmw@gmail.com",
                "89061086598", 39, 600000);
        employee.printInfoEmployee();


        //Lessons5_2
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 45000,45);
        persArray[1] = new Person("Petrov Petr", "Developer", "Developer@mailbox.com", "892312313", 50000,23);
        persArray[2] = new Person("Sidorov Sidr", "HR", "HR@mailbox.com", "892312314", 42000,34);
        persArray[3] = new Person("Andreev Andrey", "Manager", "Manager@mailbox.com", "892312315", 35000,37);
        persArray[4] = new Person("Kostin Konstantin", "Designer", "Designer@mailbox.com", "892312316", 40000,90);

        for (int i = 0; i < persArray.length; i++) {
            System.out.println("Person " + (i+1) + ":");
            System.out.println("Name : " + persArray[i].getName());
            System.out.println("jobTitle : " + persArray[i].getJobTitle());
            System.out.println("Email : " + persArray[i].getEmail());
            System.out.println("Telephone : " + persArray[i].getTelephone());
            System.out.println("Salary : " + persArray[i].getSalary());
            System.out.println("Age : " + persArray[i].getAge());
            System.out.println();

        }

        //Lessons5_3
















    }






}