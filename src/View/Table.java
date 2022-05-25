package View;

import java.util.ArrayList;
import java.util.Arrays;

public class Table {
    private String[] headers;
    private ArrayList<ArrayList<String>> rows;
    
    private int[] colWidths;
    private String format;
    private int maxRowSize;
    
    public Table() {
        rows = new ArrayList<>();
    }
    
    private void updateWidths(){
        headers = Arrays.copyOf(headers, headers.length + (maxRowSize - headers.length));
        colWidths = new int[maxRowSize];
        for (int i = 0; i < headers.length; i++) {
            if(headers[i] == null) headers[i] = ""; 
            colWidths[i] = Math.max(colWidths[i], headers[i].length());
        }
        
        for (int i = 0; i < rows.size(); i++) {
            ArrayList<String> row = rows.get(i);
            while(row.size() < maxRowSize){
                row.add("");
            }
            for (int j = 0; j < row.size(); j++) {
                colWidths[j] = Math.max(colWidths[j], row.get(j).length());
            }
        }
    }
    
    private void updateMaxRowSize() {
        maxRowSize = headers.length;
        for (int i = 0; i < rows.size(); i++) {
            maxRowSize = Math.max(maxRowSize, rows.get(i).size());
        }
    }
    private void makeFormat(){
        format = "|";
        for (int i = 0; i < maxRowSize; i++) {
            format += " %-" + colWidths[i] + "s |";
        }
        format += "\n";
    }
    
    private String separator(String separator, int size){
        String result = "";
        for (int i = 0; i < size; i++) 
            result += separator;
        return result + "+";
    }
    
    private void horizontalLine(){
        String line = "+";
        for (int i = 0; i < colWidths.length; i++) {
            line += separator("-", colWidths[i] + 2);
        }
        System.out.println(line);
    }
    
    public void setHeaders(String... headers) {
        this.headers = headers;
    }

    public void addRow(String... row) {
        ArrayList<String> singleRow = new ArrayList<>();
        singleRow.addAll(Arrays.asList(row));
        this.rows.add(singleRow);
    }
    
    public void showTable(){
        updateMaxRowSize();
        updateWidths();
        makeFormat();
        
        horizontalLine();
        System.out.printf(format, (Object[]) headers);
    
        horizontalLine();
        for (int i = 0; i < rows.size(); i++) {
            Object[] row = rows.get(i).toArray();
            System.out.printf(format, row);
            horizontalLine();
        }
    }
}
