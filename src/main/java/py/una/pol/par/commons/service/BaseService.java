package py.una.pol.par.commons.service;

import java.util.Collection;
import py.una.pol.par.commons.repository.Repository;


/**
 *
 * @author Sourabh Sharma
 * @param <TE>
 * @param <T>
 */
public abstract class BaseService<TE, T> extends ReadOnlyBaseService<TE, T> {

    private Repository<TE, T> _repository;

    public BaseService(Repository<TE, T> repository) {
        super(repository);
        _repository = repository;
    }

    /**
     *
     * @param entity
     * @throws Exception
     */
    public void add(TE entity) throws Exception {
        _repository.add(entity);
    }

    /**
     *
     * @return
     */
    public Collection<TE> getAll() {
        return _repository.getAll();
    }
}
