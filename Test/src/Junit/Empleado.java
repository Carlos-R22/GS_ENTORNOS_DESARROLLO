package Junit;


import Excepciones.MesesTrabajoExcepcion;
import Excepciones.NombreEmpleadoExcepcion;
import Excepciones.NumeroEmpleadoExcepcion;
import Excepciones.CargoExcepcion;
import java.util.regex.Pattern;



public class Empleado {

    private int numeroEmpleado;
    String nombreEmpleado;
    private int mesesTrabajo;
    boolean Directivo;
    Prima prima;


    public Prima calcularPrima (String numEmpleado, String nomEmpleado, String mesesT, String dir)
            throws NumeroEmpleadoExcepcion, NombreEmpleadoExcepcion, MesesTrabajoExcepcion, CargoExcepcion {

        establecerNumeroEmpleado(numEmpleado);
        estableceNombreEmpleado(nomEmpleado);
        estableceMesesTrabajo(mesesT);
        establecerSerDirectivo(dir);

        if (getDirectivo() && getMesesTrabajo() >=12){
            setPrima(Prima.P1);
            return Prima.P1;
        }
        if(!getDirectivo() && getMesesTrabajo() >12){
            setPrima(Prima.P2);
            return Prima.P2;
        }
        if (getDirectivo() && getMesesTrabajo()<12){
            setPrima(Prima.P3);
            return Prima.P3;
        }
        if (!getDirectivo() && getMesesTrabajo()<12){
            setPrima(Prima.P4);
            return Prima.P4;
        }
        throw new RuntimeException();
    }


    public void establecerNumeroEmpleado(String nEmpleado) throws NumeroEmpleadoExcepcion {
        int n;
        if (nEmpleado.matches("^\\d+$")){
            n= Integer.parseInt(nEmpleado);
            if (n>000 && n < 1000 ){
                setNumeroEmpleado(n);
                return;
            }
        }
        throw new NumeroEmpleadoExcepcion();
//        String numeroCeros = String.valueOf(obj.format("%05d", numero));
    }

    public void estableceNombreEmpleado(String nombreEmpleado) throws NombreEmpleadoExcepcion {

        if (Pattern.matches("^[a-zA-Z0-9]*$", nombreEmpleado)){
            if (nombreEmpleado.length()>=10){
                setNombreEmpleado(nombreEmpleado);
                return;
            }
        }
        throw new NombreEmpleadoExcepcion();
    }

    public void estableceMesesTrabajo(String mesesT) throws MesesTrabajoExcepcion {
        int n;
        if (mesesT.matches("^\\d+$")){
            n= Integer.parseInt(mesesT);
            if (n>=000 && n < 1000 ){
                setMesesTrabajo(n);
                return;
            }
        }
        throw new MesesTrabajoExcepcion();
    }

    public void establecerSerDirectivo(String directivo) throws CargoExcepcion {
        char[] caracter= directivo.toCharArray();
        if (directivo.length()==1){
            if (caracter[0] == '+' ){
                setDirectivo(true);
            }else if(caracter[0]=='-'){
                setDirectivo(false);
            }
        }
        throw new CargoExcepcion();
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    private void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    private void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getMesesTrabajo() {
        return mesesTrabajo;
    }

    private void setMesesTrabajo(int mesesTrabajo) {
        this.mesesTrabajo = mesesTrabajo;
    }

    public boolean getDirectivo() {
        return Directivo;
    }

    private void setDirectivo(boolean directivo) {
        Directivo = directivo;
    }

    public Prima getPrima() {
        return prima;
    }

    private void setPrima(Prima prima) {
        this.prima = prima;
    }


}