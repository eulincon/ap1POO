import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa{

    private List<Area> areas = new ArrayList<>();

    public Autor() {
    }

    public Autor(String nome, String cpf) {
        super(nome, cpf);
    }

    public void adicionarArea(Area area) {
        this.areas.add(area);
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public void removerArea(Area area) {
        for(Area area1 : areas){
            if (area1.getNome().equals(area.getNome())){
                this.areas.remove(area1);
                break;
            }
        }
    }
}
