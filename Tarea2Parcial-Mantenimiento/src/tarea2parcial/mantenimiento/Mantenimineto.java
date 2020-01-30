/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2parcial.mantenimiento;

/**
 *
 * @author Alex
 */
public abstract class Mantenimineto {
protected String nombrecliente;
protected String  cedulacliente;
protected String nombremecanico;
protected String tipovehiculo;
protected String diagnostico;
protected String trabajos;
//protected String fecha;
protected String tipomantenimiento;
protected String respuesto1;
protected String respuesto2;
protected double valorrp1; 
protected double valorrp2;
protected String ad1;
protected String ad2;
protected String ad3;
protected String ad4;

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getCedulacliente() {
        return cedulacliente;
    }

    public void setCedulacliente(String cedulacliente) {
        this.cedulacliente = cedulacliente;
    }

    public String getNombremecanico() {
        return nombremecanico;
    }

    public void setNombremecanico(String nombremecanico) {
        this.nombremecanico = nombremecanico;
    }

    public String getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(String tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTrabajos() {
        return trabajos;
    }

    public void setTrabajos(String trabajos) {
        this.trabajos = trabajos;
    }

   // public String getFecha() {
   //     return fecha;
   /// }

    //public void setFecha(String fecha) {
    //    this.fecha = fecha;
    //}

    public String getTipomantenimiento() {
        return tipomantenimiento;
    }

    public void setTipomantenimiento(String tipomantenimiento) {
        this.tipomantenimiento = tipomantenimiento;
    }

    public String getRespuesto1() {
        return respuesto1;
    }

    public void setRespuesto1(String respuesto1) {
        this.respuesto1 = respuesto1;
    }

    public String getRespuesto2() {
        return respuesto2;
    }

    public void setRespuesto2(String respuesto2) {
        this.respuesto2 = respuesto2;
    }

    public double getValorrp1() {
        return valorrp1;
    }

    public void setValorrp1(double valorrp1) {
        this.valorrp1 = valorrp1;
    }

    public double getValorrp2() {
        return valorrp2;
    }

    public void setValorrp2(double valorrp2) {
        this.valorrp2 = valorrp2;
    }

    public String getAd1() {
        return ad1;
    }

    public void setAd1(String ad1) {
        this.ad1 = ad1;
    }

    public String getAd2() {
        return ad2;
    }

    public void setAd2(String ad2) {
        this.ad2 = ad2;
    }

    public String getAd3() {
        return ad3;
    }

    public void setAd3(String ad3) {
        this.ad3 = ad3;
    }

    public String getAd4() {
        return ad4;
    }

    public void setAd4(String ad4) {
        this.ad4 = ad4;
    }

    
    public Mantenimineto() {
    }

    public Mantenimineto(String nombrecliente, String cedulacliente, String nombremecanico, String tipovehiculo, String diagnostico, String trabajos, String tipomantenimiento, String respuesto1, String respuesto2, double valorrp1, double valorrp2, String ad1, String ad2, String ad3, String ad4) {
        this.nombrecliente = nombrecliente;
        this.cedulacliente = cedulacliente;
        this.nombremecanico = nombremecanico;
        this.tipovehiculo = tipovehiculo;
        this.diagnostico = diagnostico;
        this.trabajos = trabajos;
        this.tipomantenimiento = tipomantenimiento;
        this.respuesto1 = respuesto1;
        this.respuesto2 = respuesto2;
        this.valorrp1 = valorrp1;
        this.valorrp2 = valorrp2;
        this.ad1 = ad1;
        this.ad2 = ad2;
        this.ad3 = ad3;
        this.ad4 = ad4;
    }

   
    

    

    @Override
    public String toString() {
        return  "\nNombre cliente= " + nombrecliente 
                + "Cedula cliente= " + cedulacliente + "\nNombre mecanico= " 
                + nombremecanico + "Tipo vehiculo= " + tipovehiculo + 
                "\nDiagnostico= " + diagnostico + "Trabajos= " + trabajos + 
                //"\nFecha= " + fecha + 
                "Tipo mantenimiento= " + tipomantenimiento +
                "\nRespuesto1= " + respuesto1 + "Respuesto2= " + respuesto2 + 
                "\nValorrp1= " + valorrp1 + "Valorrp2=" + valorrp2 + 
                "\nAdicionales= " + ad1 +" y "+ ad2+ " y "+ad3+" y "+ ad4 ;
    }
    
    public abstract double calcularprecio();
    
}
