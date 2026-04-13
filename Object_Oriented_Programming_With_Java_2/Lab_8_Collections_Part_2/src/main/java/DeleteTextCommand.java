public class DeleteTextCommand implements Command {
    // Fields
    private StringBuilder document;
    private String deletedText;
    private int startPosition;
    private int length;

    // Constructor
    public DeleteTextCommand (StringBuilder document, String deletedText, int startPosition, int length) {
        this.document = document;
        this.deletedText = deletedText;
        this.startPosition = startPosition;
        this.length = length;
    }

    @Override
    public void execute() {
        if (startPosition < 0 || startPosition + length > document.length()) {
            throw new IndexOutOfBoundsException("Invalid position or length for deletion.");
        }
        deletedText = document.substring(startPosition, startPosition + length);
        document.delete(startPosition, startPosition + length);
    }

    @Override
    public void undo() {
        if (startPosition < 0 || startPosition > document.length() || deletedText == null) {
            throw new IllegalArgumentException("Document state is invalid for undoing insert.");
        }
        document.insert(startPosition, deletedText);
    }

    @Override
    public String getDescription() {
        return "Delete " + length + " characters at startPosition " + startPosition;
    }
}
