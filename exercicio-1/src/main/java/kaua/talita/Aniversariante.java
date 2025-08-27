package kaua.talita;

public class Aniversariante {

    private String nome;
    private DataAniversario dataAniversario;

    public Aniversariante(String nome, int dia, int mes) {
        this.nome = nome;
        this.dataAniversario = new DataAniversario(dia, mes);
    }

    public Aniversariante(String nome, DataAniversario dataAniversario) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
    }

    @Override
    public boolean equals(Object outro) {
        if (outro instanceof Aniversariante) {
            Aniversariante outroAniversariante = (Aniversariante) outro;
            return (this.nome.equals(outroAniversariante.nome) &&
                    this.dataAniversario.equals(outroAniversariante.dataAniversario));
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DataAniversario getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(DataAniversario dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    @Override
    public String toString() {
        return nome + " - " + dataAniversario.toString();
    }
}
