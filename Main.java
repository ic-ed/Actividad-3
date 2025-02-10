import java.util.Scanner;

/*
Elaborar una aplicación de consola que permita almacenar información sobre un visitante a un edificio de departamentos utilizando todos
los tipos de datos primitivos en Java. Diseña un programa que declare y asigne valores a variables para representar diferentes aspectos
de la información del estudiante y luego imprima esos valores en pantalla.
 */

// Actual application must declare and assign values to variables to represent different aspects of the student information

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos años tienes: "); // no ultizo println para que el input salga en la misma linea
        byte age = sc.nextByte();

        System.out.print("Cuantos alunos hay en su escuela: ");
        long numStudents = sc.nextLong();

        System.out.print("Cual es el numero de su matricula: ");
        int enrollmentId = sc.nextInt();

        System.out.print("En que año naciste: ");
        short yearBorn = sc.nextShort();

        System.out.print("Cual es su altura: ");
        float height = sc.nextFloat();

        System.out.print("Cual es su nota final: ");
        double grade = sc.nextDouble();

        System.out.print("Ya terminaste la escuela? (true o false): ");
        boolean finishedSchool = sc.nextBoolean();

        System.out.print("Cual es la inicial de tu apellido: ");
        char lastName = sc.next().charAt(0);

        System.out.print("Cual es su primer nombre: ");
        String firstName = sc.next();

        System.out.println("Terminaste la escula: " + finishedSchool);
        System.out.println("Numero de matricula: " + enrollmentId);
        System.out.print("Nombre del alumno: " + firstName + " " + lastName);
        System.out.println("Edad: " + age);
        System.out.println("Altura: " + height);
        System.out.println("Nota final: " + grade);
        System.out.println("Total de estudiantes en la escuela: " + numStudents);
        System.out.println("Año que nació: " + yearBorn);
    }
}