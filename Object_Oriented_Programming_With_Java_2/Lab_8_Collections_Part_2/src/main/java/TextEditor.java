import java.util.Stack;

public class TextEditor {

    // Fields
    private StringBuilder document;
    private Stack<Command> undoStack;
    private Stack<Command> redoStack;

    // Constructors
    public TextEditor(StringBuilder document, Stack<Command> undoStack, Stack<Command> redoStack) {
        this.document = document;
        this.undoStack = undoStack;
        this.redoStack = redoStack;
    }

    public TextEditor(){
        this.document = new StringBuilder();
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    public StringBuilder getDocument(){
        return document;
    }

    public void executeCommand(Command cmd){
        cmd.execute();
        // push the executed command onto the undoStack to keep track of history
        undoStack.push(cmd);
        // Clear the redoStack because a new action invalidates previously undone actions
        redoStack.clear();
    }

    public void undo(){
        if (undoStack.isEmpty()){
            throw new IllegalStateException("Cannot undo because the undo stack is empty.");
        }
        System.out.println("---- Performing Undo ----");
        Command cmd = undoStack.pop();
        System.out.println("Undoing: "+cmd.getDescription());
        cmd.undo();
        // Push the undone command to the redo stack so it can be redon later.
        redoStack.push(cmd);
    }

    public void redo(){
        if(redoStack.isEmpty()){
            throw new IllegalStateException("Cannot redo because the redo stack is empty.");
        }
        System.out.println("---- Performing Redo ----");
        // Pop the most recently undone command from the redoStack
        Command cmd = redoStack.pop();
        System.out.println("Redoing: "+cmd.getDescription());
        cmd.execute();
        // Push the redone command back onto the undoStack
        undoStack.push(cmd);
    }

    public void showDocument() {
        System.out.println("Document: [" + document.toString() + "]");
    }

    public void showHistory() {
    System.out.println("--- Undo Stack ---");
    if (undoStack.isEmpty()) {
        System.out.println("(empty)");
    } else {
        for (int i = undoStack.size() - 1; i >= 0; i--) {
            System.out.println(undoStack.get(i).getDescription());
        }
    }
    
    System.out.println("--- Redo Stack ---");
    if (redoStack.isEmpty()) {
        System.out.println("(empty)");
    } else {
        for (int i = redoStack.size() - 1; i >= 0; i--) {
            System.out.println(redoStack.get(i).getDescription());
         }
        }
    }

    public Command peekUndo() {
        if (!undoStack.isEmpty()) {
            return undoStack.peek();
        }
        return null;
    }   
    public String getDocumentContent() {
        return document.toString();
    }
}

