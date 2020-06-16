
package Obj;

public class disco {
    
    public static void main(String[] args) {
        
        DiscoMusical disco1 = new DiscoMusical();
        
        disco1.setAutor("Guns N Roses");
        disco1.setAñoEdicion(1987);
        disco1.setDigital(true);
        disco1.setFormato("Fisico");
        disco1.setTitulo("Appetite for Destruction");
        
        System.out.println(disco1.toString());
    }
}
