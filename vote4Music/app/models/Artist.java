package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;

/**
 * User: Loic Descotte
 * Date: 28 f�vr. 2010
 */
@Entity
public class Artist extends Model{
    @Required
    public String name;
}
