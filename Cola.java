import java.util.Scanner;

public class Cola{
  public static void main(String args[]){
   
   Scanner in = new Scanner(System.in);
   String nombre = "";
   int clave = 0, antiguedad = 0;
   
   System.out.println("");
   System.out.println("");
   System.out.println("*****************************************************");
   System.out.println("Bienvenido al sistema vacacional de Coca-Cola Company");
   System.out.println("*****************************************************");
   System.out.println("");
   System.out.println("");

   System.out.println("¿Cuál es tu nombre?");
   nombre = in.nextLine();

   System.out.println("¿Cuántos años de servicio tiene en la empresa?");
   antiguedad = in.nextInt();
  
   System.out.println("¿Cuál es la clave de su departamento?");
   clave = in.nextInt();

   if(clave == 1){
  

    if(antiguedad == 1){
     System.out.println(nombre + " tiene derecho a 6 dias de vacaciones");
   } else if(antiguedad >= 2 && antiguedad <= 6){
     System.out.println(nombre + " tiene derecho a 14 dias de vacaciones");
   } else if(antiguedad == 7){
     System.out.println(nombre + " tiene derecho a 20 dias de vacaciones");
   } else {
     System.out.println(nombre + " aún no tiene derecho a vacaciones");
   }

  } else if(antiguedad == 2){
    
    if(antiguedad == 1){
     System.out.println(nombre + " tiene derecho a 7 dias de vacaciones");
   } else if(antiguedad >= 2 && antiguedad <= 6){
     System.out.println(nombre + " tiene derecho a 15 dias de vacaciones");
   } else if(antiguedad == 7){
     System.out.println(nombre + " tiene derecho a 20 dias de vacaciones");
   } else {
     System.out.println(nombre + " aún no tiene derecho a vacaciones");
   }
   
   } else if(clave == 3){

     if(antiguedad == 1){
       System.out.println("El trabajador " + nombre + " tiene derecho a 10 días de vacaciones");
     } else if(antiguedad >= 2 && antiguedad <= 6){
       System.out.println("El trabajador " + nombre + " tiene derecho a 20 días de vacaciones");
     } else if(antiguedad >= 7){
       System.out.println("El trabajador " + nombre + " tiene derecho a 30 días de vacaciones");
     } else {
       System.out.println("El trabajador aun no tiene derecho a vacaciones");
     }
    
   } else { 
    System.out.println("Error!, la clave de departamento es incorrecta");
   }
 }
}
