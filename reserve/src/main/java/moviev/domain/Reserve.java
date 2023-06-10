package moviev.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import moviev.ReserveApplication;
import moviev.domain.Reserved;

@Entity
@Table(name = "Reserve_table")
@Data
public class Reserve {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String movieName;

    private String movieid;

    private Long customerId;

    private Integer qty;

    @PostPersist
    public void onPostPersist() {}

    @PrePersist
    public void onPrePersist() {
        Reserved reserved = new Reserved(this);
        reserved.publishAfterCommit();
    }

    public static ReserveRepository repository() {
        ReserveRepository reserveRepository = ReserveApplication.applicationContext.getBean(
            ReserveRepository.class
        );
        return reserveRepository;
    }
}
