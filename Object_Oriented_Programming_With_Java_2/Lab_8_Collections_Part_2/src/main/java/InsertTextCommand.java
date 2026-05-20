// Part B: Create Concrete Command Classes [4 points]
// Implement the following command classes that implement the Command interface:
// 1. InsertTextCommand

public class InsertTextCommand implements Command {
    // Fields
    private StringBuilder document;
    private String text;
    private int position;

    // Constructor
    public InsertTextCommand(StringBuilder document, String text, int position) {
        this.document = document;
        this.text = text;
        this.position = position;
    }

    // Methods
    @Override
    public void execute() {
        if (position < 0 || position > document.length()) {
            throw new IndexOutOfBoundsException("Invalid position " + position + " for insertion. Document length is " + document.length());
        }
        document.insert(position, text);
    }

    @Override
    public void undo() {
        if (position < 0 || position + text.length() > document.length()) {
            throw new IllegalStateException("Document state is invalid for undoing insert.");
        }
        document.delete(position, position + text.length());
    }

    @Override
    public String getDescription() {
        return "Insert \"" + text + "\" at position " + position;
    }
}
