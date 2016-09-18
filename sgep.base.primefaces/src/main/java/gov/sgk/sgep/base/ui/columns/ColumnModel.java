package gov.sgk.sgep.base.ui.columns;

import java.io.Serializable;

/**
 * Bir kolonla ilgili bilgileri tutan POJO sınıf
 * @author o-mssahin
 *
 */
public class ColumnModel implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    private String property;
    private String header;
    private Class<?> type;
    
    public ColumnModel() {}
 
    public String getProperty() {
        return property;
    }
 
    public void setProperty(String property) {
        this.property = property;
    }
    public String getHeader() {
        return header;
    }
    public void setHeader(String header) {
        this.header = header;
    }
    public Class<?> getType() {
        return type;
    }
 
    public void setType(Class<?> type) {
        this.type = type;
    }
    
    public boolean isBooleanType () {
    	return Boolean.class.equals(type);
    }
 
}