package tarea_naves;

public class Nave {
    
    public enum TipoNave {FRAGATA,DESTRUCTOR,ACORAZADO};//No se especificaba los tipos o la cantidad
    public enum TipoUniverso {OSCURO,LUZ,REZAGADO};//No se especificaba los tipos o la cantidad
    public String id;
    public String nombre;
    public TipoNave tipoNave;
    public TipoUniverso tipoUniverso;

    public Nave(String id, String nombre, TipoNave tipoNave, TipoUniverso tipoUniverso) {
        this.id = id;
        this.nombre = nombre;
        this.tipoNave = tipoNave;
        this.tipoUniverso = tipoUniverso;
    }

    @Override
    public String toString() {
        return "ID: " + id + "      NOMBRE: " + nombre + "      TIPO NAVE: " + tipoNave + "     TIPO UNIVERSO: " + tipoUniverso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoNave getTipoNave() {
        return tipoNave;
    }

    public void setTipoNave(TipoNave tipoNave) {
        this.tipoNave = tipoNave;
    }

    public TipoUniverso getTipoUniverso() {
        return tipoUniverso;
    }

    public void setTipoUniverso(TipoUniverso tipoUniverso) {
        this.tipoUniverso = tipoUniverso;
    }

}
