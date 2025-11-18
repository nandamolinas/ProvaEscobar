package tarefa3;
import tarefa3.core.*;


public class Main {
public static void main(String[] args) throws Exception {
NuclearPlant plant = new NuclearPlant();


plant.atualizarSensores(350, false);
System.out.println(plant.getEstado().getNome());


Thread.sleep(31000);
plant.atualizarSensores(420, false);
System.out.println(plant.getEstado().getNome());


plant.atualizarSensores(420, true);
System.out.println(plant.getEstado().getNome());
}
}