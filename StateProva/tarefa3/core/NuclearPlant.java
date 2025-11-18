package tarefa3.core;

public class NuclearPlant {
private PlantState estadoAtual;
private double temperatura;
private boolean falhaResfriamento;
private boolean manutencaoAtiva;


public NuclearPlant() {
this.estadoAtual = new DesligadaState();
}


public void atualizarSensores(double temperatura, boolean falhaResfriamento) {
this.temperatura = temperatura;
this.falhaResfriamento = falhaResfriamento;
this.estadoAtual.verificarTransicoes(this);
}


public void ativarManutencao() {
manutencaoAtiva = true;
estadoAtual = new ManutencaoState();
}


public void desativarManutencao() {
manutencaoAtiva = false;
estadoAtual = new OperacaoNormalState();
}


public void setEstado(PlantState novoEstado) {
if (!manutencaoAtiva) this.estadoAtual = novoEstado;
}


public double getTemperatura() { return temperatura; }
public boolean getFalhaResfriamento() { return falhaResfriamento; }
public PlantState getEstado() { return estadoAtual; }
}