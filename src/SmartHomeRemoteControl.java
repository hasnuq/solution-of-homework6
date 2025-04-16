class SmartHomeRemoteControl {
    private java.util.Map<Integer, Command> commands = new java.util.HashMap<>();
    private Command lastCommand;

    public void setCommand(int slot, Command command) {
        commands.put(slot, command);
    }

    public void pressButton(int slot) {
        Command command = commands.get(slot);
        if (command != null) {
            command.execute();
            lastCommand = command;
        } else {
            System.out.println("No command assigned to slot " + slot);
        }
    }

    public void undoButton() {
        if (lastCommand != null) {
            System.out.println("Undo last command");
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo");
        }
    }
}