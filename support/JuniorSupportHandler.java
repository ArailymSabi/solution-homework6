package support;

public class JuniorSupportHandler extends SupportHandler {
    public void handle(String issue) {
        if (issue.equals("refund_request") || issue.equals("billing_issue")) {
            System.out.println("[JuniorSupport] Обработанный " + issue);
        } else if (next != null) {
            Logger.log("JuniorSupport передает запрос дальше...");
            next.handle(issue);
        }
    }
}
