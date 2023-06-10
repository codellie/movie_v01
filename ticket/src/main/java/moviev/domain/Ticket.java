package moviev.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import moviev.TicketApplication;
import moviev.domain.Ticketsent;

@Entity
@Table(name = "Ticket_table")
@Data
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long customerId;

    private String movieId;

    private Integer qty;

    @PostPersist
    public void onPostPersist() {
        Ticketsent ticketsent = new Ticketsent(this);
        ticketsent.publishAfterCommit();
    }

    public static TicketRepository repository() {
        TicketRepository ticketRepository = TicketApplication.applicationContext.getBean(
            TicketRepository.class
        );
        return ticketRepository;
    }

    public static void ticketSend(Reserved reserved) {
        //implement business logic here:

        /** Example 1:  new item 
        Ticket ticket = new Ticket();
        repository().save(ticket);

        */

        /** Example 2:  finding and process
        
        repository().findById(reserved.get???()).ifPresent(ticket->{
            
            ticket // do something
            repository().save(ticket);


         });
        */

    }
}
