enum Size {
    SMALL("This size is small"),
    MEDIUM("This size is medium"),
    LARGE("This size is large") {
        public String toString() {
            return "This size is large";
        };
    },
    EXTRALARGE("This size is extra large");

    private final String size;

    private Size(String size) {
        this.size = size;
    }

    public String getSize() {

        // switch (this) {
        // case SMALL:
        // return "small";
        // case MEDIUM:
        // return "medium";
        // case LARGE:
        // return "large";
        // case EXTRALARGE:
        // return "extra large";

        // default:
        // return null;
        // }
        return size;
    }

    public static void main(String[] args) {
        // System.out.println("The size is " + Size.SMALL.getSize());
        // System.out.println(Size.SMALL.ordinal());
        // System.out.println(Size.SMALL.compareTo(MEDIUM));
        System.out.println(Size.SMALL.toString());
        System.out.println(Size.LARGE.toString());
        // System.out.println(Size.SMALL.name());
        // System.out.println(Size.values());
    }
}
