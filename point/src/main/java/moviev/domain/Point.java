package moviev.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import moviev.PointApplication;
import moviev.domain.PointSaved;

@Entity
@Table(name = "Point_table")
@Data
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer stock;

    @PostPersist
    public void onPostPersist() {
        PointSaved pointSaved = new PointSaved(this);
        pointSaved.publishAfterCommit();
    }

    public static PointRepository repository() {
        PointRepository pointRepository = PointApplication.applicationContext.getBean(
            PointRepository.class
        );
        return pointRepository;
    }

    public static void increase(Reserved reserved) {
        //implement business logic here:

        /** Example 1:  new item 
        Point point = new Point();
        repository().save(point);

        */

        /** Example 2:  finding and process
        
        repository().findById(reserved.get???()).ifPresent(point->{
            
            point // do something
            repository().save(point);


         });
        */

    }
}
