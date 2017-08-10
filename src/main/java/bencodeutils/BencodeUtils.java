package bencodeutils;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Utility for decoding and encoding BENCODE files.(more like a wrapper to include
 * all the functionalities)
 */
public class BencodeUtils {


    public static Element decode(byte data[]){
        BencodeDecoder decoder=new BencodeDecoder(data);
        return decoder.decode();
    }
    public static void encode(Object obj, OutputStream stream) throws IOException {
        BencodeEncoder encoder=new BencodeEncoder();
        encoder.encode(obj,stream);
    }
}
