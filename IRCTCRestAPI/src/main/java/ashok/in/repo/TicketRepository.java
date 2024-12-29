package ashok.in.repo;

import ashok.in.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket ,Integer> {
}
