public class ReplaceTextCommand implements Command {

    // Fields
    private StringBuilder document;
    private String oldText;
    private String newText;
    private int position;

    // Constructor
    public ReplaceTextCommand (StringBuilder document, String oldText, String newText, int position) {
        this.document = document;
        this.oldText = oldText;
        this.newText = newText;
        this.position = position;
    }

    @Override
    public void execute() {
        if (position < 0 || position + oldText.length() > document.length()) {
            throw new IndexOutOfBoundsException("Invalid position or old text length for replacement.");
        }
        String actualOldText = document.substring(position, position + oldText.length());
        if (!actualOldText.equals(oldText)) {
            throw new IllegalArgumentException(("text at position " + position + " does not match expected oldText"));
        }
        document.replace(position, position + oldText.length(), newText);
    }

    @Override
    public void undo() {
        if (position < 0 || position + newText.length() > document.length()) {
            throw new IllegalArgumentException("Invalid state for undoing replace.");
        }
        document.replace(position, position + newText.length(), oldText);
    }

    @Override
    public String getDescription() {
        return "Replace \"" + oldText + "\" with \"" + newText + "\" at position " + position;
    }
}
