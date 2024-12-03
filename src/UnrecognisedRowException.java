public class UnrecognisedRowException extends Exception {
    public UnrecognisedRowException(String msg) {
      super(msg);
    }

    @Override
    public String getMessage() {
        return "Unrecognised row: " + super.getMessage();
    }
}
