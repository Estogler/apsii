package kaua.talita;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private ArrayList<Aniversariante> aniversariantes;

    public MinhaAgendaDeAniversarios() {
        this.aniversariantes = new ArrayList<Aniversariante>();
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        Aniversariante novoAniversariante = new Aniversariante(nome, dia, mes);
        aniversariantes.add(novoAniversariante);
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> aniversariantesNesteDia = new ArrayList<String>();

        for (Aniversariante aniversariante : aniversariantes) {
            DataAniversario dataConsulta = aniversariante.getDataAniversario();
            if (dataConsulta.getDia() == dia && dataConsulta.getMes() == mes) {
                aniversariantesNesteDia.add(aniversariante.getNome());
            }
        }

        return aniversariantesNesteDia;
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {
        for (int i = aniversariantes.size() - 1; i >= 0; i--) {
            Aniversariante aniversariante = aniversariantes.get(i);
            if (aniversariante.getNome().equals(nomeAniversariante)) {
                aniversariantes.remove(i);
            }
        }
    }

    public int getTotalAniversariantes() {
        return aniversariantes.size();
    }

    public boolean contemAniversariante(Aniversariante aniversariante) {
        return aniversariantes.contains(aniversariante);
    }

    public ArrayList<Aniversariante> listarTodosAniversariantes() {
        return new ArrayList<Aniversariante>(aniversariantes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Agenda de Aniversários:\n");
        for (Aniversariante aniversariante : aniversariantes) {
            sb.append("- ").append(aniversariante.toString()).append("\n");
        }
        return sb.toString();
    }
}
