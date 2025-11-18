package tarefa3.states;
import tarefa3.core.*;


public class EmergenciaState implements PlantState {
@Override
public void verificarTransicoes(NuclearPlant plant) {}
@Override
public String getNome() { return "EMERGENCIA"; }
}