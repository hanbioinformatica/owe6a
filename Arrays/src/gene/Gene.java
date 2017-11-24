
package gene;

/**
 *
 * @author bgnmh
 */
public class Gene implements Comparable {

    private int id;

    public Gene(int newId) {
        setId(newId);
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return Integer.toString(id);
    }

    public int compareTo(Object o) {
        if (this.id > ((Gene) o).getId()) {
            return -1;
        }
        if (this.id < ((Gene) o).getId()) {
            return +1;
        } else {
            return 0;
        }

    }

}
