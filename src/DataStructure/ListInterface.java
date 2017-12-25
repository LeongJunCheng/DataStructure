package DataStructure;

/**
 * ListInterface.java An interface for the ADT list. Entries in the list have
 * positions that begin with 1.
 *
 * @author Frank M. Carrano
 * @version 2.0
 */
public interface ListInterface<T> {
    
    public void add(T newEntry);

    public void remove(T anEntry);
    
    public void removeByPosition(int position);
    
    public void replaceByID(String id, T anEntry);

    public void clear();

    public void replace(T oldEntry, T newEntry);

    public void getAll();

    public boolean contains(T anEntry);

    public int getSize();

    public boolean isEmpty();
}
