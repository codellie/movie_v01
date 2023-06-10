package moviev.domain;

import java.util.*;
import lombok.*;
import moviev.domain.*;
import moviev.infra.AbstractEvent;

@Data
@ToString
public class Reserved extends AbstractEvent {

    private Long id;
    private String movieName;
    private String movieid;
    private Long customerId;
    private Integer qty;
}
