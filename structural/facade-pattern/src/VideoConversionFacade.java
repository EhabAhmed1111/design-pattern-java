import video.*;

import java.io.File;

public class VideoConversionFacade {
    /*
    * here we do all dirty staff like
    * making object from classes
    * if its get bigger make additional facade
    * and even then you will call that facade here
    * but the beauty of it that main(client)code will be much more organized
    * and any time you need to change any class or even entire framework
    * or upgrading the app
    * do it from here
    */
    public File convertVideo(String filename, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(filename, format);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile interMediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(interMediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        // here the result file of appropriate format
        return result;
    }
}
