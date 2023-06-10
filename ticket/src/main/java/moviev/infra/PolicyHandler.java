package moviev.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import moviev.config.kafka.KafkaProcessor;
import moviev.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    TicketRepository ticketRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Reserved'"
    )
    public void wheneverReserved_TicketSend(@Payload Reserved reserved) {
        Reserved event = reserved;
        System.out.println(
            "\n\n##### listener TicketSend : " + reserved + "\n\n"
        );

        // Sample Logic //
        Ticket.ticketSend(event);
    }
}
