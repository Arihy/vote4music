package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;
import java.util.Date;

/**
 * User: Loic Descotte
 * Date: 28 f�vr. 2010
 */
@Entity
public class Album extends Model {
    @Required
    public String name;
    @Required
    public Artist artist;
    public Date releaseDate;
    public String genre;
}
