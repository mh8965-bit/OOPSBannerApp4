


public class OOPSBannerApp2 {

    public static void main(String[] args) {

        // Create a String array with 7 lines
        String[] lines = new String[7];

        // Populate banner lines using String.join()
        lines[0] = String.join("", "   ***   ", "   ***   ",  "  *****  ", "     ***** ");
        lines[1] = String.join("", "  **   ** ", " **   ** ", " **   ** ", "   **     ");
        lines[2] = String.join("", " **     **", " **   ** ", " **   ** ", "  **     ");
        lines[3] = String.join("", " **     **", " **   ** ", " *****   ", "    ***  ");
        lines[4] = String.join("", " **     **", " **   ** ", " **      ", "       ** ");
        lines[5] = String.join("", "  **   ** ", " **   ** ", " **      ", "      **  ");
        lines[6] = String.join("", "   *****  ", "   ***   ", " **      ", "  *****   ");

        // Enhanced for loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
