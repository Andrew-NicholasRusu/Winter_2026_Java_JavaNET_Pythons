public class Main {
    public static void main(String[] args) {
        System.out.println("=== Text Editor with Undo/Redo ===");
        System.out.println();

        TextEditor editor = new TextEditor();
        int op = 1;

        // 1. Insert "Hello World" at position 0
        Command c1 = new InsertTextCommand(editor.getDocument(), "Hello World", 0);
        System.out.println("Operation " + op++ + ": " + c1.getDescription());
        editor.executeCommand(c1);
        editor.showDocument();
        System.out.println();

        // 2. Insert " Java" at position11
        Command c2 = new InsertTextCommand(editor.getDocument(), " Java", 11);
        System.out.println("Operation " + op++ + ": " + c2.getDescription());
        editor.executeCommand(c2);
        editor.showDocument();
        System.out.println();

        // 3. Delete 6 characters at position 6
        Command c3 = new DeleteTextCommand(editor.getDocument(), 6, 6);
        System.out.println("Operation " + op++ + ": " + c3.getDescription());
        editor.executeCommand(c3);
        editor.showDocument();
        System.out.println();

        // 4. Insert "Stack" at position 6
        Command c4 = new InsertTextCommand(editor.getDocument(), "Stack", 6);
        System.out.println("Operation " + op++ + ": " + c4.getDescription());
        editor.executeCommand(c4);
        editor.showDocument();
        System.out.println();

        // 5. Replace "Stack" with "Stacks" at position 6
        Command c5 = new ReplaceTextCommand(editor.getDocument(), "Stack", "Stacks", 6);
        System.out.println("Operation " + op++ + ": " + c5.getDescription());
        editor.executeCommand(c5);
        editor.showDocument();
        System.out.println();

        // Perform 2 undo operations
        editor.undo();
        editor.showDocument();
        System.out.println();

        editor.undo();
        editor.showDocument();
        System.out.println();

        // Perform 1 redo operation
        editor.redo();
        editor.showDocument();
        System.out.println();

        // Show history
        editor.showHistory();

        // Final Document
        System.out.println("Final Document: [" + editor.getDocumentContent() + "]");
    }
}
