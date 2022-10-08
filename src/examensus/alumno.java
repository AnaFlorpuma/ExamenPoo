/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensus;

public class alumno extends Persona{
    String codigo;
    String curso;
    String promedio;
//geter y
    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
//constructor
    public alumno(String codigo,String nombre, String curso, String promedio) {
        super(nombre);
        this.codigo = codigo;
        this.curso = curso;
        this.promedio=promedio;
    }
    
    
}
