package support;

public class SeniorSupportHandler extends SupportHandler {
    public void handle(String issue) {
        if (issue.equals("account_ban") || issue.equals("data_loss")) {
            System.out.println("[SeniorSupport] Обработанный " + issue);
        } else {
            System.out.println("[SeniorSupport] Невозможно обработать " + issue + " — эскалировать вручную");
        }
    }
}
