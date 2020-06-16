
package Obj;

public class DiscoMusical {
    
    private String titulo;
    private String autor;
    private int añoEdicion;
    private String formato;
    private boolean digital;
    private String aux;
    
    public DiscoMusical(){
        
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoEdicion() {
        return añoEdicion;
    }

    public void setAñoEdicion(int añoEdicion) {
        this.añoEdicion = añoEdicion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getDigital() {
        
        return aux;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
        if(digital==true){
            aux="Si";
        }else{
            aux="No";
        }
        
    }
    
    @Override
    public String toString(){
        String mensaje = "Titulo: " + titulo +"\n"+ "Autor: " + autor + "\n"+ "Año edición: "+
                añoEdicion + "\n"+ "Formato : " + formato + "\n"+ "Digital: " + aux;
        return mensaje;
    }
    
    
    
}
