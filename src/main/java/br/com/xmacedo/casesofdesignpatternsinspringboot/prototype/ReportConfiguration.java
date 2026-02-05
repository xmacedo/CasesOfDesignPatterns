package br.com.xmacedo.casesofdesignpatternsinspringboot.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Scope("prototype")
public class ReportConfiguration implements Cloneable{

    private String reportType;
    private List<String> columns;
    private String sortBy;
    private boolean ascending;
    private String dateRange;

    public ReportConfiguration(){
        this.reportType = "summary";
        this.columns = List.of("id", "name", "date");
        this.sortBy = "date";
        this.ascending = false;
        this.dateRange = "last7days";
    }

    @Override
    protected ReportConfiguration clone() throws CloneNotSupportedException {
        ReportConfiguration clone = (ReportConfiguration) super.clone();
        clone.columns = List.copyOf(columns);

        return clone;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public boolean isAscending() {
        return ascending;
    }

    public void setAscending(boolean ascending) {
        this.ascending = ascending;
    }

    public String getDateRange() {
        return dateRange;
    }

    public void setDateRange(String dateRange) {
        this.dateRange = dateRange;
    }
}
