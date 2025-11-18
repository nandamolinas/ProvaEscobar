package tarefa3.states;
import tarefa3.core.*;


public class AlertaVermelhoState implements PlantState {
@Override
public void verificarTransicoes(NuclearPlant plant) {
if (plant.getFalhaResfriamento()) {
plant.setEstado(new EmergenciaState());
}
}
@Override
public String getNome() { return "ALERTA_VERMELHO"; }
}