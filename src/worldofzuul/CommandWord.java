package worldofzuul;

public enum CommandWord
{
    MOVE("move"), GO("go"), QUIT("quit"), HELP("help"), EXAMINE("examine"), UNKNOWN("?");
    private String commandString;

    CommandWord(String commandString)
    {
        this.commandString = commandString;
    }

    public String toString()
    {
        return commandString;
    }
}
