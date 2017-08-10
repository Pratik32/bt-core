package exceptions;

import internal.CustomLogger;
import org.apache.log4j.Logger;

/**
 * Created by ps on 11/8/17.
 */
public class InvalidTorrentFileException extends Exception {
    Logger logger= CustomLogger.getInstance();

    public InvalidTorrentFileException(){
    }
    public void printMessage(){
        logger.error("data inside torrrent file/magnet url is not as per bencode format");
    }
}
