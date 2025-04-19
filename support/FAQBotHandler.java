package support;

public class FAQBotHandler extends SupportHandler {
    public void handle(String issue) {
        if (issue.equals("password_reset")) {
            System.out.println("[FAQBot] Обработанный " + issue);
        } else if (next != null) {
            Logger.log("FAQBot передает запрос дальше...");
            next.handle(issue);
        }
    }
}
