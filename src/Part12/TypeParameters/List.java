package Part12.TypeParameters;
/* Basic generic class that Java implements which is for instance the List
that can add, get and remove elements.
 */
public interface List <T>
{
    void add(T value);
    T get(int index);
    T remove(int index);
}
