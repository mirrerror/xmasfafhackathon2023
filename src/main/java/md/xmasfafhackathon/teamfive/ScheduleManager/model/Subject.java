package md.xmasfafhackathon.teamfive.ScheduleManager.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;
    private int theory;
    private int practice;
    private int lab;
    private int total;
    private int year;
    private int semester;

    @ManyToOne
    @JoinColumn(name = "grupa_id")
    private Group group;

    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesori professor;
}

