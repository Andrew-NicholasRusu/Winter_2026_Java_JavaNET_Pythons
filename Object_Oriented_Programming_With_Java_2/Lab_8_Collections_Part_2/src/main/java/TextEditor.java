import java.util.Stack;

public class TextEditor {
    // Fields
    private StringBuilder document;
    private Stack undoStack;
    private Stack redoStack;

    // Methods
    public void executeCommand(Command cmd) { // Execute the command, push to undoStack, clear redoStack

    }

    public void undo() { // Pop from undoStack, call undo(), push to redoStack

    }

    public void redo() { // Pop from redoStack, call execute(), push to undoStack

    }

    public void showDocument() {

    }

    public void showHistory() { // Display both stacks without modifying them

    }

    public String getDocumentContent() {
    }
}
