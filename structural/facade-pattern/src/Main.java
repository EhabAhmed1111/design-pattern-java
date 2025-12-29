import java.io.File;

public class Main {
    public static void main(String[] args) {
        /* look here no need to get object from each class
        * we just get one class  */

        VideoConversionFacade videoConversionFacade = new VideoConversionFacade();
       File mp4Video =  videoConversionFacade.convertVideo("funny-cats-video.ogg", "mp4");
        // ...
    }
}
