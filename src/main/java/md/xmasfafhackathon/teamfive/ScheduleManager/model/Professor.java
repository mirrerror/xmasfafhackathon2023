package md.xmasfafhackathon.teamfive.ScheduleManager.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    private String type;

    private Map<String, Boolean> lectures;
}

