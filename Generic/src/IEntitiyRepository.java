public interface IEntitiyRepository<T extends IEntity> {
    //entity veri tabanı nesnesi anlamına gelir
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
