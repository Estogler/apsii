package kaua.talita;

public class DataAniversario {

    private int dia;
    private int mes;

    public DataAniversario(int dia, int mes){
        this.dia = dia;
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Override
    public boolean equals(Object outraData){
        if (outraData instanceof DataAniversario){
            DataAniversario outraDataAniversario = (DataAniversario) outraData;
            return (outraDataAniversario.dia == this.dia && outraDataAniversario.mes == this.mes);
        }
        return false;
    }

    @Override
    public String toString(){
        return this.dia+"/"+this.mes;
    }

}
