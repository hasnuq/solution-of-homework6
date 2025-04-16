class FAQBotHandler extends SupportHandler {
    public void handle(String issue) {
        if (issue.equals("password_reset")) {
            System.out.println("[FAQbot] Handled password_reset");
        } else if (nextHandler != null) {
            nextHandler.handle(issue);
        } else {
            System.out.println("[FAQbot] Cannot handle " + issue + " — escalate manually");
        }
    }
}