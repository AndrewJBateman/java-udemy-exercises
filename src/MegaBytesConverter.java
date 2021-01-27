public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int mb = kiloBytes / 1024;
        int kb = kiloBytes % 1024;
        System.out.println(new StringBuilder()
                .append(kiloBytes)
                .append(" KB = ")
                .append(mb)
                .append(" MB and ")
                .append(kb)
                .append(" KB")
                .toString());
    }

}
