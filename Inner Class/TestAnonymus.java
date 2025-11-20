/*
3)Anonymus class:
-Which is declare without any name.
-it used to override the abstract method without inherit that abstract class.
-object create only one time.

 */
abstract class AnonymusOuter {

    abstract void run();
}

class TestAnonymus {

    public static void main(String[] args) {
        AnonymusOuter a = new AnonymusOuter() {
            void run() {
                System.out.println("This is Anonymus class...");
            }
        };
        a.run();
    }
}
