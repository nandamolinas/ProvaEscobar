package tarefa3.states;
import tarefa3.core.*;
import tarefa3.core.NuclearPlant;


public class OperacaoNormalState implements PlantState {
@Override
public void verificarTransicoes(NuclearPlant plant) {
if (plant.getTemperatura() > 300) {
plant.setEstado(new AlertaAmareloState());
}
}
@Override
public String getNome() { return "OPERACAO_NORMAL"; }
}