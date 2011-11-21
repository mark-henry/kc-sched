package keycow.scheduler.view;

public class BigTabs {
    public static String paddedTitle(String title, int padding_x, int padding_y) {
        return "<html><body" + 
            " leftmargin="   + padding_x + 
            " marginwidth="  + padding_x + 
            " topmargin="    + padding_y +
            " marginheight=" + padding_y + ">" +
            title + "</body></html>";
    }
}
