package br.com.xmacedo.casesofdesignpatternsinspringboot.prototype;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class ReportFactory {
    private ReportConfiguration reportConfiguration;
    private Map<String, ReportConfiguration> templates = new HashMap<>();

    public ReportFactory(ReportConfiguration reportConfiguration) {
        this.reportConfiguration = reportConfiguration;
    }

    @PostConstruct
    public void initTemplates() throws CloneNotSupportedException {
        //Create a financial report template
        ReportConfiguration financialTemplate = reportConfiguration.clone();
        financialTemplate.setReportType("financial");
        financialTemplate.setColumns(Arrays.asList("id", "amount", "transaction_date", "category"));
        financialTemplate.setSortBy("amount");
        templates.put("financial", financialTemplate);

        ReportConfiguration activityTemplate = reportConfiguration.clone();
        activityTemplate.setReportType("financial");
        activityTemplate.setColumns(Arrays.asList("user_id", "action", "timestamp", "ip_address"));
        activityTemplate.setSortBy("timestamp");
        templates.put("activity", activityTemplate);
    }

    public ReportConfiguration createFromTemplate(String templateName) {
        ReportConfiguration template = templates.get(templateName);
        if (template == null) {
            throw new IllegalArgumentException("Invalid template name");
        }

        return template;
    }

    public ReportConfiguration createDefaultTemplate() throws CloneNotSupportedException {
        return reportConfiguration.clone();
    }
}
