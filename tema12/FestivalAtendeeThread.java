package tema12;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FestivalAtendeeThread {
    private TicketType ticketType;
    private FestivalGate gate;
    private final ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
}
