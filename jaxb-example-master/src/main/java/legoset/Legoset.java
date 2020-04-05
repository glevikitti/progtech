package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "theme", "subtheme", "year", "pieces", "tags", "minifigs", "url"})
@XmlRootElement
@Data
public class Legoset {
    @XmlJavaTypeAdapter(YearAdapter.class)
    public java.time.Year year;

    @XmlAttribute
    public String number;
    public int pieces;
    public  String theme;
    public String subtheme;
    public String url;

    @XmlElementWrapper(name="tags")
    @XmlElement(name="tag")
    public java.util.Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name="minifig")
    public java.util.List<Minifig> minifigs;


}
