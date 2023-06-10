package moviev.domain;

import java.util.*;
import lombok.*;
import moviev.domain.*;
import moviev.infra.AbstractEvent;

@Data
@ToString
public class Ticketsent extends AbstractEvent {

    private Long id;
    private Long customerId;
    private String movieId;
    private Integer qty;

    public Ticketsent(Ticket aggregate) {
        super(aggregate);
    }

    public Ticketsent() {
        super();
    }
}
