public class sbflformulae {

    static double fails = 1;
    static double passes = 1;
    static double totalFails = 1;
    static double totalPasses = 5;
    static double allFails = totalFails + fails;



    public static double tarantula() {
        System.out.println("Tarantula suspicious value is: ");
        return (fails / totalFails) / ((fails / totalFails) + (passes / totalPasses));
    }

    public static double SBI() {
        System.out.println("SBI suspicious value is: ");
        return (fails / (fails + passes));
    }

    public static double jaccard() {
        System.out.println("Jaccard suspicious value is: ");
        return (fails) / (allFails + passes);
    }

    public static double ochiai() {
        System.out.println("Ochiai suspicious value is: ");
        return (fails) / Math.sqrt((allFails) * (passes + fails));
    }
    public static void main(String[] args) {

        System.out.println("The Suspiciousness values for the 4 formulae are as follows.");
        System.out.println(tarantula());
        System.out.println(SBI());
        System.out.println(jaccard());
        System.out.println(ochiai());
    }
}
