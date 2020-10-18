import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {

    @Id
    private Long id=1L;
    private String text;
    public String getText(){
        return this.text;
    }
    public void setText(String text){
        this.text = text;
    }
}
