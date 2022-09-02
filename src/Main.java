import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        ABB arbol = new ABB();
        Scanner lector = new Scanner(System.in);
        arbol.insert(new Node(new Citizen(1,"primeron","20/02/2","Buga")));
        arbol.insert(new Node(new Citizen(4,"segundon","21/2/2019","Buga")));
        arbol.insert(new Node(new Citizen(5,"ratonazo","242/42/2","Buga")));

        boolean stopflag = true;
        while (stopflag == true){
            System.out.println("**********************");
            System.out.println("Registro DANE");
            System.out.println("**********************");

            System.out.println("1. Inscribir a un ciudadano\n2. Consultar por cedula\n3. Eliminar ciudadano por cedula\n4. Salir");
            int menu = lector.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Digite la cedula de la persona");
                    int cedula = lector.nextInt();
                    lector.nextLine();
                    System.out.println("Digite el nombre de la persona");
                    String name = lector.nextLine();
                    System.out.println("Digite la fecha de nacimiento de la persona(d/mm/aaaa");
                    String date = lector.next();
                    System.out.println("Digite la ciudad de la persona");
                    String city = lector.next();
                    arbol.insert(new Node(new Citizen(cedula,name,date,city)));
                    break;

                case 2:
                    System.out.println("Digite la cedula a consultar");
                    cedula = lector.nextInt();
                    System.out.println(arbol.search(cedula));
                    break;
                case 3:
                    System.out.println("Digite la cedula de la persona a eliminar");
                    cedula = lector.nextInt();
                    arbol.delete(cedula);
                    break;
                case 4:
                    stopflag = false;
                    break;
            }
        }




    }
}
