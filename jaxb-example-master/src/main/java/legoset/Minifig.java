package legoset;
import lombok.Data;

@Data
public class Minifig {
    public int counts;
    public String name;
    public Minifig() {

    }

    public Minifig(int counts, String name) {
        this.counts = counts;
        this.name = name;
    }
}
