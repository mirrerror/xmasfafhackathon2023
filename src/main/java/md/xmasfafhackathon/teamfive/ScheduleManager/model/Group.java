package md.xmasfafhackathon.teamfive.ScheduleManager.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String speciality;
    private String language;
    private int personCount;

    @OneToMany(mappedBy = "grupa")
    private List<Subject> subjects;
}

