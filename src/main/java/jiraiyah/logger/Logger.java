package jiraiyah.logger;

import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.LoggerFactory;

import static jiraiyah.logger.LoggerConstants.*;

@SuppressWarnings({"unused"})
public class Logger
{
    private final org.slf4j.Logger logger;
    private final boolean debug;

    public Logger(String modId)
    {
        this.logger = LoggerFactory.getLogger(modId);
        debug = FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    /**
     * Logs the initialization message of the UIO mod to the console.
     * This method uses a specific ANSI color formatting for the log message
     * to enhance visibility. It outputs an info level log indicating
     * that the mod is being initialized. The colors are set to a
     * bright-yellow foreground with a pink background for emphasis.
     */
    public void logMain()
    {
        this.logger.info("\u001B[38;2;" + 255 + ";" + 255 + ";" + 0 + ";48;2;" + 255 + ";" + 0 + ";" + 127 + "m>>> Initializing {}", RESET);
    }

    /**
     * Logs a message to the console if debugging is enabled.
     * This method checks the DEBUG flag and, if true, logs the provided
     * message using an info level log. The message is formatted with
     * bright magenta text to enhance visibility in the console output.
     *
     * @param message The message to log, intended for debugging purposes.
     */
    public void log(String message)
    {
        if (this.debug)
            log(message, Foreground.BRIGHT_MAGENTA);
    }

    /**
     * Logs a message with a specified foreground color.
     *
     * @param message    The message to be logged.
     * @param foreground The color to be used for the text of the message.
     */
    public void log(String message, String foreground)
    {
        this.logger.info("{}>>> {}" + RESET, foreground, message);
    }

    /**
     * Logs a message with specified foreground and background colors.
     *
     * @param message    The message to be logged.
     * @param foreground The color to be used for the text of the message.
     * @param background The color to be used for the background of the message.
     */
    public void log(String message, String foreground, String background)
    {
        this.logger.info("{}{}>>> {}" + RESET, background, foreground, message);
    }

    /**
     * Logs an error message to the console.
     * This method logs the provided message using an info level log,
     * formatted with a bright red background and black text for emphasis.
     * It is intended for indicating error conditions or significant issues
     * that need to be brought to the user's attention.
     *
     * @param message The error message to log, intended for error tracking.
     */
    public void logError(String message)
    {
        log(message, Foreground.BLACK, Background.BRIGHT_RED);
    }

    /**
     * Logs a warning message to the console if debugging is enabled.
     * This method checks the DEBUG flag and, if true, logs the provided
     * warning message with bright yellow background and black text for visibility.
     * This is intended for indicating potential issues or important notes
     * that may require attention.
     *
     * @param message The warning message to log, aimed at alerting users
     *                to possible concerns or conditions.
     */
    public void logWarning(String message)
    {
        if (this.debug)
            log(message, Foreground.BLACK, Background.BRIGHT_YELLOW);
    }

    /**
     * Logs a general message to the console if debugging is enabled.
     * This method checks the DEBUG flag and, if true, logs the provided
     * message without any special formatting. This is useful for outputting
     * standard messages that do not require specific color coding.
     *
     * @param message The message to log, intended for general informational output.
     */
    public void logN(String message)
    {
        if (this.debug)
            this.logger.info(">>> {}", message);
    }

    /**
     * Logs a message to the console with customizable RGB color formatting
     * if debugging is enabled. This method allows the user to specify
     * the red, green, and blue color components for the message text.
     * The output will use the specified RGB values for the text color,
     * making it easier to highlight messages in a colorful manner.
     *
     * @param message The message to log, intended for informational output.
     * @param r       The red component of the text color (0-255).
     * @param g       The green component of the text color (0-255).
     * @param b       The blue component of the text color (0-255).
     */
    public void logRGB256(String message, int r, int g, int b)
    {
        if (this.debug)
            this.logger.info("\u001B[38;2;{};{};{}m>>> {}" + RESET, r, g, b, message);
    }

    /**
     * Logs a message to the console with customizable RGB color formatting
     * for both the text and the background if debugging is enabled.
     * This method allows the user to specify the red, green, and blue
     * color components for the message text color and the background color.
     * The output will use the specified RGB values, making it easy to create
     * visually distinct log messages.
     *
     * @param message The message to log, intended for informational output.
     * @param rf      The red component of the text color (0-255).
     * @param gf      The green component of the text color (0-255).
     * @param bf      The blue component of the text color (0-255).
     * @param rb      The red component of the background color (0-255).
     * @param gb      The green component of the background color (0-255).
     * @param bb      The blue component of the background color (0-255).
     */
    public void logBackRGB256(String message, int rf, int gf, int bf, int rb, int gb, int bb)
    {
        if (this.debug)
            this.logger.info("\u001B[38;2;{};{};{};48;2;{};{};{}m>>> {} " + RESET, rf, gf, bf, rb, gb, bb, message);
    }
}