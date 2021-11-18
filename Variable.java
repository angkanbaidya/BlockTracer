//Angkan baidya
// 112309655
// RO1


public class Variable { /** This is the variable class that takes in the initial name and the intial value from the
                            line of the file**/
    private String name;
    private int initialValue;

    public Variable(String name,int initialValue){ /** This instantiates the name and the intial value of the variable**/
        this.name = name;
        this.initialValue = initialValue;
    }

    public String getName() { /** This method gets the name of the specific variable**/
        return name;
    }

    public void setName(String name) { /** This sets the name of the variable **/
        this.name = name;
    }

    public int getInitialValue() { /** This method gets the intial value**/
        return initialValue;
    }

    public void setInitialValue(int initialValue) { /** This setter sets the intial value **/
        this.initialValue = initialValue;
    }

    public String toString(){ /** This method returns the name and the initial value in a string**/
        return(name + " " + initialValue);
    }
}
