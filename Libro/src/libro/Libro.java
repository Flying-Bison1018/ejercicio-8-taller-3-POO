
package libro;


public class Libro {
    private String titulo,isbn,paginas,edicion,editorial;
    private String primerNombre,segundoNombre,primerApellido;
    private String ciudad,pais,fechaEdicion;
    
    public Libro(){
        this.titulo = "";
        this.isbn = "";
        this.paginas = "";
        this.edicion = "";
        this.editorial = "";
        this.primerNombre = "";
        this.primerApellido = "";
        this.segundoNombre = "";
        this.ciudad = "";
        this.pais = "";
        this.fechaEdicion = "";
    }
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public String getPaginas(){
        return paginas;
    }
    public void setPaginas(String paginas){
        this.paginas = paginas;
    }
    public String getEdicion(){
        return edicion;
    }
    public void setEdicion(String edicion){
        this.edicion = edicion;
    }
    public String getEditorial(){
        return editorial;
    }
    public void setEditorial(String edicion){
        this.edicion = edicion;
    }
    public String getPrimerNombre(){
        return primerNombre;
    }
    public void setPrimerNombre(String primerNombre){
        this.primerNombre = primerNombre;
    }
    public String getSegundoNombre(){
        return segundoNombre;
    }
    public void setSegundoNombre(String segundoNombre){
        this.segundoNombre = segundoNombre;
    }
    public String getPrimerApellido(){
        return primerApellido;
    }
    public void setPrimerApellido(String primerApellido){
        this.primerApellido = primerApellido;
    }
    public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    public String getPais(){
        return pais;
    }
    public void setPais(String pais){
        this.pais = pais;
    }
    public String getFechaEdicion(){
        return fechaEdicion;
    }
    public void setFechaEdicion(String fechaEdicion){
        this.fechaEdicion = fechaEdicion;
    }
}
