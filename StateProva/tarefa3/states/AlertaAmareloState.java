package tarefa3.states;
import tarefa3.core.*;


public class AlertaAmareloState implements PlantState {
private long inicioAltaTemp = -1;


@Override
public void verificarTransicoes(NuclearPlant plant) {
if (plant.getTemperatura() > 400) {
if (inicioAltaTemp == -1) inicioAltaTemp = System.currentTimeMillis();
long duracao = System.currentTimeMillis() - inicioAltaTemp;
if (duracao >= 30000) {
plant.setEstado(new AlertaVermelhoState());
}
} else {
inicioAltaTemp = -1;
}
}


@Override
public String getNome() { return "ALERTA_AMARELO"; }
}