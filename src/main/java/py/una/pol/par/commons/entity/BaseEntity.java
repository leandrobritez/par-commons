package py.una.pol.par.commons.entity;

/**
 *
 * @author Sourabh Sharma
 * @param <T>
 */
public abstract class BaseEntity<T> extends Entity<T> {

    private boolean isModified;

    /**
     *
     * @param id
     * @param name
     */
    public BaseEntity(T id, String name) {
        super.id = id;
        super.name = name;
        isModified = false;
    }

    public BaseEntity() {
    }

    /**
     *
     * @return
     */
    public boolean isIsModified() {
        return isModified;
    }

}
