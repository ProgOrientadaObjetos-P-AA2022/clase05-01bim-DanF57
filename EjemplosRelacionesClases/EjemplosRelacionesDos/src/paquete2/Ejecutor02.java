
package paquete2;

/**
 *
 * @author Daniel
 */
public class Ejecutor02 {
    public static void main(String[] args) {
        //1. Crear una persona de Barrio el Valle de la ciudad de Loja
        //2. Crear una persona del Barrio Central de la ciudad de Cuena
        //3. Crear una persona del Barrio Centenario de la ciudad de Guayaquil
        
        Ciudad ciudad1 = new Ciudad("Loja");
        Ciudad ciudad2 = new Ciudad("Cuenca");
        Ciudad ciudad3 = new Ciudad("Guayaquil");
        
        Barrio barrio1 = new Barrio("El valle", ciudad1);
        Barrio barrio2 = new Barrio("Central", ciudad2);
        Barrio barrio3 = new Barrio("Centenario", ciudad2);
        
        Persona persona1 = new Persona("René Elizalde", "1100909909", barrio1);
        Persona persona2 = new Persona("Jorge Cango", "11007079070", barrio2);
        Persona persona3 = new Persona("Pablo Costa", "11009096666", barrio3);
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s(%s) es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona1.obtenerNombre(),
                persona1.obtenerCedula(),
                persona1.obtenerBarrio().obtenerNombre(),
                persona1.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        System.out.printf("El barrio de la persona %s(%s) es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona2.obtenerNombre(),
                persona2.obtenerCedula(),
                persona2.obtenerBarrio().obtenerNombre(),
                persona2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        System.out.printf("El barrio de la persona %s(%s) es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona3.obtenerNombre(),
                persona3.obtenerCedula(),
                persona3.obtenerBarrio().obtenerNombre(),
                persona3.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
    }
}
