package paquete;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author Juan Pablo
 */
@DatabaseTable
public class Paciente {
    @DatabaseField
    private String tipo_documento; 
    @DatabaseField (id = true)
    private long documento;
    @DatabaseField
    private String nombre;
    @DatabaseField
    private String apellido;
    @DatabaseField
    private int peso_kg;
    @DatabaseField
    private String contextura;
    @DatabaseField
    private String ciudad;
    @DatabaseField
    private String respiratorio;
    @DatabaseField
    private String oculares;

    public Paciente(){
        
    }
    
    public Paciente(String tipo_documento, long documento, String nombre,
            String apellido, int peso_kg, String contextura, String ciudad,
            String respiratorio, String oculares){
        this.tipo_documento = tipo_documento;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso_kg = peso_kg;
        this.contextura = contextura;
        this.ciudad = ciudad;
        this.respiratorio = respiratorio;
        this.oculares = oculares;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    /**
     * @param tipo_documento the tipo_documento to set
     */
    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    /**
     * @return the documento
     */
    public long getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(long documento) {
        this.documento = documento;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the peso_kg
     */
    public int getPeso_kg() {
        return peso_kg;
    }

    /**
     * @param peso_kg the peso_kg to set
     */
    public void setPeso_kg(int peso_kg) {
        this.peso_kg = peso_kg;
    }

    /**
     * @return the delgado_grueso
     */
    public String getContextura() {
        return contextura;
    }

    /**
     * @param delgado_grueso the delgado_grueso to set
     */
    public void setContextura(String contextura) {
        this.contextura = contextura;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the respiratorio
     */
    public String getRespiratorio() {
        return respiratorio;
    }

    /**
     * @param respiratorio the respiratorio to set
     */
    public void setRespiratorio(String respiratorio) {
        this.respiratorio = respiratorio;
    }

    /**
     * @return the oculares
     */
    public String getOculares() {
        return oculares;
    }

    /**
     * @param oculares the oculares to set
     */
    public void setOculares(String oculares) {
        this.oculares = oculares;
    }

}
