package pt.ipleiria.estg.dei.ei.UpFeed.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Table(name = "rooms")
@Entity
//TODO Inheritance
public class Room implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    @ManyToMany(mappedBy = "rooms")
    private List<Student> students;
    @OneToMany(mappedBy = "room", cascade = CascadeType.REMOVE)
    private List<Post> posts;
    @ManyToOne
    @JoinColumn(name = "channelId")
    private Channel channel;

    public Room() {
    }

    public Room( String title, String description, List<Student> students, Channel channel) {
        this.title = title;
        this.description = description;
        this.students = students;
        this.channel = channel;
    }

    public Room(Long id, String title, String description, List<Student> students, Channel channel) {
        this(title, description, students, channel);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}
