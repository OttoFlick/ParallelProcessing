package exercise4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Restaurant {
    private int numberOfTables;
    private List<Table> tables;

    public Restaurant(int numberOfTables) {
        this.numberOfTables = numberOfTables;
        this.tables = new ArrayList<>(numberOfTables);
        for (int i = 0; i < numberOfTables; i++){
            this.tables.add(new Table());
        }
    }

    public int getNumberOfTables() {
        return this.numberOfTables;
    }

    public void useTable(int tableIndex){
        Table table = this.tables.get(tableIndex - 1);
        synchronized (table) {
            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                    + "   " + Thread.currentThread().getName()
                    + ": " + "table " + tableIndex + " busy");
            try {
                Thread.currentThread().sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                    + "   " + Thread.currentThread().getName() + ": "
                    + "table " + tableIndex + " released");
        }
    }
}
