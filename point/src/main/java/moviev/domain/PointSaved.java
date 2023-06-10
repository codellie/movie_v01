package moviev.domain;

import java.util.*;
import lombok.*;
import moviev.domain.*;
import moviev.infra.AbstractEvent;

@Data
@ToString
public class PointSaved extends AbstractEvent {

    private Long id;
    private Integer stock;

    public PointSaved(Point aggregate) {
        super(aggregate);
    }

    public PointSaved() {
        super();
    }
}
