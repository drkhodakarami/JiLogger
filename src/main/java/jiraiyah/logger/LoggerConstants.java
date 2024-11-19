package jiraiyah.logger;

@SuppressWarnings("unused")
public class LoggerConstants
{
    /**
     * ANSI escape code for resetting the color formatting in the console output.
     * This code can be used to revert the text color back to the default settings
     * after applying any other ANSI color codes. Utilizing this constant makes
     * it easier to manage text color when logging or printing messages to the console.
     */
    public static final String RESET = "\u001B[0m";

    public static class Foreground
    {
        /**
         * ANSI escape code for setting the text color to black color in console output.
         * This code can be used to change the color of the text displayed in the
         * console to different color. It is useful for enhancing the readability of log
         * messages or console output by using different colors for different contexts.
         */
        public static final String BLACK = "\u001B[30m";

        /**
         * ANSI escape code for setting the text color to red color in console output.
         * This code can be used to change the color of the text displayed in the
         * console to different color. It is useful for enhancing the readability of log
         * messages or console output by using different colors for different contexts.
         */
        public static final String RED = "\u001B[31m";

        /**
         * ANSI escape code for setting the text color to green color in console output.
         * This code can be used to change the color of the text displayed in the
         * console to different color. It is useful for enhancing the readability of log
         * messages or console output by using different colors for different contexts.
         */
        public static final String GREEN = "\u001B[32m";

        /**
         * ANSI escape code for setting the text color to yellow color in console output.
         * This code can be used to change the color of the text displayed in the
         * console to different color. It is useful for enhancing the readability of log
         * messages or console output by using different colors for different contexts.
         */
        public static final String YELLOW = "\u001B[33m";

        /**
         * ANSI escape code for setting the text color to blue color in console output.
         * This code can be used to change the color of the text displayed in the
         * console to different color. It is useful for enhancing the readability of log
         * messages or console output by using different colors for different contexts.
         */
        public static final String BLUE = "\u001B[34m";

        /**
         * ANSI escape code for setting the text color to magenta color in console output.
         * This code can be used to change the color of the text displayed in the
         * console to different color. It is useful for enhancing the readability of log
         * messages or console output by using different colors for different contexts.
         */
        public static final String MAGENTA = "\u001B[35m";

        /**
         * ANSI escape code for setting the text color to cyan color in console output.
         * This code can be used to change the color of the text displayed in the
         * console to different color. It is useful for enhancing the readability of log
         * messages or console output by using different colors for different contexts.
         */
        public static final String CYAN = "\u001B[36m";

        /**
         * ANSI escape code for setting the text color to white color in console output.
         * This code can be used to change the color of the text displayed in the
         * console to different color. It is useful for enhancing the readability of log
         * messages or console output by using different colors for different contexts.
         */
        public static final String WHITE = "\u001B[37m";

        /**
         * ANSI escape code for setting the text color to bright black color in console output.
         * This code can be used to change the color of the text displayed in the
         * console to different color. It is useful for enhancing the readability of log
         * messages or console output by using different colors for different contexts.
         */
        public static final String BRIGHT_BLACK = "\u001B[90m";

        /**
         * ANSI escape code for setting the text color to bright red color in console output.
         * This code can be used to change the color of the text displayed in the
         * console to different color. It is useful for enhancing the readability of log
         * messages or console output by using different colors for different contexts.
         */
        public static final String BRIGHT_RED = "\u001B[91m";

        /**
         * ANSI escape code for setting the text color to bright green color in console output.
         * This code can be used to change the color of the text displayed in the
         * console to different color. It is useful for enhancing the readability of log
         * messages or console output by using different colors for different contexts.
         */
        public static final String BRIGHT_GREEN = "\u001B[92m";

        /**
         * ANSI escape code for setting the text color to bright yellow color in console output.
         * This code can be used to change the color of the text displayed in the
         * console to different color. It is useful for enhancing the readability of log
         * messages or console output by using different colors for different contexts.
         */
        public static final String BRIGHT_YELLOW = "\u001B[93m";

        /**
         * ANSI escape code for setting the text color to bright blue color in console output.
         * This code can be used to change the color of the text displayed in the
         * console to different color. It is useful for enhancing the readability of log
         * messages or console output by using different colors for different contexts.
         */
        public static final String BRIGHT_BLUE = "\u001B[94m";

        /**
         * ANSI escape code for setting the text color to bright magenta color in console output.
         * This code can be used to change the color of the text displayed in the
         * console to different color. It is useful for enhancing the readability of log
         * messages or console output by using different colors for different contexts.
         */
        public static final String BRIGHT_MAGENTA = "\u001B[95m";

        /**
         * ANSI escape code for setting the text color to bright cyan color in console output.
         * This code can be used to change the color of the text displayed in the
         * console to different color. It is useful for enhancing the readability of log
         * messages or console output by using different colors for different contexts.
         */
        public static final String BRIGHT_CYAN = "\u001B[96m";

        /**
         * ANSI escape code for setting the text color to bright white color in console output.
         * This code can be used to change the color of the text displayed in the
         * console to different color. It is useful for enhancing the readability of log
         * messages or console output by using different colors for different contexts.
         */
        public static final String BRIGHT_WHITE = "\u001B[97m";
    }

    public static class Background
    {
        /**
         * ANSI escape code for setting the background color to black color in console output.
         * This code can be used to change the background color of the text displayed
         * in the console to different color. It is useful for enhancing the visual distinction
         * of log messages or console output by applying different background colors.
         */
        public static final String BLACK = "\u001B[40m";

        /**
         * ANSI escape code for setting the background color to red color in console output.
         * This code can be used to change the background color of the text displayed
         * in the console to different color. It is useful for enhancing the visual distinction
         * of log messages or console output by applying different background colors.
         */
        public static final String RED = "\u001B[41m";

        /**
         * ANSI escape code for setting the background color to green color in console output.
         * This code can be used to change the background color of the text displayed
         * in the console to different color. It is useful for enhancing the visual distinction
         * of log messages or console output by applying different background colors.
         */
        public static final String GREEN = "\u001B[42m";

        /**
         * ANSI escape code for setting the background color to yellow color in console output.
         * This code can be used to change the background color of the text displayed
         * in the console to different color. It is useful for enhancing the visual distinction
         * of log messages or console output by applying different background colors.
         */
        public static final String YELLOW = "\u001B[43m";

        /**
         * ANSI escape code for setting the background color to blue color in console output.
         * This code can be used to change the background color of the text displayed
         * in the console to different color. It is useful for enhancing the visual distinction
         * of log messages or console output by applying different background colors.
         */
        public static final String BLUE = "\u001B[44m";

        /**
         * ANSI escape code for setting the background color to magenta color in console output.
         * This code can be used to change the background color of the text displayed
         * in the console to different color. It is useful for enhancing the visual distinction
         * of log messages or console output by applying different background colors.
         */
        public static final String MAGENTA = "\u001B[45m";

        /**
         * ANSI escape code for setting the background color to cyan color in console output.
         * This code can be used to change the background color of the text displayed
         * in the console to different color. It is useful for enhancing the visual distinction
         * of log messages or console output by applying different background colors.
         */
        public static final String CYAN = "\u001B[46m";

        /**
         * ANSI escape code for setting the background color to white color in console output.
         * This code can be used to change the background color of the text displayed
         * in the console to different color. It is useful for enhancing the visual distinction
         * of log messages or console output by applying different background colors.
         */
        public static final String WHITE = "\u001B[47m";

        /**
         * ANSI escape code for setting the background color to bright black color in console output.
         * This code can be used to change the background color of the text displayed
         * in the console to different color. It is useful for enhancing the visual distinction
         * of log messages or console output by applying different background colors.
         */
        public static final String BRIGHT_BLACK = "\u001B[100m";

        /**
         * ANSI escape code for setting the background color to bright red color in console output.
         * This code can be used to change the background color of the text displayed
         * in the console to different color. It is useful for enhancing the visual distinction
         * of log messages or console output by applying different background colors.
         */
        public static final String BRIGHT_RED = "\u001B[101m";

        /**
         * ANSI escape code for setting the background color to bright green color in console output.
         * This code can be used to change the background color of the text displayed
         * in the console to different color. It is useful for enhancing the visual distinction
         * of log messages or console output by applying different background colors.
         */
        public static final String BRIGHT_GREEN = "\u001B[102m";

        /**
         * ANSI escape code for setting the background color to bright yellow color in console output.
         * This code can be used to change the background color of the text displayed
         * in the console to different color. It is useful for enhancing the visual distinction
         * of log messages or console output by applying different background colors.
         */
        public static final String BRIGHT_YELLOW = "\u001B[103m";

        /**
         * ANSI escape code for setting the background color to bright blue color in console output.
         * This code can be used to change the background color of the text displayed
         * in the console to different color. It is useful for enhancing the visual distinction
         * of log messages or console output by applying different background colors.
         */
        public static final String BRIGHT_BLUE = "\u001B[104m";

        /**
         * ANSI escape code for setting the background color to bright magenta color in console output.
         * This code can be used to change the background color of the text displayed
         * in the console to different color. It is useful for enhancing the visual distinction
         * of log messages or console output by applying different background colors.
         */
        public static final String BRIGHT_MAGENTA = "\u001B[105m";

        /**
         * ANSI escape code for setting the background color to bright cyan color in console output.
         * This code can be used to change the background color of the text displayed
         * in the console to different color. It is useful for enhancing the visual distinction
         * of log messages or console output by applying different background colors.
         */
        public static final String BRIGHT_CYAN = "\u001B[106m";

        /**
         * ANSI escape code for setting the background color to bright white color in console output.
         * This code can be used to change the background color of the text displayed
         * in the console to different color. It is useful for enhancing the visual distinction
         * of log messages or console output by applying different background colors.
         */
        public static final String BRIGHT_WHITE = "\u001B[107m";
    }
}